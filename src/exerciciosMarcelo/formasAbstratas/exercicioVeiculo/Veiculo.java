package exerciciosMarcelo.formasAbstratas.exercicioVeiculo;

public abstract class Veiculo {
    String tipo(){
        return getClass().getSimpleName();
    }

    abstract void mover();
}
