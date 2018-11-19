/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pratica.DAO.implementations;

import br.edu.ifpb.pratica.DAO.interfaces.IntegrantesInterface;
import br.edu.ifpb.pratica.model.Integrante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rodger
 */
public class IntegranteDao implements IntegrantesInterface {

     private List<Integrante> dao = new ArrayList<>();

    @Override
    public boolean salvar(Integrante Integrante) {
        this.dao.add(Integrante);
        return true;
    }

    @Override
    public boolean excluir(int id) {
        dao.removeIf(b -> id == b.getId());
        return true;
    }

    @Override
    public boolean atualizar(Integrante integrante) {
        dao.removeIf((Integrante b) -> b.getId() == integrante.getId());
        dao.add(integrante);
        return true; 
    }

    @Override
    public List<Integrante> listarIntegrantes() {
        return dao;
    }
    
}
