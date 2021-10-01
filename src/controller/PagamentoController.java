package controller;

import view.Menu;
import view.CadastrarPagamento;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import model.Cliente;
import model.Dados;

public class PagamentoController {
    
    private final CadastrarPagamento view;
    private Cliente cliente;

    public PagamentoController(CadastrarPagamento view) {
        this.view = view;
    }

    public void executarBotao(Object botao) {
        

        if (botao == view.getAdicionarCartaoBtn()) {
            adicionarCartão();
            view.mostrarMensagemPagamento("Pagamento adicionado com sucesso!");
        } else if (botao == view.getAdicionarPixBtn()) {
            adicionarPix();
            view.mostrarMensagemPagamento("Pagamento adicionado com sucesso!");
        } else if (botao == view.getConfirmarBtn()) {
            view.mostrarMensagemConfirmacao("Compra do ingresso realizada com sucesso! Tenha bom filme!");
            new Menu().setVisible(true);
            this.view.dispose();

        } else {
            


        }
    }

    public void adicionarCartão() {
        String numCartao = view.getNumeroDoCartaoField().getText();
        String nomeImpresso = view.getNomeDoCartaoField().getText();
        String data = view.getDataField().getText();
        String codigo = view.getCodigoDeSegurancaField().getText();
        String cpf = view.getCpfCartaoField().getText();

        Dados.getPagamentos().add(new model.Pagamento(numCartao, nomeImpresso, data, codigo, cpf));
    }

    public void adicionarPix() {
        String cpf = view.getCpfCartaoField().getText();
        String pix = view.getCpfPixField().getText();

        Dados.getPagamentos().add(new model.Pagamento(cpf, pix));
    }

    public void atualizarCliente() {
        List<Cliente> clientes = Dados.selecionaTudo();
        preencherClientes(clientes);
    }

    public void preencherClientes(List<Cliente> clientes) {

        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getClientesComboBox().getModel();

        for (Cliente cliente : clientes) {
            
            comboBoxModel.addElement(cliente);
        }
    }
}
