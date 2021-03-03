package org.geektimes.projects.user.web.controller;

import org.geektimes.web.mvc.controller.PageController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * week01-注册功能控制层
 * @author guozq
 * @date 2021-03-03-1:40 下午
 */
@Path("/register")
public class RegisterController implements PageController {
    
    @POST
    @Override
    public String execute(final HttpServletRequest request, final HttpServletResponse response) throws Throwable {
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        System.out.printf("user: %s, password: %s\n", user, password);
        if (user == null || password == null) {
            return "register.jsp";
        }
    
        return "success.jsp";
    }
}
