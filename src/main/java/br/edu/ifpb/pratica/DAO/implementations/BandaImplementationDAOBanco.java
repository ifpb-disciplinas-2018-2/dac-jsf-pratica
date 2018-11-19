package br.edu.ifpb.pratica.DAO.implementations;

import br.edu.ifpb.pratica.DAO.connect.ConFactory;
import br.edu.ifpb.pratica.DAO.connect.DataBase;
import br.edu.ifpb.pratica.DAO.interfaces.BandaInterface;
import br.edu.ifpb.pratica.model.Banda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernanda
 */
public class BandaImplementationDAOBanco implements BandaInterface{
    
    private DataBase postgres;
    private Connection connection;

    public BandaImplementationDAOBanco(DataBase postgres, Connection connection) 
            throws ClassNotFoundException, SQLException {
        this.postgres = new DataBase();
        this.connection = ConFactory.getConnection(postgres.getUrl(), 
                postgres.getUser(), postgres.getPassword(), postgres.getClassForName());
    }
    
    @Override
    public boolean salvar(Banda banda) {
        try {
            PreparedStatement createStatement = this.connection.prepareStatement(
                    "INSERT INTO Banda VALUES (?,?);"
            );
            createStatement.setString(1, banda.getLocalOrigem());
            createStatement.setString(2, banda.getNomeFantasia());
            createStatement.executeUpdate();
            createStatement.close();
            connection.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean excluir(int id) {
        try {
            Statement createStatement = this.connection.createStatement();
            ResultSet result = createStatement.executeQuery("DELETE CASCADE FROM Banda WHERE id = ?;"+id);
            createStatement.close();
            connection.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean atualizar(Banda banda) {
        try {
            PreparedStatement createStatement = this.connection.prepareStatement("UPDATE Banda SET localDeorigem = ?, nomeFantasia = ? WHERE id = ?");
            createStatement.setString(1, banda.getLocalOrigem());
            createStatement.setString(2, banda.getNomeFantasia());
            createStatement.setInt(3, banda.getId());
            createStatement.executeUpdate();
            createStatement.close();
            connection.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Banda> listarBandas() {
        List<Banda> lista = new ArrayList<>();
        try {
            Statement createStatement = this.connection.createStatement();
            ResultSet result = createStatement.executeQuery("SELECT * FROM Banda;");
            iterarComBandas(result, lista);
            createStatement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
    private void iterarComBandas(ResultSet result, List<Banda> lista) throws SQLException {
        while (result.next()) {
            lista.add(
                    criarBanda(result)
            );
        }
    }
    
    private Banda criarBanda(ResultSet result) throws SQLException {
        String localDeOrigem = result.getString("localDeOrigem");
        String nomeFantasia = result.getString("nomeFantasia");
        String integrantes = result.getString("");
        int id = result.getInt("id");

        return new Banda(id, localDeOrigem, nomeFantasia);

    }   
}
