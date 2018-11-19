package br.edu.ifpb.pratica.DAO.interfaces;

import br.edu.ifpb.pratica.DAO.implementations.BandaImplementationDao;

/**
 *
 * @author rodger
 */
public interface FactoryDAO {
    BandaImplementationDao getDaoBanda();
}
