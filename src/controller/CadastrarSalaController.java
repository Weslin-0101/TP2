package controller;

import model.Sala;
import view.CadastrarSala;
import view.Menu;

public class CadastrarSalaController {
    
    private CadastrarSala view;

    public CadastrarSalaController(CadastrarSala view) {
        this.view = view;
    }

    public void executarBotao(Object botao) {
        
        if (botao == view.getConfirmarBtn()) {
            new Menu().setVisible(true);
            this.view.dispose();
        } else {
            cadastrarSala();
            new Menu().setVisible(true);
            this.view.dispose();
        }
    }

    public Sala cadastrarSala() {
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
