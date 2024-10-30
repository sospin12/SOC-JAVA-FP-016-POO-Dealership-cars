public class Hibrido extends Vehiculo{

    private String combustible;
    private int cilindraje;
    private int baterias;
    private int duracionBaterias;
    private int tiempoCargaBaterias;
    private int tiempoAutonomíaTanqueda;
    private int tiempoAutonomíaBaterias;

    public Hibrido() {
    }
    
    public Hibrido(String combustible, int cilindraje, int baterias, int duracionBaterias, int tiempoCargaBaterias,
            int tiempoAutonomíaTanqueda, int tiempoAutonomíaBaterias, String marca, String modelo, String color, 
            double kilometraje, double velocidadMáxima, double velocidadActual) {
        super(marca, modelo, color, kilometraje, velocidadMáxima, velocidadActual);
        this.combustible = combustible;
        this.cilindraje = cilindraje;
        this.baterias = baterias;
        this.duracionBaterias = duracionBaterias;
        this.tiempoCargaBaterias = tiempoCargaBaterias;
        this.tiempoAutonomíaTanqueda = tiempoAutonomíaTanqueda;
        this.tiempoAutonomíaBaterias = tiempoAutonomíaBaterias;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getBaterias() {
        return baterias;
    }

    public void setBaterias(int baterias) {
        this.baterias = baterias;
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

    public int getTiempoAutonomíaTanqueda() {
        return tiempoAutonomíaTanqueda;
    }

    public void setTiempoAutonomíaTanqueda(int tiempoAutonomíaTanqueda) {
        this.tiempoAutonomíaTanqueda = tiempoAutonomíaTanqueda;
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
