import controller.AlimentoController;
import controller.CinemaController;
import controller.FilmeController;
import controller.IngressoController;
import controller.LocalidadeController;
import controller.SalaController;
import controller.SessaoController;

import model.Cliente;
import model.Filme;
import model.Administracao;

import utils.Sc;

public class App {
    public static void main(String[] args) throws Exception {
        
        AlimentoController alimento = new AlimentoController();
        CinemaController cinema = new CinemaController();
        FilmeController filme = new FilmeController();
        IngressoController ingresso = new IngressoController();
        LocalidadeController localidade = new LocalidadeController();
        SalaController sala = new SalaController();
        SessaoController sessao = new SessaoController();

        int escolha;
        do{
            Menu();
            System.out.print("Escolha o que deseja: ");
            escolha = Sc.nextInt();
            switch(escolha){
                case 1:
                    System.out.print("Você é Cliente[1] ou Administrador[2]: ");
                    int op = Sc.nextInt();
                    
                    if (op == 1) {
                        System.out.print("ID: ");
                        int id = Sc.nextInt();
                        System.out.print("Digite seu nome: ");
                        String nome = Sc.nextLine();
                        System.out.print("Data de nascimento: ");
                        String data = Sc.nextLine();
                        System.out.print("CPF: ");
                        String cpf = Sc.nextLine();
                        System.out.print("Email: ");
                        String email = Sc.nextLine();
                        System.out.print("Senha: ");
                        String senha = Sc.nextLine();
                        System.out.print("Estado: ");
                        String estado = Sc.nextLine();
                        System.out.print("Cidade: ");
                        String cidade = Sc.nextLine();

                        Cliente cliente = new Cliente(id, nome, data, cpf, email, senha, estado, cidade);
                    }

                    if (op == 2) {
                        System.out.print("ID: ");
                        int id = Sc.nextInt();
                        System.out.print("Digite seu nome: ");
                        String nome = Sc.nextLine();
                        System.out.print("Data de nascimento: ");
                        String data = Sc.nextLine();
                        System.out.print("CPF: ");
                        String cpf = Sc.nextLine();
                        System.out.print("Email: ");
                        String email = Sc.nextLine();
                        System.out.print("Senha: ");
                        String senha = Sc.nextLine();

                        Administracao adm = new Administracao(id, nome, data, cpf, email, senha);
                    }
                    break;
                
                case 2:
                    System.out.print("Título: ");
                    String titulo = Sc.nextLine();
                    System.out.print("Duração: ");
                    String duracao = Sc.nextLine();
                    System.out.print("Sinopse: ");
                    String sinopse = Sc.nextLine();
                    System.out.print("Gênero: ");
                    String genero = Sc.nextLine();
                    System.out.print("Em cartaz: ");
                    String emCartaz = Sc.nextLine();
                    System.out.print("Atores: ");
                    String atores = Sc.nextLine();
                    System.out.print("Diretor: ");
                    String diretor = Sc.nextLine();

                    filme.cadastrar(new Filme(titulo, duracao, sinopse, genero, emCartaz, atores, diretor));

                    break;
                
                case 3:
                    
            }
        } while (escolha != 8);
    
    }

    public static void Menu() {
        System.out.println("[===========CINEMA============]");
            System.out.println("[1]Login                      ]");
            System.out.println("[2]Cadastrar filmes           ]");
            System.out.println("[3]Buscar e selecionar o filme]");
            System.out.println("[4]Ir para o ingresso         ]");
            System.out.println("[5]Alimentacao                ]");
            System.out.println("[6]Pagamento                  ]");
            System.out.println("[7]Localidade                 ]");
            System.out.println("[8]Sair                       ]");
            System.out.println("[=============================]");
    }
}
