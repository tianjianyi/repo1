
package com.yifeng.manage.servlet;



import com.yifeng.manage.domain.User;
import com.yifeng.manage.service.UserService;
import com.yifeng.manage.service.impl.UserServiceImpl;

        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import java.util.List;

@WebServlet("/userListServlet")
public class UserListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserService service = new UserServiceImpl();
        List<User> users = service.findAll();
        request.setAttribute("users", users);
        request.getRequestDispatcher("/student.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
