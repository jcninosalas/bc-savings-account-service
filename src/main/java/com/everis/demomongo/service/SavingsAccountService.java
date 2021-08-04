package com.everis.demomongo.service;

import com.everis.demomongo.model.SavingsAccount;
import com.everis.demomongo.repository.SavingsAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class SavingsAccountService {

    @Autowired
    private SavingsAccountRepository repository;

    public Mono<SavingsAccount> create() {

    }


}
