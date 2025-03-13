import java.util.Locale;
import java.util.Scanner;

public class Quadrado {
    public void areaQuadrado(){
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite o valor do lado 1 do quadrado");
        double parametroUm = scanner.nextDouble();

        System.out.println("Digite o valor do lado 2 do quadrado");
        double parametroDois = scanner.nextDouble();

        if(parametroUm != parametroDois){
            System.out.println("Ambos valores devem ser iguais");
        }else{
            System.out.println("calculando area ...");
        }
        double valor = parametroUm * parametroDois;
        System.out.println("O valor da area do quadrado é "+valor);
    
    }
}
