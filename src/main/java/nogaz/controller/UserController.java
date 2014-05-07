package nogaz.controller;

import nogaz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * User: user
 * Date: 06.05.14
 * Time: 14:56
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Transactional
    @RequestMapping(method = RequestMethod.POST)
    public void saveUser(HttpServletRequest request) {
        String name = request.getParameter("name");
        String login = request.getParameter("login");
        String pass = request.getParameter("password");
        userService.create(name, login, pass);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getForm(ModelMap map) {
        return "add_user";
    }

}
