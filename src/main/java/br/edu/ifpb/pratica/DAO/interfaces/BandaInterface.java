package br.edu.ifpb.pratica.DAO.interfaces;

import br.edu.ifpb.pratica.model.Banda;
import java.util.List;

/**
 *
 * @author fernanda
 */
public interface BandaInterface {
    
    boolean salvar (Banda banda);
    boolean excluir (int id);
    boolean atualizar (Banda banda);
    List<Banda> listarBandas ();
}
