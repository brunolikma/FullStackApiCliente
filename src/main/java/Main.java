import br.com.cadastro.model.Clientes;

public class Main {
    public static void main(String[] args) {
        Clientes bruno = new Clientes();

        bruno.setCpf("327sdasdasdadasd387sdadasdasdasd356asdadasd60-d-ad-sad-ada-dad-a");
        bruno.setNomeCompleto("Bruno Lima de Santana");
        bruno.setDdd("13");
        bruno.setTelefone("981731755");

        System.out.println(bruno.toString());

    }
}
