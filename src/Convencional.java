public class Convencional extends Vehiculo {

    private String tipoCombustible;
    private int cilindraje;
    private int autonomia;

    public Convencional() {
    }

    public Convencional(String tipoCombustible, int cilindraje, int autonomia,
            String marca, String modelo, String color, double kilometraje, double velocidadMáxima,
            double velocidadActual) {
        super(marca, modelo, color, kilometraje, velocidadMáxima, velocidadActual);
        this.tipoCombustible = tipoCombustible;
        this.cilindraje = cilindraje;
        this.autonomia = autonomia;

    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public double calcularKMTanqueo() {
        if (getVelocidadActual() == 0) {
            System.out.println("El vehículo está detenido.");
            return -1;
        }
        return autonomia;
    }

}
