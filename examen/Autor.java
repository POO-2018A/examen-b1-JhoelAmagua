package examen;

import java.util.Objects;

public class Autor {
    private String nombreautor;
    private String pais;

    

    @Override
    public String toString() {
        return "\nNombre: " + nombreautor + "\nPais: " + pais+"\n";
    }

    public Autor(String nombreautor, String pais) {
        this.nombreautor = nombreautor;
        this.pais = pais;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
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
        final Autor other = (Autor) obj;
        if (!Objects.equals(this.nombreautor, other.nombreautor)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return true;
    }
    
    public String getNombreautor() {
        return nombreautor;
    }

    public void setNombreautor(String nombreautor) {
        this.nombreautor = nombreautor;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    
    
    
}
