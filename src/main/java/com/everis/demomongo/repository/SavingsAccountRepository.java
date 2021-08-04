package com.everis.demomongo.repository;

import com.everis.demomongo.model.SavingsAccount;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface SavingsAccountRepository extends ReactiveCrudRepository<SavingsAccount, String> {

    Flux<SavingsAccount> findByAccountNumber(String account);

}
