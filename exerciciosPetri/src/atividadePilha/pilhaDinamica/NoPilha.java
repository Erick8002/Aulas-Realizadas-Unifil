package atividadePilha.pilhaDinamica;

public class NoPilha {
    String conteudo;
    NoPilha prox;

    public NoPilha(String conteudo) {
        this.conteudo = conteudo;
        this.prox = null;
    }
}