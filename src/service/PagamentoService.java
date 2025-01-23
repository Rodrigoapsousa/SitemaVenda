package service;

import modelo.Pagamento;
import modelo.Pedido;

public class PagamentoService {
    public void processarPagamento(Pedido pedido, Pagamento pagamento) {
        pagamento.getMetodoPagamento().pagar(pagamento.getValor());
        System.out.println("Pagamento processado para o pedido do cliente: " + pedido.getCliente().getNome());
    }
}