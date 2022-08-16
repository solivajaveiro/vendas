package com.soliva.vendas.service;

import com.soliva.vendas.domain.entity.Pedido;
import com.soliva.vendas.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);
}
