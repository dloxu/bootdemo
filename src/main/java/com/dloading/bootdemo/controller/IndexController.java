package com.dloading.bootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Dloading
 * @since 2019/12/18
 *
 * 首页控制器
 */

@Controller
public class IndexController {

    /**
     * 首页
     * @return
     */
    @GetMapping(value = {"/","/index"})
    public String index(){
        return "home/index";
    }

    /**
     * 商品页
     * @return
     */
    @GetMapping(value ={"/goods"})
    public String user(){
        return "site/goods";
    }
}
