package lab4_leonardo_fabio;

import java.util.ArrayList;

public class Viajes {

    private ArrayList<MediosdeTransporte> medios = new ArrayList();

    public Viajes() {
    }

    public ArrayList<MediosdeTransporte> getMedios() {
        return medios;
    }

    public void setMedios(ArrayList<MediosdeTransporte> medios) {
        this.medios = medios;
    }

    @Override
    public String toString() {
        return "Viajes{" + "medios=" + medios + '}';
    }
}
