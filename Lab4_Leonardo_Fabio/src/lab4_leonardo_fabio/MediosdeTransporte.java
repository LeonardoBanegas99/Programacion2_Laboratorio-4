package lab4_leonardo_fabio;

import java.util.ArrayList;

public class MediosdeTransporte {

    private boolean tanquelleno;
    private int distancia;
    private int altitud;
    private ArrayList<Primate> primates = new ArrayList();

    public MediosdeTransporte() {
    }

    public MediosdeTransporte(boolean tanquelleno, int distancia, int altitud) {
        this.tanquelleno = tanquelleno;
        this.distancia = distancia;
        this.altitud = altitud;
    }

    public boolean isTanquelleno() {
        return tanquelleno;
    }

    public void setTanquelleno(boolean tanquelleno) {
        this.tanquelleno = tanquelleno;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }

    public ArrayList<Primate> getPrimates() {
        return primates;
    }

    public void setPrimates(ArrayList<Primate> primates) {
        this.primates = primates;
    }

    @Override
    public String toString() {
        return "MediosdeTransporte{" + "tanquelleno=" + tanquelleno + ", distancia=" + distancia + ", altitud=" + altitud + ", primates=" + primates + '}';
    }

    
    
    public boolean llenarTanque(){
        return true;
    }
}
