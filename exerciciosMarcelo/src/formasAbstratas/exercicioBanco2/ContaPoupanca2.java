package exerciciosMarcelo.src.formasAbstratas.exercicioBanco2;

public class ContaPoupanca2 extends Conta{
    @Override
    int getTaxa() {
        return this.total*3;
    }
}
