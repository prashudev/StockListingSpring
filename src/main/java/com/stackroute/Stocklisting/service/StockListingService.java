package com.stackroute.Stocklisting.service;

import com.stackroute.Stocklisting.model.Data;
import com.stackroute.Stocklisting.model.Stock;
import com.stackroute.Stocklisting.model.TimeSeries;
import com.stackroute.Stocklisting.repository.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

// Mark class as service
@Service
public class StockListingService {

    // Spring Autowired StockRepo Interface
    @Autowired
    StockRepo stockRepo;

    // Method to call https://api.twelvedata.com/stocks?country=${country} by passing country name as parameter
    // and return a Data object
    public Data getStocksByCountry(String country) {
        // Create a RestTemplate object
        RestTemplate restTemplate = new RestTemplate();
        // Call the https://api.twelvedata.com/stocks?country=${country} by passing country name as parameter
        // and store the response in Data object
        Data stocksData = restTemplate.getForObject("https://api.twelvedata.com/stocks?country=" + country, Data.class);
        // Return the response
        return stocksData;
    }

    // Method to call https://api.twelvedata.com/time_series?symbol=${symbol}&interval=1min&apikey=0975893c35e04bc59419ad713796a678&outputsize=20 by passing symbol as parameter
    // and return a TimeSeries object
    public TimeSeries getStocksBySymbol(String symbol) {
        // Create a RestTemplate object
        RestTemplate restTemplate = new RestTemplate();
        // Call the https://api.twelvedata.com/time_series?symbol=${symbol}&interval=1min&apikey=0975893c35e04bc59419ad713796a678&outputsize=20 by passing symbol as parameter
        // and store the response in TimeSeries object
        TimeSeries timeSeries = restTemplate.getForObject("https://api.twelvedata.com/time_series?symbol=" + symbol + "&interval=1min&apikey=0975893c35e04bc59419ad713796a678&outputsize=20", TimeSeries.class);
        // Return the response
        return timeSeries;
    }

    // Method to store stock details in database and return stock
    public Stock saveStock(Stock stock) {
        // Call the save method from StockRepo interface by passing stock object as parameter
        // and store the response in Stock object
        Stock stockResponse = stockRepo.save(stock);
        // Return the response
        return stockResponse;
    }

    // Method to get all stocks from database
    public List<Stock> getAllStocks() {
        // Call the findAll method from StockRepo interface
        // and store the response in List of Stock objects
        List<Stock> stocks = stockRepo.findAll();
        // Return the response
        return stocks;
    }
}
