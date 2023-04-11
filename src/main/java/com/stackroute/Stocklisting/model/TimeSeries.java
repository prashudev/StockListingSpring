package com.stackroute.Stocklisting.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

// Mark Data, Getter and Setter
@Data
@Getter
@Setter
public class TimeSeries {

    // Declare variable meta as Meta object, Values as List of value object and status as string
    private Meta meta;
    private List<Value> values;
    private String status;
}
