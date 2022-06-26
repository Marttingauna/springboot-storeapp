package com.storeapp.crud.service;

import com.storeapp.crud.entity.Producto;
import com.storeapp.crud.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public List<Producto> list(){
        return productoRepository.findAll();
    }

    public Optional<Producto> getOne(Integer id){
        return productoRepository.findById(id);
    }

    public Optional<Producto> getByNombre(String name){
        return productoRepository.findByName(name);
    }

    public void save(Producto producto){
        productoRepository.save(producto);
    }

    public void delete(Integer id){
        productoRepository.deleteById(id);
    }

    public boolean existsByIdd(Integer id){
        return productoRepository.existsById(id);
    }

    public boolean existsByNombre(String name){
        return productoRepository.existsByName(name);
    }

    public Optional<Producto> findByName(String name){ return productoRepository.findByNameContaining(name); }
}
