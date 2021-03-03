package org.geektimes.projects.user.web.controller;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.service.UserService;
import org.geektimes.projects.user.service.impl.UserServiceImpl;
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
    
    private UserService userService = new UserServiceImpl();
    
    @POST
    @Override
    public String execute(final HttpServletRequest request, final HttpServletResponse response) throws Throwable {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username == null || password == null) {
            return "register.jsp";
        }
        
        User user = new User(username, password, "123", "12345678");
        if (userService.register(user)) {
            return "login.jsp";
        }
        return "success.jsp";
    }
}
