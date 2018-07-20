package cn.tcse.bigdap.smartqags.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 视图控制器,返回jsp视图给前端
 * 
 * @author StarZou
 * @since 2014年5月28日 下午4:00:49
 **/
@Controller
@RequestMapping("/page")
public class PageController {

    /**
     * 登录页
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * home页
     */
    @RequestMapping("/home")
    public String dashboard() {
        return "home";
    }

    /**
     * 404页
     */
    @RequestMapping("/404")
    public String error404() {
        return "404";
    }

    /**
     * 401页
     */
    @RequestMapping("/401")
    public String error401() {
        return "401";
    }

    /**
     * 500页
     */
    @RequestMapping("/500")
    public String error500() {
        return "500";
    }

    @RequestMapping("/faqset")
    public String faqset() {
        return "faqset";
    }

    @RequestMapping("/fatemplate")
    public String fatemplate() {
        return "fatemplate";
    }

    @RequestMapping("/faslot")
    public String faslot() {
        return "faslot";
    }

    @RequestMapping("/modeltrain")
    public String modeltrain() {
        return "modeltrain";
    }

    @RequestMapping("/modeltest")
    public String modeltest() {
        return "modeltest";
    }

    @RequestMapping("/modelfeedback")
    public String modelfeedback() {
        return "modelfeedback";
    }

    @RequestMapping("/releasebot")
    public String releasebot() {
        return "releasebot";
    }
}