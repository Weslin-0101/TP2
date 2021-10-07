package model;

import java.util.ArrayList;
import java.util.List;


/**
 * Classe responsável para simular o banco de dados do programa.
 * Nele reside todos as arraylist necessárias para o funcionamento
 * do programa
 * 
 * @author Wesley Lira Carvalho
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
    
    /**
     * Construtor privado para que não seja necessário
     * instanciar a classe
     */

    private Dados() {
    }

    /**
     * Nesse método fica todas as informações pré-cadastradas de cada classe necessária
     * @see Cliente
     * @see Administraçao
     * @see Filme
     * @see Sala
     * @see Sessao
     * 
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

    
    /**
     * Método necessário para comparar os dados que foram
     * inseridos na view Login. Assim a gente compara com
     * os dados inseridos no banco de dados
     * @see Login
     * @param cliente que vai ser utilizado para buscar no ObterModelo
     * dentro do controller do Login
     * @return os dados do cliente encontrado, caso contrário irá
     * retornar null
     */
    public static Cliente selecionarPorNomeESenha(Cliente cliente) {
        for (Cliente clienteLista : Dados.clientes) {
            if (nomeESenhaIguaisCliente(clienteLista, cliente)) {
                return clienteLista;
            }
        }
        return null;
    }

    /**
     * Método para comparar os dados que foram inseridos na view Login.
     * Dessa forma irá comparar com os dados cadastrados no banco de dados
     * @see Login
     * @param admin parâmetro que vai ser usado como comparação
     * @return os dados do admin cadastrado no banco de dados, caso contrário
     * retornará null
     */
    public static Administracao buscarAdmin(Administracao admin) {
        for (Administracao adminBuscado : Dados.getAdmin()) {
            if (nomeESenhaIguaisAdmin(adminBuscado, admin)) {
                return adminBuscado;
            }
        }

        return null;
    }
    
    /**
     * Vai comparar com os dados que foram digitados na view de Login
     * @param cliente para percorrer os que já foram cadastrados
     * @param clienteProcura o que desejamos procurar
     * @return true para caso confirmar que são iguais aos dados digitados
     * na view Login ou false para caso os dados não forem iguais
     */
    private static boolean nomeESenhaIguaisCliente(Cliente cliente, Cliente clienteProcura) {
        return cliente.getNome().equals(clienteProcura.getNome()) && cliente.getSenha().equals(clienteProcura.getSenha());
    }

    /**
     * Vai comparar com os dados que foram digitados na view de Login
     * @param admin para percorrer na array do que já foram cadastrados
     * @param adminProcura o que usamos como parâmetro para comparação
     * @return true para caso forem iguais, ou false para caso os dados
     * digitados não forem iguais aos que estão no banco de dados
     */
    private static boolean nomeESenhaIguaisAdmin(Administracao admin, Administracao adminProcura) {
        return admin.getNome().equals(adminProcura.getNome()) && admin.getSenha().equals(adminProcura.getSenha());
    }

    /**
     * Vai buscar dentro da array de cliente e buscar os dados de todos cadastrados
     * @return todos os clientes e seus dados que foram ou estão cadastrados
     * dentro do banco de dados
     */
    public static List<Cliente> selecionaTudo() {
        return Dados.getClientes();
    }
}
