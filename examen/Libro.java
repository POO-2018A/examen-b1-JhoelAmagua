package examen;

public class Libro {
    
    private String titulo;
    private Autor autor;
    private int anio;
    private boolean favorito;

    @Override
    public String toString() {
        return "\nTitulo: " + titulo+ "\nAño: " + anio + "\nAUTOR " + autor ;
    }
    
    public Libro(String titulo, Autor autor, int anio, boolean favorito) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.favorito = favorito;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }
    
    
}
