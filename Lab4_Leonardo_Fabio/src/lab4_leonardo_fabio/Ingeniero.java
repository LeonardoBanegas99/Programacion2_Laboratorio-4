
package lab4_leonardo_fabio;

import java.util.ArrayList;


public class Ingeniero extends SeresVivos{
  
    private String correo;
    private String nombre_usuario;
    private String idiomas;
    private String contraseña;
    private int cantidad_cafe;
    private String fecha_naciomiento;

    public Ingeniero() {
        super();
    }

    public Ingeniero(String correo, String nombre_usuario, String idiomas , String contraseña, int cantidad_cafe, String fecha_naciomiento, String nombre, String grupo_sanguineo, String sexo, String altura, String peso) {
        super(nombre, grupo_sanguineo, sexo, altura, peso);
        this.correo = correo;
        this.nombre_usuario = nombre_usuario;
        this.idiomas = idiomas;
        this.contraseña = contraseña;
        this.cantidad_cafe = cantidad_cafe;
        this.fecha_naciomiento = fecha_naciomiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getCantidad_cafe() {
        return cantidad_cafe;
    }

    public void setCantidad_cafe(int cantidad_cafe) {
        this.cantidad_cafe = cantidad_cafe;
    }

    public String getFecha_naciomiento() {
        return fecha_naciomiento;
    }

    public void setFecha_naciomiento(String fecha_naciomiento) {
        this.fecha_naciomiento = fecha_naciomiento;
    }

    @Override
    public String toString() {
        return "Ingeniero{" + "correo=" + correo + ", nombre_usuario=" + nombre_usuario + ", idiomas=" + idiomas + ", contrase\u00f1a=" + contraseña + ", cantidad_cafe=" + cantidad_cafe + ", fecha_naciomiento=" + fecha_naciomiento + '}';
    }

    
    
    
    
    
   
   
}
