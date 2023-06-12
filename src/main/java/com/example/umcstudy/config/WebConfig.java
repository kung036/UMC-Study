package com.example.umcstudy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                // allowedOrigins : 프론트 URL 설정하기(프론트 로컬, DNS, S3)
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("*")
//                .exposedHeaders("Authorization", "Refresh")
//                .allowCredentials(false)
                .allowCredentials(true) // 쿠키 정책 허용
                .maxAge(3000);

    }
}
