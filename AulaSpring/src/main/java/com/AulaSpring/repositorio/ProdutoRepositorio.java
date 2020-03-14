package com.AulaSpring.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AulaSpring.demo.modelos.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {

}
