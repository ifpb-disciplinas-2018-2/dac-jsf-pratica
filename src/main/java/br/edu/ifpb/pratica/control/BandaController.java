package br.edu.ifpb.pratica.control;

import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import br.edu.ifpb.pratica.model.Banda;
import br.edu.ifpb.pratica.manager.GerenciadorBanda;
import java.util.List;

/**
 *
 * @author murillo
 */
@Named
@SessionScoped
public class BandaController {
    
    Banda banda;
    GerenciadorBanda gerenciador;
    
    public BandaController() {
        banda = new Banda();
        gerenciador = new GerenciadorBanda();
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }
    
    public List<Banda> listar(){
        return null;
    }
    
    public String salvar(){
        return null;
    }
    
    public String atualizar(){
        return null;
    }
    
}
