package exerciciosMarcelo.src.exerciciosInterface.moduloNotificacao;

public class RelatorioVendas implements Exportavel{
    @Override
    public String exportar() {
        return cabecalho() + "\nVendas: Produto A - 10 unidades";
    }
}