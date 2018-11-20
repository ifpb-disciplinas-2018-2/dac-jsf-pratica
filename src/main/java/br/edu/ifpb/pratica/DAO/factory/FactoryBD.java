package br.edu.ifpb.pratica.DAO.factory;

import br.edu.ifpb.pratica.DAO.interfaces.FactoryDAO;
import br.edu.ifpb.pratica.DAO.implementations.BandaImplDao;
import br.edu.ifpb.pratica.DAO.implementations.IntegranteDao;
import br.edu.ifpb.pratica.DAO.interfaces.IntegrantesInterface;

import java.sql.SQLException;

/**
 *
 * @author rodger
 */
public class FactoryBD implements FactoryDAO{
     @Override
    public BandaImplDao getDaoBanda() {
        return new BandaImplDao();
    }

    @Override
    public IntegrantesInterface criaDaoIntegrante() {
        return new IntegranteDao();
    }
}
