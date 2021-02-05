package com.it.servlet.demo1;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @author ch
 * @date 2021-2-5
 */
public class ServletDemo6 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // test1();
        // test2();
        test3();

    }
    private void test3() throws IOException {
        // 传统方式
        Properties properties = new Properties();

        ServletContext context = this.getServletContext();
        String path = context.getRealPath("/WEB-INF/classes/db.properties");
        InputStream is = new FileInputStream(path);
        properties.load(is);
        // 获取数据
        String driverClassName = properties.getProperty("driverClassName");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println(driverClassName);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
    }

    private void test2() throws IOException {
        // 传统方式
        Properties properties = new Properties();

        ServletContext context = this.getServletContext();
        InputStream is = context.getResourceAsStream("/WEB-INF/classes/db.properties");

        properties.load(is);
        // 获取数据
        String driverClassName = properties.getProperty("driverClassName");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println(driverClassName);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
    }

    private void test1() throws IOException {
        // 传统方式
        Properties properties = new Properties();
        // 创建一个文件的输入流
        InputStream is = new FileInputStream("classes/db.properties");
        properties.load(is);
        // 获取数据
        String driverClassName = properties.getProperty("driverClassName");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println(driverClassName);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
