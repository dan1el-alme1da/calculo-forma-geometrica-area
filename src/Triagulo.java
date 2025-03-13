import java.util.Locale;
import java.util.Scanner;

public class Triagulo {
    public void areaTriangulo(){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o valor de altura do triangulo");
        double alturaTriangulo = scanner.nextDouble();
        System.out.println("Digite o valor da base do triangulo");
        double baseTriangulo = scanner.nextDouble();

        double areaTriangulo = alturaTriangulo * baseTriangulo/2;
        System.out.println("O valor de area do triangulo é: "+areaTriangulo);
    }
}
