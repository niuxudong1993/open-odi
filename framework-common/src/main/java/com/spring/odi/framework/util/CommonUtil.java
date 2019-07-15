package com.spring.odi.framework.util;

import com.alibaba.fastjson.TypeReference;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jdom2.*;
import org.jdom2.input.SAXBuilder;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class CommonUtil {
    public static String getJsonStr(List<Object> list, List<String> jsonAttrs) {

        return null;
    }
    public static void copyFile(File source, File dest) throws IOException {

    }
    public <T> Type getType(Class<T> t) {
        return null;
    }
    public <T> Type getType(Class<T> subClass,Class ... others) {
        return null;
    }
    public  static <T> TypeReference getTypes(Class<T> t) {
        return null;
    }
    public <T> List<T> getObjectByMap(String json,Class<T> clas,Type typeToken) {
        return null;
    }
    public static String getJsonStr(List<String> list) {
        return null;
    }
    public static String getNonNullStr(Object obj) {
        return "";
    }

    public static List<Element> getElements(String nodeName, Element rootElement) {
        return null;
    }
    public static Map<String,String> getXmlNodeValue(String result, String nodeName) {
        return null;
    }
    public static String getJsonStr(String ...strs) {
        return getJsonStr(Arrays.asList(strs));
    }

}
