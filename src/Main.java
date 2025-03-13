import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       Base[] bases = new Base[4];

       System.err.println("Digite os valores para o quadrado");
       System.out.println("Digite o lado: ");
       double lado = scanner.nextDouble();
       bases[0] = new Quadrado(lado);
       System.out.println("QUADRADO");

       System.out.println("Digite os valores para o retangulo");
       System.out.println("Digite a altura: ");
       double lado1 = scanner.nextDouble();
       System.out.println("Digite a base: ");
       double lado2 = scanner.nextDouble();
       bases[1] = new Retangulo(lado1, lado2);
       if(lado1 != lado2){
        System.out.println("Os valores de altura e base devem ser diferentes");
       }else{
        System.out.println("Calculando...");
       }
       System.out.println("RETANGULO");

       System.out.println("Digite os valores do triangulo");
       System.out.println("Digite o valor da altura ");
       double altura = scanner.nextDouble();
       System.out.println("Digite o valor da base ");
       double base = scanner.nextDouble();
       bases[2] = new Triagulo(base, altura);
       System.out.println("TRIANGULO");
       

       System.out.println("Digite os valor do circulo");
       System.out.println("Digite o valor do raio ");
       double raio = scanner.nextDouble();
       bases[3] = new Circulo(raio);
       System.out.println("CIRCULO");

       System.out.println(" Areas calculadas ");
       for (int i = 0; i < bases.length; i++) {
       Base forma = bases[i];
            System.out.println("Calculo da area  "+forma.calcularArea());
       }
       scanner.close();
     
    }
}
