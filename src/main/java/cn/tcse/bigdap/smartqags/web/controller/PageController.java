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
     * 首页
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

    /**
     * 数据管理——对话模板页
     */
    @RequestMapping("/faqset")
    public String faqset() {
        return "faqset";
    }

    /**
     * 数据管理——问答集页
     */
    @RequestMapping("/fatemplate")
    public String fatemplate() {
        return "fatemplate";
    }

    /**
     * 数据管理——词槽页
     */
    @RequestMapping("/faslot")
    public String faslot() {
        return "faslot";
    }

    /**
     * 模型管理——训练页
     */
    @RequestMapping("/modeltrain")
    public String modeltrain() {
        return "modeltrain";
    }

    /**
     * 模型管理——测试页
     */
    @RequestMapping("/modeltest")
    public String modeltest() {
        return "modeltest";
    }

    /**
     * 模型管理——反馈页
     */
    @RequestMapping("/modelfeedback")
    public String modelfeedback() {
        return "modelfeedback";
    }

    /**
     * 发布试用页
     */
    @RequestMapping("/releasebot")
    public String releasebot() {
        return "releasebot";
    }
}