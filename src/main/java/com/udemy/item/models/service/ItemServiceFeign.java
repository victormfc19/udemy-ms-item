package com.udemy.item.models.service;

import com.udemy.item.clientes.ProductoClienteRest;
import com.udemy.item.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Primary
public class ItemServiceFeign implements ItemService{

    @Autowired
    private ProductoClienteRest productoFeign;

    @Override
    public List<Item> findAll() {
        return productoFeign.listar().stream().map(p -> new Item(p, 3)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer cantidad) {
        return new Item(productoFeign.detalle(id), cantidad);
    }
}
