package es.cic.curso25.proy005.model;

public class Motor {

    private Long id;
    private double potencia; 
    private String marca;
    private boolean encendido;

    public Motor(){}

    public Motor(Long id, double potencia, String marca, boolean encendido) {
        this.id = id;
        this.potencia = potencia;
        this.marca = marca;
        this.encendido = encendido;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public boolean isEncendido() {
        return encendido;
    }
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}
