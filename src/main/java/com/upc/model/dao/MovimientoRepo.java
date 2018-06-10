package com.upc.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.upc.model.entity.Movimiento;

public interface MovimientoRepo extends JpaRepository<Movimiento, Long> {

	@Query("select m from Movimiento where m.cuenta.id=?1")
	public List<Movimiento> listarporcuenta();
}
