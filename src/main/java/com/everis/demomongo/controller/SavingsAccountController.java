package com.everis.demomongo.controller;

import com.everis.demomongo.model.SavingsAccount;
import com.everis.demomongo.service.SavingsAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController()
public class SavingsAccountController {

    @Autowired
    private SavingsAccountService service;

    @PostMapping("/s-account/new")
    public Mono<?> createAccount() {
        return service.create();
    }

    @GetMapping("/s-account/find")
    public Mono<SavingsAccount> getAccountById(@RequestParam String account) {
        return service.getByAccountNumber(account);
    }

    @GetMapping("/s-account")
    public Flux<SavingsAccount> getAllAccounts(){
        return service.findAll();
    }

    @PutMapping("/s-account/disable")
    public Mono<SavingsAccount> disableAccount(@RequestParam String account) {
        return service.disable(account);
    }

    @PutMapping("/s-account/update")
    public Mono<SavingsAccount> updateAccount(@RequestBody SavingsAccount account) {
        return service.update(account);
    }
}
