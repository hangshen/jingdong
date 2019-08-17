package org.lanqiao.controller;

import org.lanqiao.service.ExpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpressController {
    @Autowired
    ExpressService expressService;

    @RequestMapping("/Express/getExpress")
    public List<String> getExpress() {return expressService.getExpress();}
}
