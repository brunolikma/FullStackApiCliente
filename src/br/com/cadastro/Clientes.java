package br.com.cadastro;

import br.com.cadastro.utils.ValidadeFormat;

public class Clientes {
    private String nomeCompleto;
    private String cpf ;
    private String ddd;
    private String telefone;

    public Clientes() {
    }

    public Clientes(String nomeCompleto, String cpf, String ddd,String telefone) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.ddd = ddd;
        this.telefone = telefone;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "Nome: '" + nomeCompleto + '\'' +
                ", CPF: " + ValidadeFormat.cpfFinal(cpf) +
                ", ddd='" + ddd + '\'' +
                ", Telefone: " + telefone +
                '}';
    }
}
