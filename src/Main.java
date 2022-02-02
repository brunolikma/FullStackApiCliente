import br.com.cadastro.Clientes;

public class Main {
    public static void main(String[] args) {
        Clientes bruno = new Clientes();

        bruno.setCpf("3278SDFDFSDFSDFSDFSDDFSD563ASDASDASD78DASDASDASDSADADADASDAS60--------");
        bruno.setNomeCompleto("Bruno Lima de Santana");
        bruno.setTelefone("(13) 9 8173-1755");

        System.out.println(bruno.toString());
    }
}
