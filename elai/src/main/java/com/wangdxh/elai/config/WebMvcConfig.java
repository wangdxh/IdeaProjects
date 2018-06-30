package com.wangdxh.elai.config;

import com.wangdxh.elai.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebMvcConfig  implements WebMvcConfigurer {

    /*
    // 静态资源和static目录可以放置到 jar包的文件目录下
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // http://172.16.64.92:8080/js/0.ec7cee79714921e485ff.js
        // 默认它是可以访问的 找不到路径时 会去 classpath下的static，public目录去查找

        if(!registry.hasMappingForPattern("/static/**")){
            registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        }
    }*/

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/login", "/static/**", "/index.html", "/qrcode/**");
    }

}
