public class App {
    public static void main(String[] args) throws Exception {
        Vehiculo car1 = new Hibrido("Diesel", 1200, 10, 500, 50, 60, 4, "Chevrolet", "Negro", "2007", 15000, 80, 20);
        car1.acelerar(90);
        System.out.println("Acelerando a: ");
        System.out.println("Velocidad: " + car1.getVelocidadActual());
        car1.desacelerar(30);
        System.out.println("\nDesacelerando a: ");
        System.out.println("Velocidad: " + car1.getVelocidadActual());
        car1.frenar();
        System.out.println("\nFrenado. ");
        System.out.println("Velocidad: " + car1.getVelocidadActual());
        Convencional car2 = new Convencional("Diesel", 800,
                600, "Audi", "2007", "Azul", 14000,
                100, 10);


        System.out.println("El vehiculo " + car2.getClass().getSimpleName() + ": " + car2.getMarca()
                + " " + car2.getCilindraje() + "cc " + car2.getModelo());
        System.out.println("Va a una velocidad de: " + car2.getVelocidadActual() + "km/h");
        car2.acelerar(100);
        System.err.println("Ahora le diremos que vaya a su maxima capacidad: "+ car2.getVelocidadActual() + "km/h");
        car2.frenar();
        System.err.println("A pesar de su modelo podemos aprecia su desempeño. ahora que frene: "
         + car2.getVelocidadActual() + "km/h");
        System.out.println(
                "Podemos ver que sistema de frenado esta en plenas condiciones. ");


        Electrico car3 = new Electrico(50, 200, 4,
         200, "Tesla", "2023", "Rojo",
          5000, 120, 20);
        System.out.println("Ahora mostrremos a un monstruo del torque: ");
        System.out.println("Marca: "+car3.getMarca()+" ");
    }
}
