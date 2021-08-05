package com.everis.demomongo.controller;

import com.everis.demomongo.model.SavingsAccount;
import com.everis.demomongo.service.SavingsAccountService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.actuate.endpoint.web.annotation.WebEndpoint;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController()
public class AccountController {

    @Autowired
    private SavingsAccountService service;

    @PostMapping("/accounts/create")
    public Mono<SavingsAccount> create(@RequestBody Mono<SavingsAccount> account) {
        return service.create(account);
    }

    @GetMapping("/accounts/find")
    public Mono<SavingsAccount> getById(@RequestParam String id) {
        return service.getById(id);
    }

    @GetMapping("/accounts")
    public Flux<SavingsAccount> getAll(){
        return service.findAll();
    }
}
