class Triagulo extends Base{
    private double base;
    private double altura;

    public Triagulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        return (base * altura)/2;
    }
}
