import controller.AlimentoController;
import controller.CinemaController;
import controller.FilmeController;
import controller.IngressoController;
import controller.LocalidadeController;
import controller.SalaController;
import controller.SessaoController;
import controller.PagamentoController;

import model.Cliente;
import model.Filme;
import model.Ingresso;
import model.Localidade;
import model.Administracao;
import model.Alimento;
import model.Pagamento;
import model.Cinema;

import utils.Sc;

public class App {
    public static void main(String[] args) {
        
        // Instancias dos controllers de cada classe para que possamos chamar os métodos

        AlimentoController alimento = new AlimentoController();
        CinemaController cinema = new CinemaController();
        FilmeController filme = new FilmeController();
        IngressoController ingresso = new IngressoController();
        LocalidadeController localidade = new LocalidadeController();
        SalaController sala = new SalaController();
        SessaoController sessao = new SessaoController();
        PagamentoController pagamento = new PagamentoController();
        
        // Instâncias de ingressos para deixar pré-cadastrados
        ingresso.addIngresso(new Ingresso(10.0, "meia", 15, 8.8, 1));
        ingresso.addIngresso(new Ingresso(20.0, "inteira", 10, 8.8, 1));
        ingresso.addIngresso(new Ingresso(20.0, "inteira", 11, 8.8, 1));

        // Instâncias de filmes para deixar pré-cadastrados
        filme.cadastrar(new Filme("Thor", "120min", "Thor", "Ação", "Sim", "Chris Hemsworth", "Alan Taylor"));
        filme.cadastrar(new Filme("Batalha contra zumbis", "1h 30min", "Batalha", "Ação", "Sim", "Chris Rock", "Zack Snyder"));
        filme.cadastrar(new Filme("Até o último homem", "2h 19min", "A vida de Desmond Doss", "Drama", "Sim", "Andrew Garfield", "Mel Gibson"));

        // Instâncias de alimentos para deixar pré-cadastrados
        alimento.addAlimento(new Alimento("Pipoca grande", "Combo Pipoca Grande", "3 pipocas", "Coca-cola 2L", "Com doce", 35.0, "3 Pipocas grandes mais Coca-cola 2L" ));
        alimento.addAlimento(new Alimento("Pipoca média", "Combo Pipoca media", "2 pipocas", "Coca-cola 1L", "Sem doce", 25.0, "2 Pipocas medias mais Coca-cola 1L" ));
        alimento.addAlimento(new Alimento("Pipoca pequena", "Combo Pipoca pequena", "1 pipocas", "Coca-cola 600ml", "Sem doce", 15.0, "1 Pipocas pequena mais Coca-cola 600ml" ));

        // Instâncias de localidades para deixar pré-cadastrados
        localidade.cadastrar(new Localidade(new Cinema("Cineminha Weslin & Clebin"), "Iguatemi Brasília", "72800-450", "lá em brasília"));
        localidade.cadastrar(new Localidade(new Cinema("Cineminha Weslin & Clebin"),"Shopping Santa Maria", "72542-506", "Perto do posto na santa maria"));
        localidade.cadastrar(new Localidade(new Cinema("Cineminha Weslin & Clebin"),"Park Shopping", "75830-280", "Perto do metro do guara"));

        int escolha;
        do {
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
                    System.out.println("Você pode procurar filmes buscando pelo nome, gênero, ator/atriz e diretor!!");
                    System.out.print("Digite o que você deseja buscar: ");
                    String busca = Sc.nextLine();
                    System.out.println("===============");
                    filme.buscar(busca);
                    System.out.println("===============");

                    // Método para selecionar o filme ainda está incompleto!
                    System.out.println();
                    System.out.print("Qual filme deseja selecionar: ");
                    String selecionar = Sc.nextLine();
                    filme.confirmarFilmes(selecionar);
                    System.out.println();
                    break;
                
                case 4:
                    System.out.println("Lista de ingressos!");
                    ingresso.listar(new Ingresso());

                    // Métodos para selecionar poltrona e pagamento ainda estão incompletos!!

                    break;
                
                case 5:
                    System.out.println("Bem vindo a escolha da alimentação!");
                    System.out.println();
                    alimento.listarAlimento(new Alimento());
                    System.out.print("Digite o nome de qual você deseja selecionar: ");
                    String nomeAlimento = Sc.nextLine();
                    alimento.selecionarLanche(nomeAlimento);
                    System.out.println();
                    System.out.print("Deseja prosseguir (S/N)? ");
                    String resp = Sc.nextLine();
                    if (resp == "S") {
                        alimento.prosseguir(resp);
                        break;
                    } else {
                        System.out.println("");
                    }
                    
                    break;
                
                case 6:
                    System.out.println("Bem vindo ao método de pagamento!");
                    int resposta;
                    do {
                        MenuPagamento();    
                        System.out.print("Qual método deseja: ");
                        resposta = Sc.nextInt();
                        switch (resposta) {
                            case 1:
                                System.out.print("Número do cartão: ");
                                String numero = Sc.nextLine();
                                System.out.print("Nome impresso: ");
                                String nome = Sc.nextLine();
                                System.out.print("Data de validade: ");
                                String data = Sc.nextLine();
                                System.out.print("Código de segurança: ");
                                String codigo = Sc.nextLine();
                                System.out.print("CPF: ");
                                String cpf = Sc.nextLine();

                                pagamento.addPagamento(new Pagamento(numero, nome, data, codigo, cpf));

                                break;
                            
                            case 2:
                                System.out.print("Digite o seu pix: ");
                                String pix = Sc.nextLine();
                                System.out.print("CPF: ");
                                String cpf_2 = Sc.nextLine();

                                pagamento.addPagamento(new Pagamento(cpf_2, pix));

                                break;

                            case 3:
                                System.out.print("Digite a quantidade que vai pagar em dinheiro: ");
                                Double dinheiro = Sc.nextDouble();

                                pagamento.addPagamento(new Pagamento(dinheiro));

                                break;
                            
                            case 4:
                                System.out.println("Saindo....");
                        }
                    } while (resposta <= 3);

                    // Método Total() ainda está em desenvolvimento!!
                    break;
                
                case 7:
                    System.out.println("O locais que o cinema se encontra são: ");
                    localidade.listar(new Localidade());

                    break;
                
                case 8:
                    System.out.println("=========================");
                    System.out.println("Obrigado por usar nosso programa Cinema! Volte mais!!");
                    System.out.println("=========================");

                    break;
            }
        } while (escolha < 8);
    
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

    public static void MenuPagamento() {
        System.out.println("[===============Método Pagamento===============]");
        System.out.println("[1] Cartão de crédito                          ]");
        System.out.println("[2] Pix                                        ]");
        System.out.println("[3] Dinheiro                                   ]");
        System.out.println("[4] Sair                                       ]");
        System.out.println("[==============================================]");
    }
}
