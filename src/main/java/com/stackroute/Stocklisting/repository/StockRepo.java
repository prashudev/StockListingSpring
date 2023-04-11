package com.stackroute.Stocklisting.repository;

import com.stackroute.Stocklisting.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Mark as Repository interface
// StockRepo to extend JpaRepository
@Repository
public interface StockRepo extends JpaRepository<Stock, String> {
}
