package lab4_leonardo_fabio;

public class Cohete extends Espacial {

    private int numseparaciones;

    public Cohete() {
    }

    public Cohete(int numseparaciones, String combustiblle, String planetapartida, String planetallegada, boolean tanquelleno, int distancia, int altitud) {
        super(combustiblle, planetapartida, planetallegada, tanquelleno, distancia, altitud);
        this.numseparaciones = numseparaciones;
    }

    public int getNumseparaciones() {
        return numseparaciones;
    }

    public void setNumseparaciones(int numseparaciones) {
        this.numseparaciones = numseparaciones;
    }

    @Override
    public String toString() {
        return super.toString() + "Cohete{" + "numseparaciones=" + numseparaciones + '}';
    }

    

    @Override
    public boolean llenarTanque() {
        return true;
    }
}
