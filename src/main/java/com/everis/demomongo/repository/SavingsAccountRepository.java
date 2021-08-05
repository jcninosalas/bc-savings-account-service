package com.everis.demomongo.repository;

import com.everis.demomongo.model.SavingsAccount;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface SavingsAccountRepository extends ReactiveMongoRepository<SavingsAccount, String> {

   Flux<SavingsAccount> findByAccountNumber(String account);

}
