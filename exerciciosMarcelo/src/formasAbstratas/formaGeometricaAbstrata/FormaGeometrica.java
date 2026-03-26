package formasAbstratas.formaGeometricaAbstrata;

public abstract class FormaGeometrica {
    private String nome;

    public FormaGeometrica(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea();

    public String infoDetalhes() {
        return "Forma: " + nome +
                "\nÁrea: " + String.format("%.2f", calcularArea());
    }
}
