package Factory;

public class LibroDigital implements Libro1{

    private String titulo;
    private String autor;

    public LibroDigital(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String getTipo() {
        return "Digital";
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getAutor() {
        return autor;
    }
}
