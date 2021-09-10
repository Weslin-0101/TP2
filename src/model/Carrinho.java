package model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    
    private ArrayList<Filme> filmes;
    private Cliente cliente;
    private ArrayList<Ingresso> ingressos;
    private ArrayList<Sessao> sessoes;
    private ArrayList<Sala> salas;
    private ArrayList<Pagamento> pagamentos;

    public Carrinho() {
        this.filmes = new ArrayList<>();
        this.ingressos = new ArrayList<>();
        this.sessoes = new ArrayList<>();
        this.salas = new ArrayList<>();
        this.pagamentos = new ArrayList<>();
    }

    public Carrinho(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }
}
