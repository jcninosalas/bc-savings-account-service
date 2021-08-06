package com.everis.demomongo.repository;

import com.everis.demomongo.model.SavingsAccount;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface SavingsAccountRepository extends ReactiveMongoRepository<SavingsAccount, String> {

   Mono<SavingsAccount> findByAccountNumber(String account);

   //Mono<SavingsAccount> update(String a);




}
