package service;

import modelo.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoService {
    private List<Pedido> pedidos = new ArrayList<>();

    public void registrarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido registrado para o cliente: " + pedido.getCliente().getNome());
    }
}