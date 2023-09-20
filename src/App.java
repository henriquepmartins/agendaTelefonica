//Importação do framework de utilidades do java.
import java.util.*;

//Criação de variáveis e scanners.
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int menu;
        String nome, sexo, telefone, email;

//Laço de repetição que retorna a escolha do usuario 
        do {
            exibeMenu();
            menu = sc.nextInt();

            switch (menu) {
                case 1: // Cadastro de contato
                    System.out.println("Cadastrar Contato");
                    System.out.println("Digite o nome do contato\n");
                    nome = sc.next();

                    System.out.println("\nDigite o sexo do contato");
                    sexo = sc.next();

                    System.out.println("\nDigite o telefone do contato");
                    telefone = sc.next();

                    System.out.println("\nDigite o email do contato");
                    email = sc.next();

                    Contato novoContato = new Contato(nome, sexo, telefone, email);
                    Agenda.adicionarContato(novoContato);
                    break;

                case 2: // Editar Contato
                    System.out.println("Editar Contato");
                    System.out.println("\nDigite o código do Contato a ser alterado.");
                    int codigo = sc.nextInt();
                    Contato contatoExistente = Agenda.buscar(codigo);

                    if (contatoExistente != null) {
                        System.out.println("\nDigite o novo nome do Contato");
                        String novoNome = sc.next();

                        System.out.println("\nDigite o novo sexo do Contato");
                        String novoSexo = sc.next();

                        System.out.println("\nDigite o novo telefone do Contato");
                        String novoTelefone = sc.next();

                        System.out.println("\nDigite o novo email do Contato");
                        String novoEmail = sc.next();

                        contatoExistente.setNome(novoNome);
                        contatoExistente.setSexo(novoSexo);
                        contatoExistente.setTelefone(novoTelefone);
                        contatoExistente.setEmail(novoEmail);
                        System.out.println("Contato alterado com sucesso");
                    } else {
                        System.out.println("Contato não encontrado");
                    }
                    break;

                case 3: // Excluir Contato
                    System.out.println("Excluir Contato");
                    System.out.println("Digite o código do Contato a ser deletado.\n");
                    codigo = sc.nextInt();

                    if (Agenda.remover(codigo)) {
                        System.out.println("Contato removido com sucesso\n");
                    } else {
                        System.out.println("Contato não encontrado\n");
                    }
                    break;

                case 4: // Listar contatos
                    System.out.println("Lista de Contatos");
                    System.out.println(Agenda.listar());
                    break;

                case 5: // Sair
                    System.out.println("Saindo da Agenda de Contatos");
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        } while (menu != 5);
    }

    //Interface
    static void exibeMenu() {
        System.out.println("######## Agenda #######");
        System.out.println("1 - Cadastre um novo Contato");
        System.out.println("2 - Editar um Contato");
        System.out.println("3 - Excluir um Contato");
        System.out.println("4 - Consultar Contatos");
        System.out.println("5 - Sair da Agenda");
    }
    }

