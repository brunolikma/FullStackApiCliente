package br.com.cadastro.utils;

public class ValidadeFormat {

    private ValidadeFormat() {                          //construtor privado para ninguem dar new

    }

    private static String amountValidCpf (String cpf) {
        if (cpf == null || cpf.length() != 11 ){
            System.out.println("CPF INVALIDO !!");
            throw new IllegalArgumentException("CPF INVALIDO");
        }
        return cpf;
    }
    private static String removeSpecialCharacter (String texto) {
        return texto != null ? texto.replaceAll("[^0-9]", "") : null;
    }

    private static String cpfStandard (String cpf) {
        return cpf.substring(0,3) + "." + cpf.substring(3,6) +  "." + cpf.substring(6,9) +  "-" + cpf.substring(9, cpf.length());
    }

    public static String cpfFinal (String cpf) {
        return cpfStandard(amountValidCpf(removeSpecialCharacter(cpf)));
    }

    public static String phoneOrCellPhone (String telefone) {
        if (telefone.length() == 8){
            return formatTelefoneFixo(telefone);
        }else if (telefone.length() == 9){
            return formatCelular(telefone);
        } else {
            throw new IllegalArgumentException("Numero invalido !");
        }
    }

    public static String formatCelular(String fone){

        return null;
    }

    public static String formatTelefoneFixo(String fone){
        return null;
    }
}
