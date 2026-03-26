package boasPraticas.BoasPraticasSolid.letraD.correto;

public class MainC {
    public static void main(String[] args) {
        ComputadorC pc1 = new ComputadorC(new Teclado());
        pc1.digitar();

        ComputadorC pc2 = new ComputadorC(new TecladoBluetooth());
        pc2.digitar();
    }
}
