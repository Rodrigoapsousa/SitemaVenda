package util;

import service.ClienteService;
import service.PagamentoService;
import service.PedidoService;
import service.ProdutoService;

public class SistemaDePedidosSingleton {

    private static SistemaDePedidosSingleton instancia;
    private ProdutoService produtoService;
    private ClienteService clienteService;
    private PedidoService pedidoService;
    private PagamentoService pagamentoService;

    private SistemaDePedidosSingleton() {
        produtoService = new ProdutoService();
        clienteService = new ClienteService();
        pedidoService = new PedidoService();
        pagamentoService = new PagamentoService();
    }

    public static SistemaDePedidosSingleton getInstancia() {
        if (instancia == null) {
            instancia = new SistemaDePedidosSingleton();
        }
        return instancia;
    }

    public ProdutoService getProdutoService() {
        return produtoService;
    }

    public ClienteService getClienteService() {
        return clienteService;
    }

    public PedidoService getPedidoService() {
        return pedidoService;
    }

    public PagamentoService getPagamentoService() {
        return pagamentoService;
    }
    

}
