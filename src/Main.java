import java.util.List;

import facade.SistemaFacade;
import modelo.Cliente;
import modelo.Pagamento;
import modelo.Pedido;
import modelo.Produto;
import pagamento.PagamentoCartao;
import util.SistemaDePedidosSingleton;

public class Main {
    public static void main(String[] args) {
        SistemaDePedidosSingleton sistema = SistemaDePedidosSingleton.getInstancia();
        SistemaFacade facade = new SistemaFacade(
            sistema.getProdutoService(),
            sistema.getClienteService(),
            sistema.getPedidoService(),
            sistema.getPagamentoService()
        );

        Produto produto1 = new Produto("Camiseta", 50.0, "Vestuário");
        Produto produto2 = new Produto("Tênis", 120.0, "Calçados");
        facade.registrarProduto(produto1);
        facade.registrarProduto(produto2);

        Cliente cliente = new Cliente("Maria");
        facade.registrarCliente(cliente);

        Pedido pedido = new Pedido(cliente, List.of(produto1, produto2));
        facade.registrarPedido(pedido);

        Pagamento pagamento = new Pagamento(170.0, new PagamentoCartao());
        facade.processarPagamento(pedido, pagamento);
    }
}
