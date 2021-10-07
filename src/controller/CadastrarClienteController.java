package controller;

import model.Cliente;
import model.Dados;
import view.CadastrarCliente;
import view.Login;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

/**
 * Classe controladora com todas as lógicas por trás da CadastrarCliente
 * 
 * @author Wesley Lira Carvalho
 * 
 */
public class CadastrarClienteController {
    
    private final CadastrarCliente view;

    /**
     * Responsável para inicializar a view
     * @param view a tela de CadastrarCliente
     * 
     * @see CadastrarCliente
     */
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

    /**
     * Vai executar uma ação de acordo com qual botão foi clicado
     * 
     * Casos que podem ocorrer:
     *      (1) -> botão Confirmar: cadastrar as informações inseridas
     * em uma arrayList, logo chama uma mensagem de afirmação dizendo
     * que o cadastro foi realizado com sucesso, e te redireciona para
     * a tela de Login.
     * 
     *      (2) -> botão Voltar: retorna para a tela de Login.
     * 
     * @param e capturar o evento do clique no botão
     */
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
