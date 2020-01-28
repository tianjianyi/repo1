package com.yifeng.manage.servlet;



import com.yifeng.manage.domain.Course;
import com.yifeng.manage.domain.Teacher;
import com.yifeng.manage.service.UserService;
import com.yifeng.manage.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/courseListServlet")
public class CourseListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserService service = new UserServiceImpl();
        List<Course> courses = service.findAllCourse();
//        System.out.println("-------------");
//        System.out.println(teachers);
        request.setAttribute("courses", courses);
        request.getRequestDispatcher("/course.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
