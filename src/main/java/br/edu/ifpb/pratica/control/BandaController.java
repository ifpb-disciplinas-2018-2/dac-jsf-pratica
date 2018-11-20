package br.edu.ifpb.pratica.control;


import javax.inject.Named;
import br.edu.ifpb.pratica.model.Banda;
import br.edu.ifpb.pratica.manager.GerenciadorBanda;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author murillo
 */
@Named
@SessionScoped
public class BandaController implements Serializable{
    
    Banda banda = new Banda();
    GerenciadorBanda gerenciador = new GerenciadorBanda();

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }
    
    public List<Banda> listar(){
        return this.gerenciador.listarBandas();      
    }
    
    public String salvar(){
        this.gerenciador.salvarBanda(this.banda);
        return null;
    }
    
    public String atualizar(){
        this.gerenciador.atualizarBanda(this.banda);
        return null;
    }
    
    public String deletar(){
        
        this.gerenciador.excluirBanda(banda.getId());
        return null;
    }
    
}
