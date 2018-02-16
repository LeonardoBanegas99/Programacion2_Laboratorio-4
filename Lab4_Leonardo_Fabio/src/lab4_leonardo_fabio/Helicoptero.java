package lab4_leonardo_fabio;

public class Helicoptero extends AereoNormal{
    private int numhelice;
    private int numdepatas;

    public Helicoptero() {
    }

    public Helicoptero(int numhelice, int numdepatas, String gasolina, String paispartida, String paisllegada, boolean tanquelleno, int distancia, int altitud) {
        super(gasolina, paispartida, paisllegada, tanquelleno, distancia, altitud);
        this.numhelice = numhelice;
        this.numdepatas = numdepatas;
    }

    public int getNumhelice() {
        return numhelice;
    }

    public void setNumhelice(int numhelice) {
        this.numhelice = numhelice;
    }

    public int getNumdepatas() {
        return numdepatas;
    }

    public void setNumdepatas(int numdepatas) {
        this.numdepatas = numdepatas;
    }

    @Override
    public String toString() {
        return "Helicoptero{" + "numhelice=" + numhelice + ", numdepatas=" + numdepatas + '}';
    }
    
    
}
