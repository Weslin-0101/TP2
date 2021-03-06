package controller;

import view.Menu;
import view.CadastrarPagamento;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.Cliente;
import model.Dados;
import model.Pagamento;

/**
 * Classe controller responsável por toda a lógica por trás
 * da classe view Pagamento.
 * 
 * @author Wesley Lira Carvalho e Cleber de Oliveira Brant
 */
public class PagamentoController {
    
    private final CadastrarPagamento view;
    private Cliente clientePego;
    private CadastrarClienteController telaCliente;

    /**
     * Responsável pela inicialização da view
     * 
     * @param view A tela de Pagamento
     */
    public PagamentoController(CadastrarPagamento view) {
        this.view = view;
    }

    /**
     * Método para que faça os adicionamentos de pagamentos
     * necessários. Cada botão, apesar de ter o mesmo nome, demonstra
     * uma função diferente. Possuem os seguintes casos:
     *      (1) -> botão Adicionar: cadastra os dados digitados para dentro
     * da array de pagamento no formato Cartão e retorna uma mensagem confirmando
     * o pagamento.
     *      (2) -> botão Adicionar: cadastra os dados digitados para dentro
     * da array de Pagamento no formato Pix e retorna uma mensagem confirmando
     *      (3) -> botão Confirmar: retorna a mensagem logo após confirmar todo
     * o percursso de quals filmes, ingressos, sala, sessão e método de pagamento
     * que queriam adotar. Logo após, retorna uma mensagem confirmando a compra do ingresso
     * e te redireciona para o Menu.
     * 
     * @param botao Botão da sua view
     */
    public void executarBotao(Object botao) {
        

        if (botao == view.getAdicionarCartaoBtn()) {
            adicionarCartão();
            view.mostrarMensagemPagamento("Os dados foram inseridos corretamente?");
        } else if (botao == view.getAdicionarPixBtn()) {
            adicionarPix();
            view.mostrarMensagemPagamento("Pagamento adicionado com sucesso!");
        } else if (botao == view.getConfirmarBtn()) {
            view.mostrarMensagemConfirmacao("Compra do ingresso realizada com sucesso! Tenha bom filme!");
            new Menu().setVisible(true);
            this.view.dispose();

        } else {
            clientePego = buscarClienteEscolhido(view.getClientesComboBox().getSelectedItem().toString());

            Cliente modelo = telaCliente.pegarModelo();
        }
    }

    /**
     * Cadastra os dados que foram digitados nas labels para
     * o cartão de crédito
     */
    public void adicionarCartão() {
        String numCartao = view.getNumeroDoCartaoField().getText();
        String nomeImpresso = view.getNomeDoCartaoField().getText();
        String data = view.getDataField().getText();
        String codigo = view.getCodigoDeSegurancaField().getText();
        String cpf = view.getCpfCartaoField().getText();

        Dados.getPagamentos().add(new Pagamento(numCartao, nomeImpresso, data, codigo, cpf));
    }

    /**
     * Cadastra todos os dados digitados na parte do Pix em uma array
     * de pagamento dentro da classe Dados
     */
    public void adicionarPix() {
        String cpf = view.getCpfCartaoField().getText();
        String pix = view.getCpfPixField().getText();

        Dados.getPagamentos().add(new Pagamento(cpf, pix));
    }

    /**
     * Sempre atualizar o comboBox de clientes
     * quando um novo cliente for cadastrado
     * 
     * @return um novo comboBox atualizado
     */
    public DefaultComboBoxModel<String> atualizarClientes() {
        return new DefaultComboBoxModel<>(arraysClientes());
    }

    /**
     * Gera sempre uma array nova de clientes
     * quando um novo cliente é cadastrado
     * 
     * @return array atualizada de clientes
     */
    public String[] arraysClientes() {
        List<String> modelo = new ArrayList<>();

        for (Cliente cliente : Dados.getClientes()) {
            modelo.add(cliente.getNome());
        }

        return modelo.toArray(new String[0]);
    }

    /**
     * busca o nome do cliente novo que foi cadastrado
     * para que possa deixar ele visível no comboBox
     * 
     * @param name
     * @return cliente encontrado ou nada caso não encontrem o cliente
     */
    public Cliente buscarClienteEscolhido(String name) {
        for (Cliente clienteAgora : Dados.getClientes()) {
            if (clienteAgora.getNome().equals(name)) {
                return clienteAgora;
            }
        }

        return null;
    }
}
