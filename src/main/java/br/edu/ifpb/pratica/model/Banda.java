package br.edu.ifpb.pratica.model;


import java.util.List;
import java.util.Objects;


/**
 *
 * @author jonas
 */
public class Banda {
    
    private int id;
    private String nomeFantasia;
    private String localOrigem;
    private List<Integrante> integrantes;;

    public Banda(int id, String nomeFantasia, String localOrigem, List<Integrante> integrantes) {
        this.id = id;
        this.nomeFantasia = nomeFantasia;
        this.localOrigem = localOrigem;
        this.integrantes = integrantes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    public List<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Banda other = (Banda) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nomeFantasia, other.nomeFantasia)) {
            return false;
        }
        if (!Objects.equals(this.localOrigem, other.localOrigem)) {
            return false;
        }
        if (!Objects.equals(this.integrantes, other.integrantes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Banda{" + "id=" + id + ", nomeFantasia=" + nomeFantasia + ", localOrigem=" + localOrigem + ", integrantes=" + integrantes + '}';
    }

    
    
        
}
