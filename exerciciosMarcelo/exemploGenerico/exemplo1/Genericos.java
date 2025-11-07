package exemploGenerico.exemplo1;

public class Genericos<T> {
    private T item;
    public void addItem(T item){
        this.item = item;
    }

    public T getItem(){
        return this.item;
    }
}
