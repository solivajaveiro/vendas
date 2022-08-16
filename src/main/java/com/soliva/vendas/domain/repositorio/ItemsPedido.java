package com.soliva.vendas.domain.repositorio;

import com.soliva.vendas.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
