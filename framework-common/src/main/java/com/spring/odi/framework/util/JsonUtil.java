package com.spring.odi.framework.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonUtil {
	private JsonUtil() {}

    private static final Gson gson = new GsonBuilder().create();  

    public static String toJson(Object obj) throws Exception {
    	if (obj == null) {
    		return null;
    	}
        return gson.toJson(obj);
    }

    public static <T> T toObject(Class<T> clazz, String json) throws Exception {
        return gson.fromJson(json, clazz);
    }

    public static <T> List<T> toList(Class<T[]> clazz, String json) throws Exception {
    	if (StringUtil.isEmpty(json)) {
    		return null;
    	}
        T[] array = gson.fromJson(json, clazz);
        return new ArrayList<T>(Arrays.asList(array));
    }

}
