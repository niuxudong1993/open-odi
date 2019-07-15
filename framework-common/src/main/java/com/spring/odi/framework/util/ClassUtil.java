package com.spring.odi.framework.util;

import org.apache.tomcat.jni.Thread;
import org.springframework.cglib.beans.BeanMap;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import static java.lang.System.out;

@SuppressWarnings("all")
public class ClassUtil {

	public ClassUtil() {
		
	}
	public static List<Class> getAllClassByParentClass(Class clazz){
		return null;
		
	}
	public static ArrayList<Class> getAllClassByType(Class clazz){
        return null;
    }
	
    /**
     * 从一个指定路径下查找所有的类
     * @param name
     */
    @SuppressWarnings("rawtypes")
    private static ArrayList<Class> getAllClass(String packagename) {

        return null;
    }

    /**
     * 如果file是文件夹，则递归调用findClass方法，或者文件夹下的类
     * 如果file本身是类文件，则加入list中进行保存，并返回
     * @param file
     * @param packagename
     * @return
     */
    @SuppressWarnings("rawtypes")
    private static ArrayList<Class> findClass(File file,String packagename) {

        return null;
    }

}
