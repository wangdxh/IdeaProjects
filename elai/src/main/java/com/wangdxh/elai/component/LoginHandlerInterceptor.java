package com.wangdxh.elai.component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wangdxh.elai.bean.MyResponse;
import com.wangdxh.elai.bean.User;
import com.wangdxh.elai.utils.myjwt;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/*
    对登陆进行请求
* */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    // 目标方法执行之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        MyResponse myresp = MyResponse.unauthorized();
        String auth = request.getHeader("Authorization");
        if ((auth != null))
        {
            if ((auth.length() > 7))
            {
                String[] params = auth.split("\\s+");
                String HeadStr = auth.substring(0, 6).toLowerCase();
                if (params.length == 2 && params[0].toLowerCase().compareTo("bearer") == 0)
                {
                    User usr = myjwt.unsign(params[1], User.class);
                    if (usr != null)
                    {
                        System.out.println(usr);
                        return true;
                    }
                }
            }
            myresp.setMessage("bad Authorization");
        }
        else {
            myresp.setMessage("no Authorization header");
        }

        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json; charset=utf-8");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

        PrintWriter out = response.getWriter();
        ObjectMapper mapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        out.write(mapper.writeValueAsString(myresp));
        out.close();
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
