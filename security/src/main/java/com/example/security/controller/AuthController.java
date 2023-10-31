package com.example.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workintech/auth")
public class AuthController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/register")
    public ResponseEntity<Account> registerAccount(@RequestBody Account account) {
        // Burada kullanıcı oluşturma işlemini gerçekleştirin
        // Örnek olarak, veritabanına kullanıcıyı kaydetme işlemi:
        Account createdAccount = accountService.createAccount(account);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAccount);
    }
