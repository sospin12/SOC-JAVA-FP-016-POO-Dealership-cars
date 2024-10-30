public class Vehiculo {
    
    //VARIABLES
    private String marca;
    private String modelo;
    private String color;
    private double kilometraje;
    private double velocidadMáxima;
    private double velocidadActual=0;

    //CONSTUCTORES
    public Vehiculo(){
    }

    public Vehiculo(String marca, String modelo, String color, double kilometraje, double velocidadMáxima,
            double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
        this.velocidadMáxima = velocidadMáxima;
        this.velocidadActual = velocidadActual;
    }
    
    //GETTER AND SETTERS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getVelocidadMáxima() {
        return velocidadMáxima;
    }

    public void setVelocidadMáxima(double velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }


    //METODOS
    public void acelerar(double vel) {
        setVelocidadActual(Math.min(velocidadActual + vel, velocidadMáxima));
    }

    public void desacelerar(double vel) {
        setVelocidadActual(Math.max(velocidadActual - vel, 0));
    }

    public void frenar() {
        setVelocidadActual(0);
    }


}
