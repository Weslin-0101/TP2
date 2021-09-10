package controller;

import java.util.ArrayList;
import java.util.List;

import model.Alimento;

public class AlimentoController{

    private ArrayList<Alimento> alimentos;
    
    public AlimentoController() {
        this.alimentos = new ArrayList<>();
    }

    public List<Alimento> getAlimentos() {
        return alimentos;
    }
    
    public void addAlimento(Alimento alimento) {
        if (!alimentos.contains(alimento)) {
            alimentos.add(alimento);
        } else {
            System.out.println("Alimento já cadastrado!!");
        }
    }

    public void listarAlimento(Alimento alimento) {
        for (Alimento value : alimentos) {
            System.out.println(value);
        }
    }

    public boolean selecionarLanche(String seleciona) {

        boolean valida = false;
        for (Alimento value : alimentos) {
            Alimento valor = value;
            if (valor.getNome().equals(seleciona)) {
                System.out.println("Combo escolhido com sucesso!");
                System.out.println("Você selecionou o combo " + seleciona);
                String guardar = seleciona;
                valida = true;
            }
        }

        return valida;
    }

    public void prosseguir(String confirm) {

        if (confirm.equals('S')) {
            System.out.println("Prosseguindo para o Carrinho!");
        }
    }
}