package com.yuanjunjun.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 处理登录请求
 * 1.继承HttpServlet，才能处理HTTP请求
 * 2.使用@WebServlet，说明它要处理的请求路径
 */


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("doGet -----");
    }

    @Override
    /**
     * @param HttpServletRequest req 请求: 用来获取客户端发送的数据
     * @param HttpServletResponse resp 响应: 用来给客户端返回数据
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("doPost -----");

        // 1.获取客户端发送的数据(请求参数)
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + "_" + password);

        // 2.判断
        if ("root".equals(username) && "1234".equals(password)) {
            // 登录成功
            response.getWriter().write("Login Success");
        } else {
            //登录失败
            response.getWriter().write("Login Failed");
        }
    }

}
