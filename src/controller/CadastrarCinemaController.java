package controller;

import java.util.List;

import javax.swing.JButton;

import model.Cinema;
import model.Dados;
import model.Localidade;
import model.Sala;
import view.CadastrarCinema;
import view.Menu;

import java.awt.event.ActionEvent;

public class CadastrarCinemaController {
    
    private final CadastrarCinema view;

    public CadastrarCinemaController(CadastrarCinema view) {
        this.view = view;
    }

    public void cadastrarCinema() {

        String name = view.getNomeCinemaField().getText();
        String endereco = view.getEnderecoField().getText();
        String cep = view.getCepField().getText();
        String referencia = view.getReferenciaField().getText();
        Integer numeroSala = Integer.parseInt(view.getNumeroSalaField().getText());
        Integer capacidade = Integer.parseInt(view.getCapacidadeField().getText());
        String tecnologia = view.getTecnologiaField().getText();

        Dados.getCinemas().add(new Cinema(name, new Localidade(endereco, cep, referencia), new Sala(numeroSala, capacidade, tecnologia)));
    }

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
