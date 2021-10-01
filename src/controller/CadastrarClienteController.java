package controller;

import model.Cliente;
import model.Dados;
import view.CadastrarCliente;
import view.Login;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class CadastrarClienteController {
    
    private final CadastrarCliente view;

    public CadastrarClienteController(CadastrarCliente view) {
        this.view = view;
    }
    
    /**
     * Para armazenas os dados preenchidos na View em uma
     * ArrayList salva em Dados
     */
    public void cadastrarCliente() {

        String name = view.getNameField().getText();
        String date = view.getDateField().getText();
        String cpf = view.getDateField().getText();
        String email = view.getEmailField().getText();
        String password = view.getSenhaField().getText();

        Dados.getClientes().add(new Cliente(name, date, cpf, email, password));
    }

    public void executarBotao(ActionEvent e) {
        JButton botao = (JButton) e.getSource();

        if (botao == view.getConfirmarBtn()) {
            cadastrarCliente();
            view.mensagemConfirmarCadastro("Cadastro realizado com sucesso!");
            this.view.dispose();
            new Login().setVisible(true);
        } else {
            this.view.dispose();
            new Login().setVisible(true);
        }
    }
    
    /**
     * Método para buscar o modelo do cliente
     * para que possa aparecer o nome do cliente
     * cadastrado na ComboBox
     * @return o modelo do cliente
     */
    public Cliente pegarModelo() {

        String name = view.getNameField().getText();
        String date = view.getDateField().getText();
        String cpf = view.getDateField().getText();
        String email = view.getEmailField().getText();
        String password = view.getSenhaField().getText();

        return new Cliente(name, date, cpf, email, password);
    }
}
