package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepositoty extends JpaRepository<Item, Long> {
    
}
