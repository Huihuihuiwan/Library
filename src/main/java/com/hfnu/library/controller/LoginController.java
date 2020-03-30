package com.hfnu.library.controller;

import com.hfnu.library.pojo.User;
import com.hfnu.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wendy_wan
 * @date 2020/2/22 12:34
 */
@Controller
@RequestMapping("/library")
public class LoginController {
    @Autowired
    UserService userService;

    @GetMapping(path = "/login")
    public String login(){
        return "login";
    }

    @GetMapping(path = "/detail")
    public String detail(Model model, HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user;
        if (username == null){
            return "login";
        }

        if (username.contains("admin")){
            user = new User(username,password);
            User u = userService.checkManager(user);
            if (u == null) {
                return "login";
            }

            model.addAttribute("user",u);
            request.getSession().setAttribute("user",u);
            return "detail_admin";

        } else {
            user = new User(username, password);
            User u = userService.checkUser(user);
            if (u == null){
                return "login";
            }
            model.addAttribute("user", u);
            request.getSession().setAttribute("user", u);
            return "detail_user";
        }
    }

    @GetMapping(path = "/homepage")
    public String homepage(Model model,HttpServletRequest request){
        User user = (User)request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "detail_user";
    }

    @GetMapping(path = "admin/homepage")
    public String adminhomepage(Model model,HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "detail_admin";
    }

}
