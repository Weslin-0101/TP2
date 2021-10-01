package controller;

import javax.swing.table.DefaultTableModel;

import model.Cliente;
import model.Dados;
import view.Menu;
import view.MinhaConta;

public class MinhaContaController {
    
    private final MinhaConta view;
    private Cliente cliente;

    public MinhaContaController(MinhaConta view) {
        this.view = view;
    }

    public void executaBotao(Object botao) {

        if (botao == view.getExcluirBtn()) {
            excluirCliente(cliente);
            view.mostrarMensagemExcluido("A sua conta foi excluída! Você voltara para a tela de Login");
            this.view.dispose();
            new Menu().setVisible(true);
        } else if (botao == view.getVoltarBtn()) {
            this.view.dispose();
            new Menu().setVisible(true);
        }
    }

    /**
     * Deleta um objeto do banco de dados pelo nome do cliente
     * @param cliente
     * @return true para excluir ou false para o caso de não conseguir excluir
     */
    public boolean excluirCliente(Cliente cliente) {
        for (Cliente clienteLista : Dados.getClientes()) {
            if (saoIguais(clienteLista, cliente)) {
                Dados.getClientes().remove(clienteLista);
                return true;
            }
        }

        view.mostrarMensagemErro("Não foi possível excluir o usuário");
        return false;
    }

    /**
     * Compara se os dois objetos tem o nome igual
     * @param cliente
     * @param clienteAComparar
     * @return true se tiver o nome igual ou false, caso o nome não seja igual
     */
    private boolean saoIguais(Cliente cliente, Cliente clienteAComparar) {
        return cliente.getNome() == clienteAComparar.getNome();
    }
}
