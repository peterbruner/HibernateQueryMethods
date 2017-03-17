package com.novauc;


import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface PurchaseRepository extends CrudRepository <Purchase, Integer> {
    ArrayList<Purchase> findByCategory(String category);
}
