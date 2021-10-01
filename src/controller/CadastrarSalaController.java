package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.Dados;
import model.Sala;
import model.Sessao;
import view.CadastrarSala;
import view.Menu;

public class CadastrarSalaController {
    
    private CadastrarSala view;
    private Sala salaEscolhido;
    private PagamentoController pagamento;

    public CadastrarSalaController(CadastrarSala view) {
        this.view = view;
    }

    public void executarBotao(Object botao) {
        
        if (botao == view.getConfirmarBtn()) {
            new Menu().setVisible(true);
            this.view.dispose();
        } else if (botao == view.getVoltarBtn()){
            cadastrarSala();
            new Menu().setVisible(true);
            this.view.dispose();
        } else {
            
        }
    }

    /**
     * Classe para o cadastro das salas
     * @return modelo Sala
     */
    public void cadastrarSala() {
        Integer numeroDaSala = Integer.parseInt(view.getNumeroSalaField().getText());
        Integer capacidade = Integer.parseInt(view.getCapacidadeField().getText());

        Dados.getSalas().add(new Sala(numeroDaSala, capacidade));
    }

    /**
     * Método para pegar o modelo da sala que foi cadastrado pelo cliente
     * @return o modelo da sala
     */
    public Sala obterModelo(){
        String numeroDaSala = view.getNumeroSalaField().getText();
        String capacidade = view.getCapacidadeField().getText();

        Integer num;
        Integer capacidadeInteger;

        try {
            num = Integer.parseInt(numeroDaSala);
        } catch (NumberFormatException e) {
            view.getNumeroSalaField().setText("");
            return null;
        }

        try {
            capacidadeInteger = Integer.parseInt(capacidade);
        } catch (NumberFormatException e) {
            view.getCapacidadeField().setText("");
            return null;
        }

        return new Sala(num, capacidadeInteger);
    }
}
