/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pratica.DAO.interfaces;

import br.edu.ifpb.pratica.model.Integrante;
import java.util.List;

/**
 *
 * @author rodger
 */
public interface IntegrantesInterface {
    boolean salvar (Integrante Integrantes);
    boolean excluir (int id);
    boolean atualizar (Integrante Integrante);
    List<Integrante> listarIntegrantes();
}
