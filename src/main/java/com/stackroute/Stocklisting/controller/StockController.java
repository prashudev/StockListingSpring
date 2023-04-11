package com.stackroute.Stocklisting.controller;

import com.stackroute.Stocklisting.model.Data;
import com.stackroute.Stocklisting.model.Stock;
import com.stackroute.Stocklisting.model.TimeSeries;
import com.stackroute.Stocklisting.service.StockListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Mark as RestController
@RestController
// Mark cross origin
@CrossOrigin("*")
public class StockController {

    // Autowired StockListingService class
    @Autowired
    StockListingService stockListingService;

    // Method to get stocks by country name
    @GetMapping("/stocks/{country}")
    public ResponseEntity<?> getStocksByCountry(@PathVariable String country) {
        // Call the getStocksByCountry method from StockListingService class by passing country name as parameter
        // and store the response in List of Stock objects
        Data stocksData = stockListingService.getStocksByCountry(country);
        // Return the response as ResponseEntity
        return new ResponseEntity<>(stocksData, HttpStatus.OK);
    }

    // Controller Method to get timeseries by symbol by making call to getStocksBySymbol method of StockListingService class
    @GetMapping("/stocks/{symbol}/timeseries")
    public ResponseEntity<?> getStocksBySymbol(@PathVariable String symbol) {
        // Call the getStocksBySymbol method from StockListingService class by passing symbol as parameter
        // and store the response in List of Stock objects
        TimeSeries timeSeries = stockListingService.getStocksBySymbol(symbol);
        // Return the response as ResponseEntity
        return new ResponseEntity<>(timeSeries, HttpStatus.OK);
    }

    // Controller Method to post stock by making call to saveStock method of StockListingService class
    // Taking stock details as Requestbody
    @PostMapping("/stocks")
    public ResponseEntity<?> saveStock(@RequestBody Stock stock) {
        // Call the saveStock method from StockListingService class by passing stock object as parameter
        // and store the response in Stock object
        Stock stockResponse = stockListingService.saveStock(stock);
        // Return the response as ResponseEntity
        return new ResponseEntity<>(stockResponse, HttpStatus.OK);
    }

    // Controller Method to get all stocks by making call to getAllStocks method of StockListingService class
    @GetMapping("/stocks")
    public ResponseEntity<?> getAllStocks() {
        // Call the getAllStocks method from StockListingService class
        // and store the response in List of Stock objects
        List<Stock> stocks = stockListingService.getAllStocks();
        // Return the response as ResponseEntity
        return new ResponseEntity<>(stocks, HttpStatus.OK);
    }

}
