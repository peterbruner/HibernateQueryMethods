package com.novauc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class PurchaseController {
    @Autowired
    PurchaseRepository purchases;

    @Autowired
    CustomerRepository customers;

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public String home(HttpSession session){
    }
}
