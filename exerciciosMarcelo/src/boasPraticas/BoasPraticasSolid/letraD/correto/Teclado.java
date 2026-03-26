package boasPraticas.BoasPraticasSolid.letraD.correto;

public class Teclado implements DispositivoEntrada{
    @Override
    public void digitar() { 
        System.out.println("Digitando com teclado normal");
    }
}
