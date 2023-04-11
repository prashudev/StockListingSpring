package com.stackroute.Stocklisting.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// Mark data, getter and setter
@Data
@Getter
@Setter
public class Meta {

    // Declare {
    //        "symbol": "A",
    //        "interval": "1min",
    //        "currency": "USD",
    //        "exchange_timezone": "America/New_York",
    //        "exchange": "NYSE",
    //        "mic_code": "XNYS",
    //        "type": "Common Stock"
    //    } as private strings
    private String symbol;
    private String interval;
    private String currency;
    private String exchange_timezone;
    private String exchange;
    private String mic_code;
    private String type;
}
