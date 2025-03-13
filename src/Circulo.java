class Circulo extends Base{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
    @Override
    public double calcularArea(){
        return Math.PI * raio * raio;
    }
}