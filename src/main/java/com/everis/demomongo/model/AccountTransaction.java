package com.everis.demomongo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Document
@Getter
@Setter
public class AccountTransaction {
    @Id
    private String id;
    private String type;
    private BigDecimal amount;
    private Date createdAt;
}
