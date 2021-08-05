package com.everis.demomongo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Document
@Getter
@Setter
public class Account {

    @Id
    private String id;
    private String accountNumber;
    private BigDecimal accountBalance;
    private Boolean isActive;
    private List<AccountTransaction> transactions;
    private Date createdAt;
    private Date modifiedAt;
}
