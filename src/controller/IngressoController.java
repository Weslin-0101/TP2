package controller;

import java.util.ArrayList;
import java.util.List;

import model.Filme;
import model.Ingresso;

// Classe de controle do ingresso onde possui os métodos
public class IngressoController {
    
    private Filme filme;
    private List<Ingresso> ingressos = new ArrayList<>();

    // Listar completamente todos os ingressos comprados com os detalhes
    public void listar(Ingresso i) {
        for (Ingresso valor : ingressos) {
            System.out.println(valor);
        }
    }

    // Método para selecionar a poltrona
    public boolean selecionarPoltrona(boolean selec) {

        return (selec == true);
    }

}
