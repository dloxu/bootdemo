package com.dloading.bootdemo.controller.admin;


import com.dloading.bootdemo.model.Result;
import com.dloading.bootdemo.model.User;
import com.dloading.bootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author Dloading
 * @since 2019/12/18
 *
 * 登录控制器
 */


@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public Result login(@RequestParam("username") String username, @RequestParam("password") String password){
        User user= userService.findByUserName(username);
        ServletRequestAttributes attributes= (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (user!=null&&user.getPassword().equals(password)){
            attributes.getRequest().getSession().setAttribute("user",user);
            return new Result(true,user.getUsername());
        }
            return new Result(false,"登录失败,密码错误");


    }


    /**
     * 新用户注册
     * @param username
     * @param password
     * @return
     */
    @ResponseBody
    @RequestMapping("/register")
    public Result register(@RequestParam("username") String username,@RequestParam("password") String password){
        User user=new User(username,password);
        Result result= userService.createUser(user);
        return result;
    }

    /**
     * 注销
     * @return
     */
    @GetMapping("/logout")
    public String logout(){
        ServletRequestAttributes attributes= (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        attributes.getRequest().getSession().removeAttribute("user");
        return "home/login";
    }

    /**
     * 登录页
     * @return
     */
    @GetMapping("/login")
    public String login(){
        return "home/login";
    }

    /**
     * 注册页
     * @return
     */
    @GetMapping("/register")
    public String register(){
        return "home/register";
    }
}
