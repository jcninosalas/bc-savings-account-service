package com.everis.demomongo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Getter
@Setter
public class SavingsAccount extends Account {
    private int maxMonthlyTransactions; //definir un maximo mensual
}
