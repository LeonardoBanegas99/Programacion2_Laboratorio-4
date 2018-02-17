package lab4_leonardo_fabio;

public class SeresVivos {

    private String nombre;
    private String grupo_sanguineo;
    private String sexo;
    private String altura;
    private String peso;

    public SeresVivos() {
    }

    public SeresVivos(String nombre, String grupo_sanguineo, String sexo, String altura, String peso) {
        this.nombre = nombre;
        this.grupo_sanguineo = grupo_sanguineo;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo_sanguineo() {
        return grupo_sanguineo;
    }

    public void setGrupo_sanguineo(String grupo_sanguineo) {
        this.grupo_sanguineo = grupo_sanguineo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "SeresVivos{" + "nombre=" + nombre + ", grupo_sanguineo=" + grupo_sanguineo + ", sexo=" + sexo + ", altura=" + altura + ", peso=" + peso + '}';
    }

    public double LlenarComida() {
        return 0;
    }

    public void llenarCafe() {
        
    }
}
