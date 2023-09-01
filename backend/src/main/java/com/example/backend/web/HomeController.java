package com.example.backend.web;

import com.example.backend.model.Switch;
import com.example.backend.model.User;
import com.example.backend.service.ProductService;
import com.example.backend.service.UserService;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    private final UserService userService;
    private final ProductService productService;

    public HomeController(UserService userService, ProductService productService) {
        this.userService = userService;
        this.productService = productService;
    }

    @GetMapping
    private Optional<Switch> findByName(){
       return productService.findByName("cherry mx black");
    }

    @GetMapping("/findallusers")
    private List<User> findAll(){
        return this.userService.findAll();
    }

    @GetMapping("/switches")
    private List<Switch> findAllSwitches(){
        return this.productService.findAll();
    }
}
