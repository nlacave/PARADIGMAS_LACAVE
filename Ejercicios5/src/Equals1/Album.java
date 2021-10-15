package Equals1;

public class Album {
    private String artista;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String titulo;

    @Override
    public boolean equals(Object obj) {
        Album a = (Album) obj;
        return this.artista == a.artista && this.titulo == a.titulo;
    }

}
