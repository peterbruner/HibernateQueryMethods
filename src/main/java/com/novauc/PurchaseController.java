package com.novauc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@Controller
public class PurchaseController {
    @Autowired
    PurchaseRepository purchases;

    @Autowired
    CustomerRepository customers;

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public String home(HttpSession session) {
    }

    @PostConstruct
    public void init() throws IOException {
        if (customers.count() == null) {
            File file = new File("customers.csv");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] lineFormatted = line.split("\\,");
                Customer customer = new Customer(lineFormatted[0], lineFormatted[1]);
                customers.save(customer);

            }
        }
        if (purchases.count() == null) {
            File file = new File("purchases.csv");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] lineFormatted = line.split("\\,");
                Purchase purchase = new Purchase(Integer.valueOf(lineFormatted[0]), lineFormatted[1], Integer.valueOf(lineFormatted[2]),
                        Integer.valueOf(lineFormatted[3]), lineFormatted[4]);
                purchases.save(purchase);
            }
        }
    }
}