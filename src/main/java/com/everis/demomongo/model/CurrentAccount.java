package com.everis.demomongo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class CurrentAccount extends Account {
    private int maintenanceFee;
}
