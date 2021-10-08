package controller;


import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.Cliente;
import model.Dados;
import view.Login;
import view.Menu;
import view.MinhaConta;

/**
 * Classe controller que contém toda a lógica por trás da classe
 * MinhaConta
 * 
 * @author Wesley Lira Carvalho
 */
public class MinhaContaController {
    
    private final MinhaConta view;
    private Login login;
    private Cliente clienteBusca;
    private CadastrarClienteController telaCliente;

    /**
     * Responsável pela inicialização da view
     * 
     * @param view A tela de MinhaConta 
     */
    public MinhaContaController(MinhaConta view) {
        this.view = view;
    }

    /**
     * Executa um comando dependedo de qual botão foi clicado.
     * 
     * Possui os seguites casos:
     *      (1) -> botão Excluir: exclui a conta logada e te retorna para
     * a tela de Login.
     *      (2) -> botão Voltar: retornar para a tela de Menu.
     *      (3) -> botão Editar: redireciona para a tela de Registro
     * com os dados já digitados antes para que possa editá-los.
     * 
     * @param botao Botão da sua view
     */
    public void executaBotao(Object botao) {

        if (botao == view.getExcluirBtn()) {
            excluirCliente((String)view.getBuscarClientesComboBox().getSelectedItem());
            this.view.dispose();
            new Menu().setVisible(true);
        } else if (botao == view.getVoltarBtn()) {
            this.view.dispose();
            new Menu().setVisible(true);
        } else if (botao == view.getMostrarDetalhes()) {
            view.getInformacoesTable().setText(((this.buscarClienteEscolhido((String)view.getBuscarClientesComboBox().getSelectedItem())).toString()));
            view.getInformacoesTable().updateUI();
        } else {
            clienteBusca = buscarClienteEscolhido(view.getBuscarClientesComboBox().getSelectedItem().toString());

            Cliente modelo = telaCliente.pegarModelo();
        }
    }

    
    /**
     * Realiza uma busca pelos clientes cadastrados em Dados. Passa por uma verificação
     * pelo if, puxando o método sãoIguais, que do qual vai comparar o parâmetro do
     * nome do cliente com os que já estão cadastrados.
     * 
     * @param name Nome do cliente
     * @return Retorna true se a comparação for verdadeira ou false se caso não for
     * verdadeira.
     */
    public boolean excluirCliente(String name) {
        for (Cliente clienteLista : Dados.getClientes()) {
            if (saoIguais(name)) {
                Dados.getClientes().remove(clienteLista);
                view.mostrarMensagemExcluido("A sua conta foi excluída! Você voltara para a tela de Login");
                return true;
            }
        }

        view.mostrarMensagemErro("Não foi possível excluir o usuário");
        return false;
    }

    /**
     * Compara se o nome do cliente bate com algum dentro de Dados.
     * 
     * @param name Nome do cliente
     * @return Retorna true se a comparação for um sucesso ou
     * um false caso a comparação não bata.
     */
    private boolean saoIguais(String name) {
        for (Cliente cliente : Dados.getClientes()) {
            if (cliente.getNome().equals(name)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Procura dentro da array, de clientes inseridos na classe Dados, o
     * nome do cliente que queremos buscar
     * 
     * @param name que iremos utilizar como parâmetro
     * @return os dados do nosso cliente cadastrado para caso achar,
     * caso contrário ele nos retorna null
     */
    public Cliente buscarClienteEscolhido(String name) {
        for (Cliente clienteAgora : Dados.getClientes()) {
            if (clienteAgora.getNome().equals(name)) {
                return clienteAgora;
            }
        }

        return null;
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
}
