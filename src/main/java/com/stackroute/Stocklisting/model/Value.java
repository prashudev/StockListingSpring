package com.stackroute.Stocklisting.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// Mark data, getter and setter
@Data
@Getter
@Setter
public class Value {

    // Declare
//    {
//        "datetime": "2023-04-04 15:59:00",
//            "open": "138.06500",
//            "high": "138.32001",
//            "low": "138.06000",
//            "close": "138.23000",
//            "volume": "74039"
//    } as private strings
    private String datetime;
    private String open;
    private String high;
    private String low;
    private String close;
    private String volume;


}
