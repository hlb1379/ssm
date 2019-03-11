package com.sun.controller;

import com.sun.pojo.TabRoute;
import com.sun.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping
public class RouteController {


    @Autowired
    private RouteService routeService;

    @RequestMapping
    @ResponseBody
    public List<TabRoute> routeList(){
        return routeService.list();
    }

}
