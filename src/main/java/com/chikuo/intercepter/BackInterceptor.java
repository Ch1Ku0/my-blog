package com.chikuo.intercepter;

import com.chikuo.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BackInterceptor implements HandlerInterceptor {

    private static String username = "admin";
    private static String password = "123";

    /**
     * 后台拦截器
     * 说明：对/admin开头的地址进行拦截，必须经过验证之后才能够访问
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag = true;
//        User user = (User) request.getSession().getAttribute("user");
//        if(null == user) {
//            // 如果用户为空则跳转到error页面
//            // 目的是保证地址栏不改变（与前台错误页面响应一致），这样用户就不知道后台页面的地址
//            request.getRequestDispatcher(request.getContextPath() + "/error.html").forward(request, response);
//            flag = false;
//
//        } else {
//            // 对用户账号进行验证,是否正确
//            if(user.getUsername().equals(username) && user.getPassword().equals((password))) {
//                System.out.println("访问后台API");
//                flag = true;
//            } else {
//                flag = false;
//            }
//        }
        return true;
    }
}
