package br.edu.ifpb.pratica.manager;

import br.edu.ifpb.pratica.DAO.factory.Factory;
import br.edu.ifpb.pratica.DAO.interfaces.FactoryDAO;
import br.edu.ifpb.pratica.DAO.interfaces.IntegrantesInterface;
import br.edu.ifpb.pratica.model.Integrante;
import java.util.List;

/**
 *
 * @author murillo
 */
public class GerenciadorIntegrante {
    
    private FactoryDAO factory = null;
    private IntegrantesInterface integranteDao = null;

    public GerenciadorIntegrante() {
        factory = Factory.createFactory();
        integranteDao = factory.criaDaoIntegrante();
    }
    
    public boolean salvar(Integrante integrante){
        return integranteDao.salvar(integrante);
    }
    
    public boolean deletar(Integrante integrante){
        return integranteDao.excluir(integrante.getId());
    }
    
    public boolean atualizar(Integrante integrante){
        return integranteDao.atualizar(integrante);
    }
    
     public List<Integrante> listar(){
        return integranteDao.listarIntegrantes();
    }
    
}
