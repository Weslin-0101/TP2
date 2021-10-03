package model;

import java.util.ArrayList;
import java.util.List;


/*
 * Classe que simula o Banco de Dados
 * Aqui reside todas as ArrayList das classes que vamos utlizar 
 */
public abstract class Dados {
    
    private static final ArrayList<Administracao> admins = new ArrayList<>();
    private static final ArrayList<Cliente> clientes = new ArrayList<>();
    private static final ArrayList<Sala> salas = new ArrayList<>();
    private static final ArrayList<Filme> filmes = new ArrayList<>();
    private static final ArrayList<Localidade> localidades = new ArrayList<>();
    private static final ArrayList<Cinema> cinemas = new ArrayList<>();
    private static final ArrayList<Sessao> sessoes = new ArrayList<>();
    private static final ArrayList<Alimento> alimentos = new ArrayList<>();
    private static final ArrayList<Pagamento> pagamentos = new ArrayList<>();
    
    /*
        Construtor para que não seja possível herdar a classe
        ou instanciar
    */

    private Dados() {
    }

    /*
     * Neste método é onde estão instanciados os dados pré cadastrados
     * de todas as classes
     * Deve ser instanciada dentro da classe Login para que tudo possa funcionar 
     */
    public static void iniciar() {

        Cliente cliente = new Cliente("Wesley", "23/10/2001", "25450", "arroz@gmail.com", "wesley");
        Cliente cliente2 = new Cliente("Cleber", "05/06/2002", "115424", "brasiltutorial@gmail.com", "123");
        Cliente cliente3 = new Cliente("eduarda", "09/08/2005", "245422", "braboo@gmail.com", "edurada");
        clientes.add(cliente);
        clientes.add(cliente2);
        clientes.add(cliente3);

        Administracao admin = new Administracao("admin", "admin");
        admins.add(admin);

        Filme filme = new Filme("Guerra", "120min", "Brabo demais", "Ação, Aventura", "Sim", "Brad Pitt | Agostinha Carrara", "Tarantino");
        Filme filme2 = new Filme("Zubilândia", "1h35min", "Muito bicho, corree", "Ação, Aventura", "Sim", "Cleber Brant | Enzoido Mengão", "Andrew");
        Filme filme3 = new Filme("A Menina que matou os pais", "1h20min", "Muito bom", "Ação, Documentário", "Sim", "Péricles | São Jorge", "Nicolas");
        Filme filme4 = new Filme("Todo mundo odeia o Chris", "2h", "PERFEITO", "Comédia", "Não", "Chris Rock | Ryan Gosling", "Jack Snyder");
        Filme filme5 = new Filme("300", "240min", "Guerra medieval", "Ação, Guerra", "Sim", "Gerard Butler | Rodrigo Santoro", "Zack Snyder");
        filmes.add(filme);
        filmes.add(filme2);
        filmes.add(filme3);
        filmes.add(filme4);
        filmes.add(filme5);

        Sala sala = new Sala(2, 20);
        Sala sala2 = new Sala(3, 20);
        Sala sala3 = new Sala(4, 20);
        Sala sala4 = new Sala(5, 20);
        salas.add(sala);
        salas.add(sala2);
        salas.add(sala3);
        salas.add(sala4);

        Sessao sessao = new Sessao("10/02", "15H50");
        Sessao sessao2 = new Sessao("10/02", "17H50");
        Sessao sessao3 = new Sessao("12/02", "13H20");
        Sessao sessao4 = new Sessao("14/02", "18H30");
        Sessao sessao5 = new Sessao("14/02", "20H50");
        sessoes.add(sessao);
        sessoes.add(sessao2);
        sessoes.add(sessao3);
        sessoes.add(sessao4);
        sessoes.add(sessao5);
        


    }

    public static List<Administracao> getAdmin() {
        return admins;
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public static List<Filme> getFilmes() {
        return filmes;
    }

    public static List<Localidade> getLocalidades() {
        return localidades;
    }

    public static List<Cinema> getCinemas() {
        return cinemas;
    }

    public static List<Sessao> getSessoes() {
        return sessoes;
    }

    public static List<Alimento> getAlimentos() {
        return alimentos;
    }

    public static List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public static List<Sala> getSalas() {
        return salas;
    }

    /*
     * 
     * Método retorna um objeto do tipo Cliente para o caso
     * da função encontrar dentro do banco de dados na classe
     * Dados o cliente cadastrado.
     * 
     */
    public static Cliente selecionarPorNomeESenha(Cliente cliente) {
        for (Cliente clienteLista : Dados.clientes) {
            if (nomeESenhaIguaisCliente(clienteLista, cliente)) {
                return clienteLista;
            }
        }
        return null;
    }

    public static Administracao buscarAdmin(Administracao admin) {
        for (Administracao adminBuscado : Dados.getAdmin()) {
            if (nomeESenhaIguaisAdmin(adminBuscado, admin)) {
                return adminBuscado;
            }
        }

        return null;
    }
    
    /*
     * Método onde recebe dois parâmetros Objeto do tipo Cliente.
     * Nesse método, é para equiparar o nome e senha que fora usados
     * para o cadastro.
     * 
     */
    private static boolean nomeESenhaIguaisCliente(Cliente cliente, Cliente clienteProcura) {
        return cliente.getNome().equals(clienteProcura.getNome()) && cliente.getSenha().equals(clienteProcura.getSenha());
    }

    private static boolean nomeESenhaIguaisAdmin(Administracao admin, Administracao adminProcura) {
        return admin.getNome().equals(adminProcura.getNome()) && admin.getSenha().equals(adminProcura.getSenha());
    }

    public static List<Cliente> selecionaTudo() {
        return Dados.getClientes();
    }
}
