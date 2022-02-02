import br.com.cadastro.Clientes;
import br.com.cadastro.utils.ValidadeFormat;

public class Main {
    public static void main(String[] args) {
        Clientes bruno = new Clientes();

        bruno.setCpf("327sdasdasdadasd387sdadasdasdasd356asdadasd60-d-ad-sad-ada-dad-a");
        bruno.setNomeCompleto("Bruno Lima de Santana");
        bruno.setTelefone("981731755");

        System.out.println(bruno.toString());

    }
}
