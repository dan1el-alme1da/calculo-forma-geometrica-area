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

        if(option == 1){
            System.out.println("Digite o valor do lado do quadrado:");
            double lado = scanner.nextDouble();
            double area = lado * lado;
            double perimetro = 4 * lado;
            System.out.println("A área do quadrado é: " + area);
            System.out.println("O perímetro do quadrado é: " + perimetro);
        } else if(option == 2){
            System.out.println("Digite o valor da base do retângulo:");
            double base = scanner.nextDouble();
            System.out.println("Digite o valor da altura do retângulo:");
            double altura = scanner.nextDouble();
            double area = base * altura;
            double perimetro = 2 * (base + altura);
            System.out.println("A área do retângulo é: " + area);
            System.out.println("O perímetro do retângulo é: " + perimetro);
        } else if(option == 3){
            System.out.println("Digite o valor da base do triângulo:");
            double base = scanner.nextDouble();
            System.out.println("Digite o valor da altura do triângulo:");
            double altura = scanner.nextDouble();
            double area = (base * altura) / 2;
            System.out.println("A área do triângulo é: " + area);
        } else if(option == 4){
            System.out.println("Digite o valor do raio do círculo:");
            double raio = scanner.nextDouble();
            double area = Math.PI * Math.pow(raio, 2);
            double perimetro = 2 * Math.PI * raio;
            System.out.println("A área do círculo é: " + area);
            System.out.println("O perímetro do círculo é: " + perimetro);
        } else {
            System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}
