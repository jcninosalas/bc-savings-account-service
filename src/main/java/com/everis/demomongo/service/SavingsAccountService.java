package com.everis.demomongo.service;

import com.everis.demomongo.utils.Utils;
import com.everis.demomongo.model.SavingsAccount;
import com.everis.demomongo.repository.SavingsAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class SavingsAccountService {

    @Autowired
    private SavingsAccountRepository repository;

    public Flux<SavingsAccount> findAll() {
        return repository.findAll();
    }

    public Mono<SavingsAccount> getByAccountNumber(String accountNumber) {
        return repository.findByAccountNumber(accountNumber);
    }

    public Mono<SavingsAccount> create() {
        Mono<SavingsAccount> acc = setNewSavingsAccount();
        return acc.flatMap(repository::insert);
    }

    public Mono<SavingsAccount> update( SavingsAccount account) {
        return repository.findByAccountNumber(account.getAccountNumber())
                //.switchIfEmpty(Mono.error(new Exception("Cuenta no registrada")))
                .map(a -> {account.setId(a.getId()); return a;})
                .flatMap(repository::save);
    }

    public Mono<SavingsAccount> disable(String accountNumber) {
        return repository.findByAccountNumber(accountNumber)
                //.switchIfEmpty(Mono.error(new Exception("Cuenta no registrada")))
                .map(a -> {a.setIsActive(false); return a;})
                .flatMap(repository::save);
    }

    private Mono<SavingsAccount> setNewSavingsAccount() {
        SavingsAccount account = new SavingsAccount();
        account.setAccountNumber(Utils.generateAccountNumber());
        account.setCreatedAt(new Date());
        account.setAccountBalance(new BigDecimal(0));
        account.setMaxMonthlyTransactions(5);
        account.setIsActive(true);
        return Mono.just(account);
    }
}
