/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pratica.manager;

import br.edu.ifpb.pratica.DAO.factory.Factory;
import br.edu.ifpb.pratica.DAO.interfaces.BandaInterface;
import br.edu.ifpb.pratica.DAO.interfaces.FactoryDAO;
import br.edu.ifpb.pratica.model.Banda;
import java.util.List;

/**
 *
 * @author fernanda
 */
public class GerenciadorBanda {
    
    private FactoryDAO factory = null;
    private BandaInterface bandaDao = null;
    
     public GerenciadorBanda() {
        factory = Factory.createFactory();
        bandaDao = factory.getDaoBanda();
    }    
    
     public boolean salvarBanda (Banda banda) {
         return bandaDao.salvar(banda);
     }
     
     public boolean  excluirBanda(Banda banda) {
         return bandaDao.excluir(banda.getId());
     }
     
     public boolean atualizarBanda (Banda banda) {
         return bandaDao.atualizar(banda);
     }
     
     public List<Banda> listarBandas () {
         return bandaDao.listarBandas();
     }
     
}
