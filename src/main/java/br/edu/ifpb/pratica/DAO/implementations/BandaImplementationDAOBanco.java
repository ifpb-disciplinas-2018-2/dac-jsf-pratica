package br.edu.ifpb.pratica.DAO.implementations;

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
    
    //private Connection connection = new ConnFactory();

    @Override
    public boolean salvar(Banda banda) {
        try {
            PreparedStatement createStatement = this.connection.prepareStatement(
                    "INSERT INTO Banda VALUES (?,?);"
            );
            createStatement.setString(1, banda.getLocalOrigem());
            createStatement.setString(2, banda.getNomeFantasia());
            createStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean excluir(Banda banda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atualizar(Banda banda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Banda> listarBandas() {
        List<Banda> lista = new ArrayList<>();
        try {
            Statement createStatement = this.connection.createStatement();
            ResultSet result = createStatement.executeQuery("SELECT * FROM Banda;");
            iterarComBandas(result, lista);

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
