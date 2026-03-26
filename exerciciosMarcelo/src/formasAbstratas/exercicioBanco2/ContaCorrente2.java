package formasAbstratas.exercicioBanco2;

public class ContaCorrente2 extends Conta{
    @Override
    int getTaxa() {
        return this.total*2;
    }
}
