package br.edu.ifpb.pratica.control;

import br.edu.ifpb.pratica.manager.GerenciadorIntegrante;
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
    GerenciadorIntegrante gerenciador;

    public IntegranteController() {
        integrante = new Integrante(); 
        gerenciador = new GerenciadorIntegrante();
    }

    public Integrante getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Integrante integrante) {
        this.integrante = integrante;
    }
    
}
