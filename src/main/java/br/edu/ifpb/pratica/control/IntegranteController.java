package br.edu.ifpb.pratica.control;

import br.edu.ifpb.pratica.manager.GerenciadorIntegrante;

import javax.inject.Named;
import br.edu.ifpb.pratica.model.Integrante;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
/**
 *
 * @author murillo
 */
@Named
@SessionScoped
public class IntegranteController implements Serializable {
    
    Integrante integrante = new Integrante(); 
    GerenciadorIntegrante gerenciador = new GerenciadorIntegrante();
    
    public Integrante getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Integrante integrante) {
        this.integrante = integrante;
    }
        
    public List<Integrante> listar(){
        
        this.gerenciador.listar();
        
        return null;
    }
    
    public String salvar(){
        
        this.gerenciador.salvar(integrante);
        
        return null;
    }
    
    public String atualizar(){
        
        this.gerenciador.atualizar(integrante);
        
        return null;
    }
    
    public String deletar(){
        
        this.gerenciador.deletar(integrante);
        
        return null;
    }
    
}
