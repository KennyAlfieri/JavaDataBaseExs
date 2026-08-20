package dao;

import factory.ConnectionFactory;
import model.Vendedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class VendedorDAO implements GenericDAO<Vendedor,  Integer>{

    @Override
    public void inserir(Vendedor entidade) {
        String sql = "INSERT INTO java_vendedor (nome) VALUES (?)";

        try(Connection connection = ConnectionFactory.obterConexao();
            PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1,entidade.getNome());
            ps.execute();

        }
        catch(SQLException e ){
            System.out.println(e);
        }
    }

    @Override
    public List<Vendedor> listar() {
        return null;
    }
}
