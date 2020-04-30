package com.kmcm.calculator.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.Charset;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    //解决跨域问题
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping( "/**" ).allowedOrigins( "*" ).allowedMethods( "*" ).allowedHeaders( "*" );
    }


    @Bean
    public HttpMessageConverter<String> responseBodyConverter() {
        return new StringHttpMessageConverter( Charset.forName("UTF-8"));
    }






}
