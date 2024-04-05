import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(1990, 5, 15);
        Persona persona = new Persona(fechaNacimiento);
        System.out.println(persona);
        Cuadrado cuadrado = new Cuadrado();
        System.out.println(cuadrado);
        Circulo circulo= new Circulo();
        System.out.println(circulo);
        Triangulo triangulo= new Triangulo(2, 2 , 2 , 2);
        System.out.println(triangulo);
    }
}