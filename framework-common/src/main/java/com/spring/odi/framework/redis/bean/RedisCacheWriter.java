package com.spring.odi.framework.redis.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.spring.odi.framework.util.CommonUtil;
import com.spring.odi.framework.util.SerializeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.serializer.RedisSerializer;

import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class RedisCacheWriter {
    private Gson gson = new Gson();
    private CommonUtil commonUtil = new CommonUtil();
    private Type type = new TypeToken<ConcurrentHashMap<String, Object>>() {}.getType();
    @Autowired
    private MyRedisTemplate redisTemplate;

    public boolean setString(String key, String value) {
        return null;
    }

    public String getString(String key){
        return null;
    }


    public boolean expire(String key, long expire) {
        return false;
    }


    public void setObjectByMap(String key,Object list,Class clas) {

    }
    public Object getObjectByMap(final String key,Type typeToken) {

        return null;
    }

    /**
     * 功能描述：从redis中获取数据
     * @param key
     * @param <T>
     * @return
     */
    public <T> T getObject(final String key){
        return null;
    }
    /**
     * 功能描述：从redis中获取keys数据
     * @param key
     * @return
     */
    public Set<String> getKeys(final String key){
        return redisTemplate.keys(key);
    }

    /**
     * 功能描述：从redis中删除key数据
     * @param key
     * @return
     */
    public void deleteDataByKey(final String key){
        redisTemplate.delete(getKeys(key));
    }

    /**
     * 功能描述：设值到redis中
     * @param key
     * @param obj
     */
    public void setObject(String key, Object obj) {

    }


    public long rPush(String key, Object obj) {

        return 0L;
    }


    public String lPop(String key) {

        return null;
    }

}