package com.soliva.vendas.exception;

public class PedidoNaoEncontradoException extends RuntimeException {

    public PedidoNaoEncontradoException(String message) {
        super("Pedido não encontrado!");
    }
}
