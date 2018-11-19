package br.edu.ifpb.pratica.control;

import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import br.edu.ifpb.pratica.model.Integrante;
/**
 *
 * @author murillo
 */
@Named
@SessionScoped
public class IntegranteController {
    
    Integrante integrante;

    public IntegranteController() {
        integrante = new Integrante(); 
    }

    public Integrante getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Integrante integrante) {
        this.integrante = integrante;
    }
    
}
