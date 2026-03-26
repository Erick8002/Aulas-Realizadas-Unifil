package sistemaCadastro;

public class Departamento {
    private String cargo;

    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public String toString(){
        return String.format(
                "%s",
                getCargo()
        );
    }
}
