package br.edu.ifpb.pratica.DAO.factory;

import br.edu.ifpb.pratica.DAO.interfaces.FactoryDAO;
/**
 *
 * @author rodger
 */
public class Factory {
    public static FactoryDAO createFactory(){
        return new FactoryBD();
    }
}
