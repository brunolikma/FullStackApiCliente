package br.com.cadastro.DAO;

import br.com.cadastro.model.Clientes;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.cadastro.model.Clientes;

public class ClientesDAO extends BaseDAO {

    public void inserir(Clientes cli){
        conn = getConnection();
        String sql = "insert into clientes (nome, cpf,ddd,telefone) value (?,?,?,?)";
        PreparedStatement ptst;
        try {
            ptst=conn.prepareStatement(sql);
            ptst.setString(1, cli.getNomeCompleto());
            ptst.setString(2, cli.getCpf());
            ptst.setString(3, cli.getDdd());
            ptst.setString(4, cli.getTelefone());
            ptst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
