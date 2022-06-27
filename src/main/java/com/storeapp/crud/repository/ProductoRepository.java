package com.storeapp.crud.repository;

import com.storeapp.crud.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Repository
@CrossOrigin("http://localhost:4200")
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    Optional<Producto> findByName(String nombre);
    boolean existsByName(String nombre);

    //Spring realizara una consulta SQL similar a: SELECT * FROM Product p WHERE p.name LIKE CONCAT('%', :name, '%')
    List<Producto> findByNameContaining(@RequestParam("name") String name);

}
