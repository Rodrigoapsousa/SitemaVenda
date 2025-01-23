package facade;

import modelo.Cliente;
import modelo.Pagamento;
import modelo.Pedido;
import modelo.Produto;
import service.ClienteService;
import service.PagamentoService;
import service.PedidoService;
import service.ProdutoService;

public class SistemaFacade {
    private ProdutoService produtoService;
    private ClienteService clienteService;
    private PedidoService pedidoService;
    private PagamentoService pagamentoService;

    public SistemaFacade(ProdutoService produtoService, ClienteService clienteService, PedidoService pedidoService, PagamentoService pagamentoService) {
        this.produtoService = produtoService;
        this.clienteService = clienteService;
        this.pedidoService = pedidoService;
        this.pagamentoService = pagamentoService;
    }

    public void registrarProduto(Produto produto) {
        produtoService.registrarProduto(produto);
    }

    public void registrarCliente(Cliente cliente) {
        clienteService.registrarCliente(cliente);
    }

    public void registrarPedido(Pedido pedido) {
        pedidoService.registrarPedido(pedido);
    }

    public void processarPagamento(Pedido pedido, Pagamento pagamento) {
        pagamentoService.processarPagamento(pedido, pagamento);
    }
}
