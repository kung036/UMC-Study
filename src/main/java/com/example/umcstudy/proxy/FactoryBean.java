//package com.example.umcstudy.proxy;
//
//import org.springframework.context.annotation.Configuration;
//
//public interface FactoryBean<T> {
//    // Bean 객체를 생성하고 반환
//    T getObject() throws Exception;
//
//    // FactoryBean에 의해 생성된 객체의 Type
//    Class<?> getObjectType();
//
//    // getObject()의 반환된 객체의 싱글톤 여부
//    default boolean isSingleton() {
//        return true;
//    }
//}
