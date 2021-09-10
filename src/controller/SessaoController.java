package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.Date;

import model.Sessao;

public class SessaoController {
    
    private ArrayList<Sessao> sessoes;

    public SessaoController() {
        this.sessoes = new ArrayList<>();
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public static Date converterDate(String data, Date padrao) {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        
        try {
            return dateFormat.parse(data);
        } catch (ParseException e) {
            return padrao;
        }
    }

    public void adicionarSessao(Sessao sessao) {
        if (!sessoes.contains(sessao)) {
            sessoes.add(sessao);
        } else {
            System.out.println("=============================");
            System.out.println();
            System.out.println("=============================");
        }
    }

    public void buscarSessao(String data) {
        boolean found = false;
        for (Sessao valor : sessoes) {
            Sessao sessao = valor;
            if (sessao.getDataDaSessao().equals(data)) {
                System.out.println(sessao);
                found = true;
            }
        }

        if (!found) {
            System.out.println("=============================");
            System.out.println();
            System.out.println("=============================");
        }
    }

    public boolean selecionarSessao(boolean seleciona) {

        boolean valida = true;
        return (seleciona == valida);
    }
}
