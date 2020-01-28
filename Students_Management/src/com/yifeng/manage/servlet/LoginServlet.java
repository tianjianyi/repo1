package com.yifeng.manage.servlet;

import com.yifeng.manage.domain.User;
import com.yifeng.manage.service.UserService;
import com.yifeng.manage.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();

        Map<String, String[]> map = request.getParameterMap();
        for(Map.Entry<String, String[]> entry : map.entrySet()){
            System.out.print("Key = "+entry.getKey()+",value="+entry.getValue());
        }
        User user = new User();

        try {
            BeanUtils.populate(user, map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println(user);
        System.out.println(user.getId() + "    "+user.getPassword());
        UserService service = new UserServiceImpl();
        User loginUser = service.login(user);
        if(loginUser != null){
            //登录成功
            session.setAttribute("user", loginUser);
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        }else {
            request.setAttribute("login_msg", "用户名或密码错误");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
