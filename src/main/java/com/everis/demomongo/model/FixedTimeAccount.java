package com.everis.demomongo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class FixedTimeAccount extends Account{
    private int monthlyTransaction;
}
