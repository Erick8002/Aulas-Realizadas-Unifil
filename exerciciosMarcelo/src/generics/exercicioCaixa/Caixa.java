package exerciciosMarcelo.src.generics.exercicioCaixa;

public class Caixa<T> {
    private T item;

    public void guardar(T item){
        this.item = item;
    }

    public T obter(){
        return this.item;
    }

    public boolean estaVazia(){
        if(this.item == null){
            return true;
        } else return false;
    }
}
