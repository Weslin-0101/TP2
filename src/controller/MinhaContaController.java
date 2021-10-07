package controller;


import model.Cliente;
import model.Dados;
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
    private Cliente cliente;

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
            excluirCliente(cliente);
            view.mostrarMensagemExcluido("A sua conta foi excluída! Você voltara para a tela de Login");
            this.view.dispose();
            new Menu().setVisible(true);
        } else if (botao == view.getVoltarBtn()) {
            this.view.dispose();
            new Menu().setVisible(true);
        } else if (botao == view.getMostrarDetalhes()) {
            
        }
    }

    /**
     * Deleta um objeto do banco de dados pelo nome do cliente
     * 
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
     * 
     * @param cliente
     * @param clienteAComparar
     * @return true se tiver o nome igual ou false, caso o nome não seja igual
     */
    private boolean saoIguais(Cliente cliente, Cliente clienteAComparar) {
        return cliente.getNome().equals(clienteAComparar.getNome());
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
}
