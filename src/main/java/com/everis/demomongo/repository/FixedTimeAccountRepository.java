package com.everis.demomongo.repository;

import com.everis.demomongo.model.FixedTimeAccount;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FixedTimeAccountRepository extends MongoRepository<FixedTimeAccount, String> {
}
