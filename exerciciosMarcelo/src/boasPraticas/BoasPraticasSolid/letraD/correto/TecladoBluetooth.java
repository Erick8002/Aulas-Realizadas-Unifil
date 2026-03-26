package boasPraticas.BoasPraticasSolid.letraD.correto;

public class TecladoBluetooth implements DispositivoEntrada{

    @Override
    public void digitar() {
        System.out.println("Digitando com teclado via Bluetooth");
    }
}
