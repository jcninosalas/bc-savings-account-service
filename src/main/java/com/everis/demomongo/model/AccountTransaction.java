package com.everis.demomongo.model;

import lombok.Getter;
import lombok.Setter;


import java.math.BigDecimal;
import java.util.Date;


@Getter
@Setter
public class AccountTransaction {
    private String id;
    private String type;
    private BigDecimal amount;
    private Date createdAt;
}
