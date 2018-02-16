
package lab4_leonardo_fabio;


public class Primate extends SeresVivos {
   private String Area;
   private Double cantidad_comida;
   private String planeta;
   private String lugar_naciomiento;

    public Primate() {
        super();
    }

    public Primate(String Area, Double cantidad_contido, String planeta, String lugar_naciomiento, String nombre, String grupo_sanguineo, String sexo, String altura, String peso) {
        super(nombre, grupo_sanguineo, sexo, altura, peso);
        this.Area = Area;
        this.cantidad_comida = cantidad_contido;
        this.planeta = planeta;
        this.lugar_naciomiento = lugar_naciomiento;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public Double getCantidad_contido() {
        return cantidad_comida;
    }

    public void setCantidad_contido(Double cantidad_contido) {
        this.cantidad_comida = cantidad_contido;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getLugar_naciomiento() {
        return lugar_naciomiento;
    }

    public void setLugar_naciomiento(String lugar_naciomiento) {
        this.lugar_naciomiento = lugar_naciomiento;
    }

    @Override
    public String toString() {
        return "Primate{" + "Area=" + Area + ", cantidad_contido=" + cantidad_comida + ", planeta=" + planeta + ", lugar_naciomiento=" + lugar_naciomiento + '}';
    }
    
    

    
}
