package exerciciosMarcelo.src.exerciciosInterface.moduloNotificacao;

public interface Exportavel {
    String exportar();
    default  String cabecalho(){
        return "---EXPORT---";
    }
}