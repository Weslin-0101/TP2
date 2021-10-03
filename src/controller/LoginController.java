package controller;

import java.awt.event.ActionEvent;
import javax.swing.JButton;

import model.Administracao;
import model.Cliente;
import model.Dados;
import view.CadastrarCliente;
import view.Login;
import view.Menu;
import view.MenuCliente;

/* 
*
*   Essa classe é para o controlador da classe view Login
*   Aqui reside todos os métodos necessários para que
*   possamos fazer com que a classe se comunique com outras classes.
*/
public class LoginController {
    
    private final Login view;


    public LoginController(Login view) {
        super();
        this.view = view;
    }

    /**
     * 
     * Esse método é para que após capturar o evento
     * do clique nos botões Entrar e Registrar-se
     * 
     */
    public void executarBotao(ActionEvent e) {
        JButton botao = (JButton) e.getSource();

        if (botao == view.getLoginBtn()) {
            validarUsuario();
        } else {
            new CadastrarCliente().setVisible(true);
            this.view.dispose();
        }
    }

    /*
     * 
     * A validação é necessária para que possamos saber
     * se a conta que foi logada, é uma conta do Cliente
     * ou a conta Master Admin.
     * 
     * Dentro dessa classe estão outros métodos da classe
     * Dados que é a nossa classe que simula um banco de dados.
     * 
     */
    public void validarUsuario() {
        
        Cliente cliente = obterModelo();
        Administracao admin = obterModeloAdmin();

        Cliente clienteValidado = Dados.selecionarPorNomeESenha(cliente);
        Administracao adminValidado = Dados.buscarAdmin(admin);
        if ((clienteValidado != null && obterModelo() != null)) {
            view.mostrarMensagemLoginValido("Login realizado com sucesso!");
            new MenuCliente().setVisible(true);
            this.view.dispose();
        } else if (adminValidado != null && obterModeloAdmin() != null) {
            view.mostrarMensagemLoginValido("Admin logado com sucesso!");
            new Menu().setVisible(true);
            this.view.dispose();
        } else {
            view.mostrarMensagemLoginInvalido("Usuário e/ou senha inválidos!");
        }
    }

    /*
     * 
     * Neste método é para que possa buscar o foi digitado
     * dentro das labels Usuário e Senha 
     */
    public Cliente obterModelo() {
        String name = view.getUsername().getText();
        String password = view.getPassword().getText();
        return new Cliente(name, password);
    }

    public Administracao obterModeloAdmin() {
        String name = view.getUsername().getText();
        String password = view.getPassword().getText();
        return new Administracao(name, password);
    }

    public Login getView() {
        return view;
    }
 
}
