package exerciciosMarcelo.exerciciosInterface.moduloNotificacao;

public class RelatorioEstoque implements Exportavel{
    @Override
    public String exportar() {
        return cabecalho() + "\n{Relatório JSON}";
    }

}
