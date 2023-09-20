//Importação do framework de utilidades do java.
import java.util.ArrayList;
import java.util.List;

//Criação da classe Agenda.
public class Agenda {

    //Criação de array para armazenar os contatos
    private static List<Contato> listaContato = new ArrayList<>();

    //Adicionar contatos
    public static void adicionarContato(Contato contato) {
        listaContato.add(contato);
    }

    //Remover contatos
    public static boolean remover(int codigo) {
        for (Contato contato : listaContato) {
            if (contato.getCodigo() == codigo) {
                listaContato.remove(contato);
                return true;
            }
        }
        return false;
    }

    //Buscar contatos
    public static Contato buscar(int codigo) {
        for (Contato contato : listaContato) {
            if (contato.getCodigo() == codigo) {
                return contato;
            }
        }
        return null;
    }

    //Listar todos os contatos
    public static String listar() {
        StringBuilder lista = new StringBuilder();
    
        for (Contato contato : listaContato) {
            lista.append(contato.getNome()).append(" [id:").append(contato.getCodigo()).append("]").append("\n");
        }
        
        return lista.toString();
    }
}
