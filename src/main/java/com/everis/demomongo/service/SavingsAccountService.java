package com.everis.demomongo.service;

import com.everis.demomongo.model.SavingsAccount;
import com.everis.demomongo.repository.SavingsAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SavingsAccountService {

    @Autowired
    private SavingsAccountRepository repository;

    public Flux<SavingsAccount> findAll() {
        return repository.findAll();
    }

    public Mono<SavingsAccount> getById(String id) {
        return repository.findById(id);
    }

    public Mono<SavingsAccount> create(Mono<SavingsAccount> account) {
        return account.flatMap(repository::insert);
    }

    public Mono<SavingsAccount> update(Mono<SavingsAccount> account, String id) {
        return repository.findById(id)
                .doOnNext(a -> a.setId(id))
                .flatMap(repository::save);
    }
}
