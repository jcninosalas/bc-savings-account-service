package com.everis.demomongo.repository;

import com.everis.demomongo.model.CurrentAccount;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CurrentAccountRepository extends MongoRepository<CurrentAccount, String> {
}
