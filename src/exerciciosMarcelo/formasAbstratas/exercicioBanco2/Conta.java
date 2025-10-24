package exerciciosMarcelo.formasAbstratas.exercicioBanco2;

public abstract class Conta {
    protected int total = 100;

    public void mostrarValor(){
        System.out.println(total);
    }
    abstract int getTaxa();

    }

