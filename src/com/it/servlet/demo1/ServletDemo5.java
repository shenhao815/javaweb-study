package com.it.servlet.demo1;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author ch
 * @date 2021-2-5
 */
public class ServletDemo5 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1 获取文件的MIME的类型：
        // 获得ServletContext
        ServletContext context = this.getServletContext();
        String mimeType = context.getMimeType("aa.txt");
        System.out.println(mimeType);

        // 2 获取请求路径的工程名：
        String contextPath = context.getContextPath();
        System.out.println(contextPath);

        // 3 获得全局初始化参数：
        String contextname = context.getInitParameter("contextname");
        String contextname2 = context.getInitParameter("contextname2");
        System.out.println(contextname + "     "+contextname2);
        Enumeration<String> names = context.getInitParameterNames();
        while (names.hasMoreElements()) {
            String name = names.nextElement();
            String value = context.getInitParameter(name);
            System.out.println("-----> "+name +"    "+value);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
