public class Cuadrado {
    private double lado;
    

    public Cuadrado() {
       
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea(){
        return lado*lado;
    }
    public double calcularPerimetro(){
        return lado*4;
    }

    @Override
    public String toString() {
        return "El area del cuadrado es: " + calcularArea() + " y el es perímetro es: " + calcularPerimetro();
    }


}
