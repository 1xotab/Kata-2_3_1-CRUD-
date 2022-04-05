package hiber.controller;

import hiber.dao.UserDao;
import hiber.models.User;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    @Autowired
    public UserDao userDao;

    @RequestMapping("/")
    public String showAllUsers(Model model) {
        List<User> list = userDao.listUsers();

        model.addAttribute("attribute", list);

        return "show";
    }

    @RequestMapping("/addNewUser")
    public String addNewUser(Model model) {

        User user = new User();
        model.addAttribute("add",user);

        return "addLink";
    }

    @RequestMapping("/hello")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }
}
