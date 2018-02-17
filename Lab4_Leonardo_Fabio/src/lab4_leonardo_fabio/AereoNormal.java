package lab4_leonardo_fabio;

public class AereoNormal extends MediosdeTransporte {

    private String gasolina;
    private String paispartida;
    private String paisllegada;

    public AereoNormal() {
    }

    public AereoNormal(String gasolina, String paispartida, String paisllegada, boolean tanquelleno, int distancia, int altitud) {
        super(tanquelleno, distancia, altitud);
        this.gasolina = gasolina;
        this.paispartida = paispartida;
        this.paisllegada = paisllegada;
    }

    public String getGasolina() {
        return gasolina;
    }

    public void setGasolina(String gasolina) {
        this.gasolina = gasolina;
    }

    public String getPaispartida() {
        return paispartida;
    }

    public void setPaispartida(String paispartida) {
        this.paispartida = paispartida;
    }

    public String getPaisllegada() {
        return paisllegada;
    }

    public void setPaisllegada(String paisllegada) {
        this.paisllegada = paisllegada;
    }

    @Override
    public String toString() {
        return super.toString()+"AereoNormal{" + "gasolina=" + gasolina + ", paispartida=" + paispartida + ", paisllegada=" + paisllegada + '}';
    }

    

    public boolean llenarTanque() {
        return true;
    }

}
