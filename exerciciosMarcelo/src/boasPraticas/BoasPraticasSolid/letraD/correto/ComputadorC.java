package exerciciosMarcelo.src.boasPraticas.BoasPraticasSolid.letraD.correto;

public class ComputadorC implements DispositivoEntrada{
    private DispositivoEntrada dispositivos;

    public ComputadorC(DispositivoEntrada dispositivos){
        this.dispositivos = dispositivos;
    }

    @Override
    public void digitar() {
        dispositivos.digitar();
    }
}
