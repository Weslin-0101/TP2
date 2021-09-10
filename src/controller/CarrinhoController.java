package controller;

import java.util.ArrayList;
import java.util.List;

import model.Filme;
import model.Cliente;
import model.Ingresso;
import model.Sessao;
import model.Sala;
import model.Pagamento;

public class CarrinhoController {
    
    private ArrayList<Filme> filmes;
    private Cliente cliente;
    private ArrayList<Ingresso> ingressos;
    private ArrayList<Sessao> sessoes;
    private ArrayList<Sala> salas;
    private ArrayList<Pagamento> pagamentos;

    public CarrinhoController() {
        this.filmes = new ArrayList<>();
        this.ingressos = new ArrayList<>();
        this.sessoes = new ArrayList<>();
        this.salas = new ArrayList<>();
        this.pagamentos = new ArrayList<>();
    }

    public CarrinhoController(Cliente cliente) {
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

    public boolean continuarComprando(boolean confirm) {

        boolean valida = true;

        return (confirm == valida);
    }

    public void removerIngresso(String resposta, Ingresso ingresso) {

        if (resposta.equals("Sim")) {
            ingressos.remove(ingresso);
        }
    }

}
