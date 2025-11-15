package provaMarcelo.superHeroi;

public class Endereco {
    private String rua;
    private String cidade;
    private String pais;

    public Endereco(){}

    public Endereco(String rua, String cidade, String pais){
        this.rua = rua;
        this.cidade = cidade;
        this.pais = pais;
    }

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public String toString(){
        return String.format(
                "%s, " +
                        "%s - " +
                        "%s",
                getRua(), getCidade(), getPais()
        );

    }
}
