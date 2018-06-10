package com.upc.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upc.model.entity.Cliente;

public interface ClienteRepo extends JpaRepository<Cliente, Long>{

}
