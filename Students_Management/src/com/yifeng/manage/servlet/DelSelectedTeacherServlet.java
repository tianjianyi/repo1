package com.yifeng.manage.servlet;


import com.yifeng.manage.service.UserService;
import com.yifeng.manage.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delSelectedTeacherServlet")
public class DelSelectedTeacherServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] ids = request.getParameterValues("uid");
        UserService service = new UserServiceImpl();
        service.delSelectedTeacher(ids);
        response.sendRedirect(request.getContextPath()+"/findTeacherByPageServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
