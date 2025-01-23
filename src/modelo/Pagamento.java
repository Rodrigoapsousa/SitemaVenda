package modelo;

import pagamento.MetodoPagamento;

public class Pagamento {

    private double valor;
    private MetodoPagamento metodoPagamento;

    public Pagamento(double valor, MetodoPagamento metodoPagamento) {
        this.valor = valor;
        this.metodoPagamento = metodoPagamento;
    }

    public double getValor() {
        return valor;
    }

    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }
    
}
