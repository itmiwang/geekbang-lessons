package org.geektimes.web.mvc.dbProxy;

import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author guozq
 * @date 2021-03-03-6:01 下午
 */
public class JdkRepositoryProxy {
    
    private static Map<String, Object> repositoryMap = new ConcurrentHashMap<>();
    
    public static <T> T create(Class clazz) {
        // 查询是否之前生成过，存储的直接返回
        if (!repositoryMap.containsKey(clazz.getName())) {
            repositoryMap.put(clazz.getName(), newProxy(clazz));
        }
        return (T) repositoryMap.get(clazz.getName());
    }
    
    private static <T> T newProxy(Class clazz) {
        ClassLoader loader = JdkRepositoryProxy.class.getClassLoader();
        Class[] classes = new Class[]{clazz};
        return (T) Proxy.newProxyInstance(loader, classes, new RepositoryInvocationHandler());
    }
}
