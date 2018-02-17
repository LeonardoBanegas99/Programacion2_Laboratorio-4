
package lab4_leonardo_fabio;


public class MonoBaboon extends Primate{
    private String color;

    public MonoBaboon() {
        super();
    }

    public MonoBaboon(String color, String Area, Double cantidad_contido, String planeta, String lugar_naciomiento, String nombre, String grupo_sanguineo, String sexo, String altura, String peso) {
        super(Area, cantidad_contido, planeta, lugar_naciomiento, nombre, grupo_sanguineo, sexo, altura, peso);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "MonoBaboon{" + "color=" + color + '}';
    }
    @Override
    public double LlenarComida(){
        return 100;
    }
    
    
    
}
