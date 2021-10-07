package controller;

import javax.swing.JButton;

import model.Cinema;
import model.Dados;
import model.Localidade;
import model.Sala;
import view.CadastrarCinema;
import view.Menu;

import java.awt.event.ActionEvent;

/**
 * Classe controladora do CadastroCinema que contém toda a lógica por trás
 * 
 * @author Cleber de Oliveira Brant e Wesley Lira Carvalho
 */
public class CadastrarCinemaController {
    
    private final CadastrarCinema view;

    /**
     * Responsável para inicializar a view
     * 
     * @param view a tela do CadastrarCinema
     */
    public CadastrarCinemaController(CadastrarCinema view) {
        this.view = view;
    }

    /**
     * Método para que após aperta no botão de confirmar,
     * ele possa armazenas os dados preenchidos em uma
     * ArrayList armazenada em Dados
     */
    public void cadastrarCinema() {

        String name = view.getNomeCinemaField().getText();
        String endereco = view.getEnderecoField().getText();
        String cep = view.getCepField().getText();
        String referencia = view.getReferenciaField().getText();
        Integer numeroSala = Integer.parseInt(view.getNumeroSalaField().getText());
        Integer capacidade = Integer.parseInt(view.getCapacidadeField().getText());
        
        Dados.getCinemas().add(new Cinema(name, new Localidade(endereco, cep, referencia), new Sala(numeroSala, capacidade)));
    }

    /**
     * Vai executar uma ação de acordo com qual botão foi pressionado
     * 
     * Pode ocorrer os seguintes casos:
     *      (1) -> botão Confirmar: quando o botão for pressionado, ele pega as 
     * as informações que foram inseridas e as cadastra dentro de uma arrayList.
     * Logo após chama uma JOptionPane com uma mensagem indicando que o cadastro
     * foi finalizado com sucesso.
     *  
     *      (2) -> botão Voltar: retorna para o Menu
     * 
     * @param e chama o ActionEvent da interface ActionListener 
     */
    public void executarBotao(ActionEvent e) {
        JButton botao = (JButton) e.getSource();

        if (botao == view.getConfirmaCinemaBtn()) {
            cadastrarCinema();
            view.mostrarMensagemCadastroCinema("Cadastro finalizado com sucesso!");
            this.view.dispose();
            new Menu().setVisible(true);
        } else {
            this.view.dispose();
            new Menu().setVisible(true);
        }
    }
}
