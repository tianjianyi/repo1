package com.yifeng.manage.servlet;



import com.yifeng.manage.domain.PageBean;
import com.yifeng.manage.domain.User;
import com.yifeng.manage.service.UserService;
import com.yifeng.manage.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/findUserByPageServlet")
public class FindUserByPageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String currentPage = request.getParameter("currentPage");
        String rows = request.getParameter("rows");
        if(currentPage == null || "".equals(currentPage)){
            currentPage = "1";
        }
        if(rows == null || "".equals(currentPage)){
            rows = "5";
        }
        Map<String, String[]> condition = request.getParameterMap();
        UserService service = new UserServiceImpl();
        PageBean<User> pb =service.findUserByPage(currentPage, rows, condition);
        //System.out.println("----"+pb);
        request.setAttribute("pb", pb);
        request.setAttribute("condition", condition);
        request.getRequestDispatcher("/student.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
