package com.handler;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by zr on 2018/5/7.
 */
@Controller
public class UserHandler {
    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/login.handler")
    public ModelAndView login(User user, HttpServletRequest req){
        User user1 = userService.queryByUsername(user);
        ModelAndView mv = new ModelAndView();
        if (user1!=null){
            String username = user1.getUsername();
            req.getSession().setAttribute("username",username);
            mv.setViewName("index");
        }else{
            System.out.println("用户名或密码错误");
            mv.setViewName("login");
        }
        return mv;
    }
    @RequestMapping("/queryAll.handler")
    public ModelAndView queryAll(User user, HttpServletRequest req){
        List<User> user1 = userService.queryAll();
        req.getSession().setAttribute("userList", user1);
        ModelAndView mv = new ModelAndView();
        mv.addObject("userList", user1);
        mv.setViewName("index");
        return mv;
    }
}
