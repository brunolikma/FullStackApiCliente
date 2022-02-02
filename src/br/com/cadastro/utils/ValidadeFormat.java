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
    private static String removeSpecialCharacter (String cpf) {
        return cpf != null ? cpf.replaceAll("[^0-9]", "") : null;
    }

    private static String cpfStandard (String cpf) {
        return cpf.substring(0,3) + "." + cpf.substring(3,6) +  "." + cpf.substring(6,9) +  "-" + cpf.substring(9, cpf.length());
    }

    public static String cpfFinal (String cpf) {
        return cpfStandard(amountValidCpf(removeSpecialCharacter(cpf)));
    }
}
