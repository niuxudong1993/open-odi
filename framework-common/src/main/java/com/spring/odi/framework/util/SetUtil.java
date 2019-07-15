package com.spring.odi.framework.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public final class SetUtil {
private SetUtil() {}
    
    public static boolean isEmpty(Object[] array) {
        return array == null || array.length <= 0;
    }
    
    public static boolean isEmpty(List<?> list) {
        return list == null || list.size() <= 0;
    }
    
    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.size() <= 0;
    }
    
    public static boolean isEmpty(Set<?> set) {
        return set == null || set.size() <= 0;
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] toArray(T... array) {
        if (isEmpty(array)) {
            return null;
        }

        List<T> list = new ArrayList<T>();
        for (T t : array) {
            if (t != null) {
                list.add(t);
            }
        }
        if (isEmpty(list)) {
            return null;
        }

        return list.toArray((T[]) Array.newInstance(list.get(0).getClass(), list.size()));
    }
    
    @SafeVarargs
    public static <T> List<T> combine(List<T>...lists) {
        if (isEmpty(lists)) {
            return null;
        }

        List<T> all = new ArrayList<T>();
        for (List<T> list : lists) {
            if (isEmpty(list)) {
                continue;
            }
            all.addAll(list);
        }
        return isEmpty(all) ? null : all;
    }
    public static void main(String[] args) {
    	List<String> teStrings= new ArrayList<>();
    	List<String> strings= new ArrayList<>();
    	strings.add("a");
    	List<String> list = combine(teStrings,strings);
    	System.out.println(list.size());
	}
}
