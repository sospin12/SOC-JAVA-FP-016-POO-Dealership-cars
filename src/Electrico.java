public class Electrico extends Vehiculo {

    private int cantidadBaterias;
    private int duracionBaterias;
    private int tiempoCargaBaterias;
    private int tiempoAutonomíaBaterias;

    public Electrico() {
    }

    public Electrico(int cantidadBaterias, int duracionBaterias, int tiempoCargaBaterias,
     int tiempoAutonomíaBaterias,String marca, String modelo, String color, double kilometraje, double velocidadMáxima,
     double velocidadActual) {
        super(marca, modelo, color, kilometraje, velocidadMáxima, velocidadActual);
        this.cantidadBaterias = cantidadBaterias;
        this.duracionBaterias = duracionBaterias;
        this.tiempoCargaBaterias = tiempoCargaBaterias;
        this.tiempoAutonomíaBaterias = tiempoAutonomíaBaterias;
    }
    public int getBaterias() {
        return cantidadBaterias;
    }
    public void setBaterias(int cantidadBaterias) {
        this.cantidadBaterias = cantidadBaterias;
    }
    public int getDuracionBaterias() {
        return duracionBaterias;
    }
    public void setDuracionBaterias(int duracionBaterias) {
        this.duracionBaterias = duracionBaterias;
    }
    public int getTiempoCargaBaterias() {
        return tiempoCargaBaterias;
    }
    public void setTiempoCargaBaterias(int tiempoCargaBaterias) {
        this.tiempoCargaBaterias = tiempoCargaBaterias;
    }
    public int getTiempoAutonomíaBaterias() {
        return tiempoAutonomíaBaterias;
    }
    public void setTiempoAutonomíaBaterias(int tiempoAutonomíaBaterias) {
        this.tiempoAutonomíaBaterias = tiempoAutonomíaBaterias;
    }

    public double calcularKMRecarga() {
        if (getVelocidadActual() == 0) {
            System.out.println("El vehículo está detenido.");
            return -1;
        }
        return getTiempoAutonomíaBaterias();
    }

    @Override
    public void acelerar(double vel) {
        super.acelerar(vel);
    }

    @Override
    public void desacelerar(double vel) {
        super.desacelerar(vel);
    }

    @Override
    public void frenar() {
        super.frenar();
    }

    





    

}
