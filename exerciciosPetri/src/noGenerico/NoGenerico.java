package noGenerico;

public class NoGenerico<T> {
    T conteudo;
    NoGenerico prox;
    NoGenerico ant;

    public NoGenerico(T conteudo) {
        this.conteudo = conteudo;
        this.prox = null;
        this.ant = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoGenerico getProx() {
        return prox;
    }

    public void setProx(NoGenerico prox) {
        this.prox = prox;
    }

    public NoGenerico getAnt() {
        return ant;
    }

    public void setAnt(NoGenerico ant) {
        this.ant = ant;
    }

    
}