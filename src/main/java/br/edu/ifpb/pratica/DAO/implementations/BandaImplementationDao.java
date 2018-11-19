package br.edu.ifpb.pratica.DAO.implementations;

import br.edu.ifpb.pratica.DAO.interfaces.BandaInterface;
import br.edu.ifpb.pratica.model.Banda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernanda
 */
public class BandaImplementationDao implements BandaInterface{
    
    private List<Banda> dao = new ArrayList<>();

    @Override
    public boolean salvar(Banda banda) {
        this.dao.add(banda);
        return true;
    }

    @Override
    public boolean excluir(int id) {
        dao.removeIf(b -> id == b.getId());
        return true;
    }

    @Override
    public boolean atualizar(Banda banda) {
        dao.removeIf((Banda b) -> b.getId() == banda.getId());
        dao.add(banda);
        return true; 
    }

    @Override
    public List<Banda> listarBandas() {
        return dao;
    }
}
