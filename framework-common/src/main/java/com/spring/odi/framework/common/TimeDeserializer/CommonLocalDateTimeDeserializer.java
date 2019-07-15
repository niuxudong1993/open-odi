package com.spring.odi.framework.common.TimeDeserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.spring.odi.framework.util.PropertiesUtil;
import com.spring.odi.framework.util.StringUtil;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * 作者 27587
 * 描述 TODO
 * 创建时间 2019/7/1018:41
 **/
public class CommonLocalDateTimeDeserializer extends JSR310DateTimeDeserializerBase<LocalDateTime> {
    private static final long serialVersionUID = 1L;
    private static final DateTimeFormatter DEFAULT_FORMATTER;

    private CommonLocalDateTimeDeserializer() {
        this(DEFAULT_FORMATTER);
    }

    public CommonLocalDateTimeDeserializer(Class<LocalDateTime> supportedType, DateTimeFormatter f) {
        super(supportedType, f);
    }

    public CommonLocalDateTimeDeserializer(String  formatterPattern) {
        super(LocalDateTime.class, DateTimeFormatter.ofPattern(formatterPattern));
    }
    public CommonLocalDateTimeDeserializer(DateTimeFormatter  formatterPattern) {
        super(LocalDateTime.class, formatterPattern);
    }

    @Override
    protected JsonDeserializer<LocalDateTime> withDateFormat(DateTimeFormatter formatter) {
        return new CommonLocalDateTimeDeserializer(formatter);
    }

    @Override
    public LocalDateTime deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        if (parser.hasTokenId(6)) {
            String string = parser.getText().trim().replace("/", "-");//yyyy/MM/dd替换为yyyy-MM-dd
            if (string.length() == 0) {
                return null;
            }
            try {
                if (this._formatter == DEFAULT_FORMATTER && string.length() > 10 && string.charAt(10) == 'T') {
                    return string.endsWith("Z") ? LocalDateTime.ofInstant(Instant.parse(string), ZoneOffset.UTC) : LocalDateTime.parse(string, DEFAULT_FORMATTER);
                } else if (string.length() > 10 && string.charAt(10) == 'T') { //处理yyyy-MM-ddTHH:mm:ss.sssZ的格式
                    return string.endsWith("Z") ? LocalDateTime.ofInstant(Instant.parse(string), ZoneOffset.UTC) : LocalDateTime.parse(string, DEFAULT_FORMATTER);
                } else if (string.length() == 10) {//处理yyyy-MM-dd的格式
                    return LocalDateTime.parse(string + " 00:00:00", this._formatter);
                } else {//配置第三步的时候，设置了时间格式为：yyyy-MM-dd HH:mm:ss
                    return LocalDateTime.parse(string, this._formatter);
                }
            } catch (DateTimeException var12) {
                return this._handleDateTimeException(context, var12, string);
            }
        } else {
            if (parser.isExpectedStartArrayToken()) {
                JsonToken t = parser.nextToken();
                if (t == JsonToken.END_ARRAY) {
                    return null;
                }

                LocalDateTime result;
                if ((t == JsonToken.VALUE_STRING || t == JsonToken.VALUE_EMBEDDED_OBJECT) && context.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                    result = this.deserialize(parser, context);
                    if (parser.nextToken() != JsonToken.END_ARRAY) {
                        this.handleMissingEndArrayForSingle(parser, context);
                    }

                    return result;
                }

                if (t == JsonToken.VALUE_NUMBER_INT) {
                    int year = parser.getIntValue();
                    int month = parser.nextIntValue(-1);
                    int day = parser.nextIntValue(-1);
                    int hour = parser.nextIntValue(-1);
                    int minute = parser.nextIntValue(-1);
                    t = parser.nextToken();
                    if (t == JsonToken.END_ARRAY) {
                        result = LocalDateTime.of(year, month, day, hour, minute);
                    } else {
                        int second = parser.getIntValue();
                        t = parser.nextToken();
                        if (t == JsonToken.END_ARRAY) {
                            result = LocalDateTime.of(year, month, day, hour, minute, second);
                        } else {
                            int partialSecond = parser.getIntValue();
                            if (partialSecond < 1000 && !context.isEnabled(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS)) {
                                partialSecond *= 1000000;
                            }

                            if (parser.nextToken() != JsonToken.END_ARRAY) {
                                throw context.wrongTokenException(parser, this.handledType(), JsonToken.END_ARRAY, "Expected array to end");
                            }

                            result = LocalDateTime.of(year, month, day, hour, minute, second, partialSecond);
                        }
                    }

                    return result;
                }

                context.reportInputMismatch(this.handledType(), "Unexpected token (%s) within Array, expected VALUE_NUMBER_INT", new Object[]{t});
            }

            if (parser.hasToken(JsonToken.VALUE_EMBEDDED_OBJECT)) {
                return (LocalDateTime)parser.getEmbeddedObject();
            } else {
                if (parser.hasToken(JsonToken.VALUE_NUMBER_INT)) {
                    this._throwNoNumericTimestampNeedTimeZone(parser, context);
                }

                return (LocalDateTime)this._handleUnexpectedToken(context, parser, "Expected array or string.", new Object[0]);
            }
        }
    }
    static {
        String pattern = PropertiesUtil.getProperty("localTime.formatter");
        if (StringUtil.isEmpty(pattern)) {
            pattern="yyyy-MM-dd HH:mm:ss";
        }
        DEFAULT_FORMATTER = DateTimeFormatter.ofPattern(pattern);
    }
}
