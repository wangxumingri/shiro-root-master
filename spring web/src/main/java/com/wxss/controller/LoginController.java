package com.wxss.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class LoginController {
    private static final Logger LOG   = LoggerFactory.getLogger(LoginController.class);


    @RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(Model model,String name, String password) {
        LOG.info("com.wxss.controller.LoginController#login:{},{}",name,password);


        Subject subject = SecurityUtils.getSubject();  
        UsernamePasswordToken token = new UsernamePasswordToken(name, password);  
        try {  
            subject.login(token);
            Session session=subject.getSession();
            session.setAttribute("subject", subject);
            return "redirect:index";
            
        } catch (AuthenticationException e) {  
            model.addAttribute("error", "验证失败");  
            return "login"; 
        }  
	}
	


}
