package dev.wande.jdbcauth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {

    @GetMapping("/")
    public String helloUser(Principal principal) {
        return "Hello, " + principal.getName().toUpperCase();
    }

    @GetMapping("admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String helloAdmin(Principal principal) {
        return "Hello, Admin " + principal.getName().toUpperCase();
    }
}
