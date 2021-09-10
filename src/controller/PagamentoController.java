package controller;

import java.util.ArrayList;
import java.util.List;

import model.Pagamento;
import utils.Sc;

public class PagamentoController {
    
    private ArrayList<Pagamento> pagamentos;

    public PagamentoController() {
        this.pagamentos = new ArrayList<>();
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }


    public void addPagamento(Pagamento pagamento) {
        if (!pagamentos.contains(pagamento)) {
            pagamentos.add(pagamento);
        } else {
            System.out.println("Método de pagamento já existente");
        }
    }
    // Precisa ser refatorado (manutenção urgente)
    public boolean validacaoDaEscolha(boolean escolha) {

        boolean validacao = true;

        return (escolha == validacao);
    }

    public boolean finalizarPedido(boolean pedido) {

        boolean valida = true;
        return (pedido == valida);
    }
    
    // Necessário fazer depois!!!
    // public Double total() {}
}
