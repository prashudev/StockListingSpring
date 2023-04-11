package com.stackroute.Stocklisting.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

// Mark class as Data, Getter and Setter
@Data
@Getter
@Setter
// Mark as entity
@Entity
public class Stock {
    // Declare variables symbol, name, currency, exchange, mic_code, country, type as private strings
    @Id
    private String symbol;
    private String name;
    private String currency;
    private String exchange;
    private String mic_code;
    private String country;
    private String type;

}
