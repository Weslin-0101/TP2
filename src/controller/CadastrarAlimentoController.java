package controller;

import model.Alimento;
import model.Dados;
import view.CadastrarAlimento;
import view.Menu;

/**
 * Classe controladora do Cadastro de Alimento que contém toda a lógica
 * 
 * @author Cleber de Oliveira Brant
 */
public class CadastrarAlimentoController {
    
    private final CadastrarAlimento view;

    /**
     * Responsável para que inicalize a view 
     * 
     * @param view a tela do CadastrarAlimento 
     */
    public CadastrarAlimentoController(CadastrarAlimento view) {
        this.view = view;
    }
    
    /**
     * Método void sem receber nenhum parâmetro
     * 
     * Reponsável para pegar os dados que foram digitados na view do
     * CadastrarAlimentos e armazenar ele em uma arraylist dentro
     * de Dados. Assim, esses dados estarão salvos para poderem serem
     * vistos caso sejam chamados.
     * @see Dados
     */
    public void cadastrarAlimento() {
        
        String nome = view.getNomeAlimentoField().getText();
        Double preco = Double.parseDouble(view.getPrecoAlimentoField().getText());
        String descricao = view.getDescricaoAlimentoField().getText();

        Dados.getAlimentos().add(new Alimento(nome, preco, descricao));
    }

    /**
     * Vai executar uma ação de acordo com qual botão foi selecionado na view
     * 
     * Pode ocorrer os seguintes casos:
     *      (1) -> botão Confirmar: cadastra as informações inseridas
     * em uma arrayList e depois chama um JOptionPane com uma mensagem
     * afirmando que o cadastro foi concluído, logo te direciona para o Menu
     *      
     *      (2) -> botão Voltar: te direciona para o Menu
     * 
     * @param botao Botão presente na view 
     * 
     * @see CadastrarAlimento
     */
    public void executarBotao(Object botao) {

        if (botao == view.getConfirmarAlimentoBtn()) {
            cadastrarAlimento();
            this.view.mostrarMensagemAfirmativa("O cadastro do alimento foi concluído!");
            this.view.dispose();
        } else {
            this.view.dispose();
            new Menu().setVisible(true);
        }
    } 

    /**
     * A função desse método é para limpar os dados
     * que ainda estão escritos na view do cadastro
     * de alimentos
     */
    public void limparCampo() {
        view.getNomeAlimentoField().setText("");
        view.getPrecoAlimentoField().setText("");
        view.getDescricaoAlimentoField().setText("");
    }
}
