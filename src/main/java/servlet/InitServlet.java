package servlet;

import domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.List;

/**
 * \Date: 2018/1/14
 * \
 * \Description:
 * \
 */
@WebServlet(name = "InitServlet",urlPatterns = "/InitServlet",loadOnStartup = 2)
public class InitServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        List<User> list=new ArrayList<User>();
        this.getServletContext().setAttribute("list",list);


    }
}
