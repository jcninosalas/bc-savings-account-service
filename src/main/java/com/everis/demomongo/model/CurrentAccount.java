package com.everis.demomongo.model;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class CurrentAccount extends Account {
    private int maintenanceFee;
}
