package com.lzz.estatemanagement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: lzz
 * @DATE: 2022/3/20
 */
@Configuration
public class FileUploadConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //获取文件真实路径
        String path = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\fileupload\\";
        registry.addResourceHandler("fileupload/**").addResourceLocations("file:"+path);

    }
}
