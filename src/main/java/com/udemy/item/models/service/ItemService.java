package com.udemy.item.models.service;

import com.udemy.item.models.Item;

import java.util.List;

public interface ItemService {

    public List<Item> findAll();
    public Item findById(Long id, Integer cantidad);
}
