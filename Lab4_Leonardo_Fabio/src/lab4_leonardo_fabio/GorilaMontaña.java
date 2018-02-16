
package lab4_leonardo_fabio;


public class GorilaMontaña extends Primate{
    private int IQ;

    public GorilaMontaña() {
        super();
    }

    public GorilaMontaña(int IQ, String Area, Double cantidad_contido, String planeta, String lugar_naciomiento, String nombre, String grupo_sanguineo, String sexo, String altura, String peso) {
        super(Area, cantidad_contido, planeta, lugar_naciomiento, nombre, grupo_sanguineo, sexo, altura, peso);
        this.IQ = IQ;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    @Override
    public String toString() {
        return "Gorila de Montaña{" + "IQ=" + IQ + '}';
    }
    
    
    
    
}
