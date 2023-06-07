//package com.example.umcstudy.proxy;
//
//import java.lang.reflect.Proxy;
//
//public class MonitorFactoryBean implements FactoryBean<Object>{
//    private Class<?> interfaces;
//    private Object   target;
//
//    @Override
//    public Class<?> getObjectType() {
//        return MonitorFactoryBean.class;
//    }
//
//    @Override
//    public Object getObject() throws Exception {
//        return Proxy.newProxyInstance(getClass().getClassLoader()
//                , new Class[] {interfaces}
//                , new MonitorHandler(target)); // 에러 발생
//    }
//}