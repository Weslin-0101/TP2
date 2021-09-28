package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Dados {
    
    private static final List<String> admin = new ArrayList<>();
    private static final List<String> filmes = new ArrayList<>();
    private static final List<String> localidades = new ArrayList<>();
    private static final List<String> cinemas = new ArrayList<>();
    private static final List<String> sessoes = new ArrayList<>();
    private static final List<String> alimentos = new ArrayList<>();
    private static final List<String> pagamentos = new ArrayList<>();
    
    public static List<String> getAdmin() {
        return admin;
    }

    public static List<String> getFilmes() {
        return filmes;
    }

    public static List<String> getLocalidades() {
        return localidades;
    }

    public static List<String> getCinemas() {
        return cinemas;
    }

    public static List<String> getSessoes() {
        return sessoes;
    }

    public static List<String> getAlimentos() {
        return alimentos;
    }

    public static List<String> getPagamentos() {
        return pagamentos;
    }
}
