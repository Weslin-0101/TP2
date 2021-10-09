package controller;

import javax.swing.JButton;

import view.EditarCliente;
import view.MinhaConta;

/**
 *  Classe controller responsável por toda a lógica
 * 
 * @author Wesley Lira Carvalho
 */
public class EditarClienteController {
    
    private final EditarCliente view;

    public EditarClienteController(EditarCliente view) {
        this.view = view;
    }

    /**
     * Executa a ação do botão que foi selecionado
     * 
     *      (1) -> Editar: editar as informações
     *      (2) -> Voltar: retorna para a tela de MinhaConta 
     * 
     * @param botao Botão da tela
     */
    public void executarBotao(JButton botao) {

        if (botao == view.getConfirmarBtn()) {

            String name = view.getNameField().getText();
            String date = view.getDateField().getText();
            String cpf = view.getCpfField().getText();
            String email = view.getEmailField().getText();
            String password = view.getSenhaField().getText();

            this.view.getCliente().setNome(name);
            this.view.getCliente().setDataDeNascimento(date);
            this.view.getCliente().setCpf(cpf);
            this.view.getCliente().setEmail(email);
            this.view.getCliente().setSenha(password);

            this.view.mensagemConfirmarCadastro("Editar as informações do Cliente foi um sucesso!");
            new MinhaConta().setVisible(true);
            this.view.dispose();

        } else {
            new MinhaConta().setVisible(true);
            this.view.dispose();
        }
    }
}
