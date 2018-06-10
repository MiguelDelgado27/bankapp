package com.upc.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.upc.model.entity.Cuenta;

public interface CuentaRepo extends JpaRepository<Cuenta, Long> {

	@Query("select c from Cuenta where c.cliente.id=?1")
	public List<Cuenta> buscarporcliente(Long id);
	
}
