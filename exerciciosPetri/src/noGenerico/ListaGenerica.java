package noGenerico;

public class ListaGenerica {
    NoGenerico inicio;
    NoGenerico ultimo;

    public ListaGenerica() {
        this.inicio = new NoGenerico(null);
        this.ultimo = this.inicio;
    }
}
