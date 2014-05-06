package nogaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * User: user
 * Date: 06.05.14
 * Time: 14:56
 */
@Controller
@RequestMapping("/user")
public class UserController {

    public void saveUser(HttpServletRequest request) {
        String name = (String) request.getAttribute("name");
        String login = (String) request.getAttribute("login");
        String pass = (String) request.getAttribute("password");



    }

}
