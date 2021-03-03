package org.geektimes.projects.user.web.controller;

import org.geektimes.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * week01-登录功能控制层
 * @author guozq
 * @date 2021-03-03-1:39 下午
 */
@Path("/login")
public class LoginController implements PageController {
    
    @POST
    @Override
    public String execute(final HttpServletRequest request, final HttpServletResponse response) throws Throwable {
        return "login.jsp";
    }
}
