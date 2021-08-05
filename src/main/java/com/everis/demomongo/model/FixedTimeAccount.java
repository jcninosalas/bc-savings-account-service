package com.everis.demomongo.model;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class FixedTimeAccount extends Account{
    private int monthlyTransaction;
}
