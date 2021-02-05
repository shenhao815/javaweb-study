package com.it.servlet.demo1.com.it.response.demo1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ch
 * @date 2021-2-5
 */
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("12111111");
        // resp.setStatus(404);
        // resp.setStatus(302);
        // resp.setHeader("Location","/javaweb_study/ResponseDemo2");

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("responsedemo1 execute....");
        resp.setHeader("Refresh","5;url=/javaweb_study/ResponseDemo2");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
