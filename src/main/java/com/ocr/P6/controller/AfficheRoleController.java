package com.ocr.P6.controller;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AfficheRoleController {


    /**
     * Méthode qui va permettre d'afficher un utilisateur avec son role
     */

    @RequestMapping(value = "/getLogedUser")
    public Map<String, Object> recupererLogUser(HttpServletRequest httpServletRequest){
        HttpSession httpSession=httpServletRequest.getSession();
        SecurityContext securityContext=(SecurityContext)
                httpSession.getAttribute("SPRING_SECURITY_CONTEXT");
        String username=securityContext.getAuthentication().getName();
        List<String> roles=new ArrayList<>();
        for(GrantedAuthority ga:securityContext.getAuthentication().getAuthorities()){
            roles.add(ga.getAuthority());
        }

    Map<String, Object> params=new HashMap<>();
        params.put("username", username);
        params.put("roles",roles);
        return params;

    }








}

