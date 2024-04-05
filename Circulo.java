public class Circulo {
    private double radio;
    
    public Circulo() {
        
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "El area del circulo es: " + calcularArea() + " y el es perímetro es: " + calcularPerimetro();
    }   

    
}
