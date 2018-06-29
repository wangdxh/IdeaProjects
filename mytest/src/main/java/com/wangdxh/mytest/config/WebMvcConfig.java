package com.wangdxh.mytest.config;

import com.wangdxh.mytest.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.*;

import java.io.File;

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
                .excludePathPatterns("/vue-admin/user/login", "/static/**", "/index.html");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*")
        .allowedMethods("GET", "HEAD", "POST","PUT", "DELETE", "OPTIONS").allowCredentials(true);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //直接字符串会解析为模板名称
        registry.addViewController("/wangxh").setViewName("forward:/hello/wangxh/aaa");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
}
