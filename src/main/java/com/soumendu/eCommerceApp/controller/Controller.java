package com.soumendu.eCommerceApp.controller;

import com.soumendu.eCommerceApp.model.Product;
import com.soumendu.eCommerceApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173/")
public class Controller {

    @Autowired
    private ProductService prodService;

    @GetMapping("/products")
    public List<Product> hello(){
        return  prodService.getAllProducts();
    }
}
