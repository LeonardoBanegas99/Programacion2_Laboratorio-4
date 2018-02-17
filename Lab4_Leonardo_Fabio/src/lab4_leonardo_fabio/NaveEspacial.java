package lab4_leonardo_fabio;

public class NaveEspacial extends Espacial {

    private int numpropulsores;

    public NaveEspacial() {
    }

    public NaveEspacial(int numpropulsores, String combustiblle, String planetapartida, String planetallegada, boolean tanquelleno, int distancia, int altitud) {
        super(combustiblle, planetapartida, planetallegada, tanquelleno, distancia, altitud);
        this.numpropulsores = numpropulsores;
    }

    public int getNumpropulsores() {
        return numpropulsores;
    }

    public void setNumpropulsores(int numpropulsores) {
        this.numpropulsores = numpropulsores;
    }

    @Override
    public String toString() {
        return super.toString()+"NaveEspacial{" + "numpropulsores=" + numpropulsores + '}';
    }

   
    
    @Override
    public boolean llenarTanque() {
        return true;
    }
}
