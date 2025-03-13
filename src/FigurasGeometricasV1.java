import java.util.Locale;
import java.util.Scanner;

public class FigurasGeometricasV1 {
    public static void main(String[] args) {

        System.out.println("Esse sistema ajuda a calcular a área e o perímetro de figuras geométricas.");
        System.out.println("Digite o número correspondente a figura geométrica que deseja calcular:");
        System.out.println(" 1 - Quadrado \n 2 - Retângulo \n 3 - Triângulo \n 4 - Círculo");

        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int option = 0;

        if (scanner.hasNextInt()) {
            option = scanner.nextInt();
        } else {
            System.out.println("Opção inválida. Por favor, digite um número inteiro.");
            scanner.close();
            return;
        }

        switch(option){
            case 1:
            System.out.println("Digite o valor do lado do quadrado:");
            double lado = scanner.nextDouble();
            double areaQuadrado = lado * lado;
            double perimetroQuadrado = 4 * lado;
            System.out.println("A área do quadrado é: " + areaQuadrado);
            System.out.println("O perímetro do quadrado é: " + perimetroQuadrado);
            
            case 2:
            while (true) { 
                System.out.println("Digite o valor da base do retângulo:");
                double baseRetangulo = scanner.nextDouble();
                System.out.println("Digite o valor da altura do retângulo:");
                double alturaRetangulo = scanner.nextDouble();
        
                if (baseRetangulo == alturaRetangulo) {
                    System.out.println("Os valores de base e altura devem ser diferentes. Tente novamente.");
                }else {
                    double areaRetangulo = baseRetangulo * alturaRetangulo;
                    double perimetroRetangulo = 2 * (baseRetangulo + alturaRetangulo);
                    System.out.println("A área do retângulo é: " + areaRetangulo);
                    System.out.println("O perímetro do retângulo é: " + perimetroRetangulo);
                    break; 
                }
            }
            break;
        
            case 3:
            System.out.println("Digite o valor da base do triângulo:");
            double base = scanner.nextDouble();
            System.out.println("Digite o valor da altura do triângulo:");
            double altura = scanner.nextDouble();
            double area = (base * altura) / 2;
            System.out.println("A área do triângulo é: " + area);
        
            case 4:
            System.out.println("Digite o valor do raio do círculo:");
            double raioCirculo = scanner.nextDouble();
            double areaCirculo = Math.PI * Math.pow(raioCirculo, 2);
            double perimetroCirculo = 2 * Math.PI * raioCirculo;
            System.out.println("A área do círculo é: " + areaCirculo);
            System.out.println("O perímetro do círculo é: " + perimetroCirculo);
        } 
        scanner.close();
    }
}
