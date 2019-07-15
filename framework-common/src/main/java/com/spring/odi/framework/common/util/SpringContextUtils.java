package com.spring.odi.framework.common.util;


import com.spring.odi.framework.oauth.bean.PortalUserInfoBean;
import com.spring.odi.framework.oauth.bean.PortalUserInfoObjBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

/**
 * @author hongsir 2017-11-03 19:36
 * @apiNote spring上下文工具类，用于普通类调用springIOC中的对象
 */
@Component
public class SpringContextUtils implements ApplicationContextAware {
    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (SpringContextUtils.applicationContext == null) {
            SpringContextUtils.applicationContext = applicationContext;
        }
    }

    /**
     * @apiNote 获取applicationContext
     * @author hongsir 2017/11/3 19:40:00
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * @apiNote 通过name获取 Bean.
     * @author hongsir 2017/11/3 19:39:00
     */
    public static Object getBean(String name) {
        try {
            return getApplicationContext().getBean(name);
        }catch (Exception e) {
            return null;
        }
    }

    /**
     * @apiNote 通过class获取Bean.
     * @author hongsir 2017/11/3 19:39:00
     */
    public static <T> T getBean(Class<T> clazz) {
        return getApplicationContext().getBean(clazz);
    }

    /**
     * @apiNote 通过name, 以及Clazz返回指定的Bean
     * @author hongsir 2017/11/3 19:39:00
     */
    public static <T> T getBean(String name, Class<T> clazz) {
        return getApplicationContext().getBean(name, clazz);
    }

    public <T>  void registerBean(Class<T> cls,String beanName,Object obj,ApplicationContext context) {
        if (applicationContext != null) {
            context = applicationContext;
        }
        ConfigurableApplicationContext configurableApplicationContext = (ConfigurableApplicationContext) context;

        // 获取bean工厂并转换为DefaultListableBeanFactory
        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) configurableApplicationContext.getBeanFactory();

        // 通过BeanDefinitionBuilder创建bean定义
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(cls);
        // 注册bean
        defaultListableBeanFactory.registerSingleton(beanName,obj);
    }
    public <T> void registerBean(Class<T> cls,String beanName,Object obj) {
        if (applicationContext == null) {
            return;
        }
        ApplicationContext context = applicationContext;
        ConfigurableApplicationContext configurableApplicationContext = (ConfigurableApplicationContext) context;

        // 获取bean工厂并转换为DefaultListableBeanFactory
        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) configurableApplicationContext.getBeanFactory();

        // 通过BeanDefinitionBuilder创建bean定义
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(cls);
        // 注册bean
        defaultListableBeanFactory.registerSingleton(beanName,obj);
    }

    public static PortalUserInfoBean getCurrentUser() {

        Object authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null) {
            return  null;
        }
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof PortalUserInfoObjBean) {

            return ((PortalUserInfoObjBean) principal).getUserInfoBean();

        }
        return null;

    }
}
