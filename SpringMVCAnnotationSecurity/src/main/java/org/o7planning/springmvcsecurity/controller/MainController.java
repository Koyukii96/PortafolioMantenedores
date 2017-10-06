package org.o7planning.springmvcsecurity.controller;
 
import java.security.Principal;

import org.o7planning.springmvcsecurity.dao.UserInfoDAO;
import org.o7planning.springmvcsecurity.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class MainController {
 
	@Autowired
    private UserInfoDAO userInfoDAO;
	
   @RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
   public String welcomePage(Model model) {
       model.addAttribute("title", "Bienvenido");
       model.addAttribute("message", "Esta es la pagina de Bienvenida!");
       return "welcomePage";
   }
 
   @RequestMapping(value = "/admin", method = RequestMethod.GET)
   public String adminPage(Model model) {
       return "adminPage";
   }
 
   @RequestMapping(value = "/login", method = RequestMethod.GET)
   public String loginPage(Model model ) {
      
       return "loginPage";
   }
 
   @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
   public String logoutSuccessfulPage(Model model) {
       model.addAttribute("title", "Logout");
       return "logoutSuccessfulPage";
   }
 
   @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
   public String userInfo(Model model, Principal principal) {
 
       // After user login successfully.
	   
	   
       String userName = principal.getName();
       model.addAttribute("usuario", userName);
       System.out.println("User Name: "+ userName);
       UserInfo userInfo = userInfoDAO.findUserInfo(userName);
       String rolcito = userInfo.getUser_role();       
       System.out.println("UserInfo Rol= " + userInfo.getUser_role());
       
       model.addAttribute("mensajewea", rolcito);
       
       return "userInfoPage";
   }
 
   @RequestMapping(value = "/403", method = RequestMethod.GET)
   public String accessDenied(Model model, Principal principal) {
        
       if (principal != null) {
           model.addAttribute("message", "Hola " + principal.getName()
                   + "<br> You do not have permission to access this page!");
       } else {
           model.addAttribute("msg",
                   "You do not have permission to access this page!");
       }
       return "403Page";
   }
}