package br.edu.ifpb.pratica.control;

import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import br.edu.ifpb.pratica.model.Banda;

/**
 *
 * @author murillo
 */
@Named
@SessionScoped
public class BandaController {
    
    Banda banda;

    public BandaController() {
        banda = new Banda();
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }
    
}
