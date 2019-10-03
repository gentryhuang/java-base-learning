package com.design.pattern.singleton.containersingleton;


import org.apache.commons.lang3.StringUtils;
import org.springframework.util.ObjectUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ContainerSingleton  容器单例模式
 *
 * 统一管理多个实例，节省资源
 *
 * @author shunhua
 * @date 2019-10-03
 */
public class ContainerSingleton {
    /**
     * 存放对象，相当于一个缓存
     */
    private static Map<String,Object> SINGLETON_MAP = new ConcurrentHashMap<>();

    /**
     * 多线程情况下不安全，可能导致值的覆盖
     * @param key
     * @param instance
     */
    public static void putInstance(String key,Object instance){
        if(StringUtils.isNotBlank(key) && !ObjectUtils.isEmpty(instance)){
            if(!SINGLETON_MAP.containsKey(key)){
                SINGLETON_MAP.put(key,instance);
            }
        }
    }

    /**
     * 获取对象
     * @param key
     * @return
     */
    public static Object getInstance(String key){
        return SINGLETON_MAP.get(key);
    }


}