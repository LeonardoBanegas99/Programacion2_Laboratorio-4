package lab4_leonardo_fabio;

public class AvionComercial extends AereoNormal {

    private int numpasajeros;
    private boolean pilotoauto;

    public AvionComercial() {
    }

    public AvionComercial(int numpasajeros, boolean pilotoauto, String gasolina, String paispartida, String paisllegada, boolean tanquelleno, int distancia, int altitud) {
        super(gasolina, paispartida, paisllegada, tanquelleno, distancia, altitud);
        this.numpasajeros = numpasajeros;
        this.pilotoauto = pilotoauto;
    }

    public int getNumpasajeros() {
        return numpasajeros;
    }

    public void setNumpasajeros(int numpasajeros) {
        this.numpasajeros = numpasajeros;
    }

    public boolean isPilotoauto() {
        return pilotoauto;
    }

    public void setPilotoauto(boolean pilotoauto) {
        this.pilotoauto = pilotoauto;
    }

    @Override
    public String toString() {
        return "AvionComercial{" + "numpasajeros=" + numpasajeros + ", pilotoauto=" + pilotoauto + '}';
    }
    
}
