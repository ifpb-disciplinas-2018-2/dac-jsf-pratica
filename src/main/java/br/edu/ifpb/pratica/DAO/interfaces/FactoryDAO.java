package br.edu.ifpb.pratica.DAO.interfaces;

import br.edu.ifpb.pratica.DAO.implementations.BandaImplDao;

/**
 *
 * @author rodger
 */
public interface FactoryDAO {
    BandaImplDao getDaoBanda();
    public IntegrantesInterface criaDaoIntegrante();
}
