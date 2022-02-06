package br.com.cadastro.DAO;

import br.com.cadastro.DAO.BaseDAO;
import br.com.cadastro.model.Clientes;

public class teste {
    public static void main(String[] args) {
//        BaseDAO dao = new BaseDAO();
//        System.out.println(dao.getConnection());

        ClientesDAO dao1 = new ClientesDAO();

        Clientes cliente = new Clientes();
        cliente.setNomeCompleto("Bruno Lima de Santana");
        cliente.setCpf("327.856.378-60");
        cliente.setDdd("13");
        cliente.setTelefone("98173-1755");
        dao1.inserir(cliente);


    }
}
