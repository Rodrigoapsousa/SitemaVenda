package service;

import modelo.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();

    public void registrarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto registrado: " + produto.getNome());
    }
}