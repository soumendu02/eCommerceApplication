package com.soumendu.eCommerceApp.service;

import com.soumendu.eCommerceApp.model.Product;
import com.soumendu.eCommerceApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo prodRepo;


    public List<Product> getAllProducts() {
        return prodRepo.findAll();
    }
}
