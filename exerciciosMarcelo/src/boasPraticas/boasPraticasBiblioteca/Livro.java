package exerciciosMarcelo.src.boasPraticas.boasPraticasBiblioteca;

public class Livro {
    private String titulo;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean equalsIgnoreCase(String outroTitulo) {
        return titulo.equalsIgnoreCase(outroTitulo.trim());
    }

    @Override
    public String toString() {
        return titulo;
    }
}
