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

/**
*   Essa classe é para o controlador da classe view Login
*   Aqui reside todos os métodos necessários para que
*   possamos fazer com que a classe se comunique com outras classes.
    
    @author Wesley Lira Carvalho
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
     * São os seguintes casos para cada botão:
     *      (1) -> botão Login: caso a conta que tenha digitado
     * seja validada como está registrada no banco de dados, ele então
     * irá te mandar para a tela de Menu.
     *      (2) -> botão Registrar: Te leva para outra tela de registro
     * para que possa inserir os dados e se cadastrar.
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
     * Buscam de acordo com o modelo na Tela de cada uma das
     * formas, seja como Cliente ou Admin, e façam a validação
     * para se algum dos dois bate com os dados que foram digitados
     * dentro do Login.
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

    /**
     * Pega o que foi digitado dentro da tela de Login.
     * @see Login
     * @return Retorna um novo modelo que foi digitado na tela
     * de Login.
     */
    public Cliente obterModelo() {
        String name = view.getUsername().getText();
        String password = view.getPassword().getText();
        return new Cliente(name, password);
    }

    /**
     * Obtém o modelo quando a conta Admin é digitada no
     * login.
     * @see Login
     * @return o modelo que foi digitado na tela de login
     */
    public Administracao obterModeloAdmin() {
        String name = view.getUsername().getText();
        String password = view.getPassword().getText();
        return new Administracao(name, password);
    }

    public Login getView() {
        return view;
    }
 
}
