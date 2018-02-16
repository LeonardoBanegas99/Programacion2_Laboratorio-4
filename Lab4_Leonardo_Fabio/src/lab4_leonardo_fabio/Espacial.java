package lab4_leonardo_fabio;

public class Espacial extends MediosdeTransporte{
    private String combustiblle;
    private String planetapartida;
    private String planetallegada;

    public Espacial() {
    }

    public Espacial(String combustiblle, String planetapartida, String planetallegada, boolean tanquelleno, int distancia, int altitud) {
        super(tanquelleno, distancia, altitud);
        this.combustiblle = combustiblle;
        this.planetapartida = planetapartida;
        this.planetallegada = planetallegada;
    }

    public String getCombustiblle() {
        return combustiblle;
    }

    public void setCombustiblle(String combustiblle) {
        this.combustiblle = combustiblle;
    }

    public String getPlanetapartida() {
        return planetapartida;
    }

    public void setPlanetapartida(String planetapartida) {
        this.planetapartida = planetapartida;
    }

    public String getPlanetallegada() {
        return planetallegada;
    }

    public void setPlanetallegada(String planetallegada) {
        this.planetallegada = planetallegada;
    }

    @Override
    public String toString() {
        return "Espacial{" + "combustiblle=" + combustiblle + ", planetapartida=" + planetapartida + ", planetallegada=" + planetallegada + '}';
    }
    
    
    
    
}
