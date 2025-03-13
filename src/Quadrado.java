class Quadrado extends Base{
    private double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }
    @Override
    public double calcularArea(){
        return lado * lado;
    } 
}
