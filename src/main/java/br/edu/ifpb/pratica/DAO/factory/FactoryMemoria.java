package br.edu.ifpb.pratica.DAO.factory;

import br.edu.ifpb.pratica.DAO.implementations.BandaImplDao;
import br.edu.ifpb.pratica.DAO.interfaces.FactoryDAO;
import java.sql.SQLException;


/**
 *
 * @author rodger
 */
public class FactoryMemoria implements FactoryDAO{

    @Override
    public BandaImplDao getDaoBanda() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }


}
