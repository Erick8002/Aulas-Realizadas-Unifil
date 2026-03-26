package boasPraticas.boasPraticasBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros;
    private int totalEmprestimos;

    public Biblioteca() {
        livros = new ArrayList<>();
        totalEmprestimos = 0;
    }

    public boolean adicionarLivro(String titulo) {
        if (titulo == null || titulo.trim().length() < 3)
            return false;
        for (Livro livro : livros) {
            if (livro.equalsIgnoreCase(titulo))
                return false;
        }
        livros.add(new Livro(titulo));
        return true;
    }

    public boolean emprestarLivro(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).equalsIgnoreCase(titulo)) {
                livros.remove(i);
                totalEmprestimos++;
                return true;
            }
        }
        return false;
    }

    public List<Livro> listarLivros() {
        return livros;
    }

    public int getTotalEmprestimos() {
        return totalEmprestimos;
    }

    public int getQuantidadeLivros() {
        return livros.size();
    }
}