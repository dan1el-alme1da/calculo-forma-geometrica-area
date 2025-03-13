import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    public void areaRetangulo(){
     Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("COLOQUE O PRIMEIRO VALOR DO RETANGULO");
        double areaRetangulo1 = scanner.nextDouble();
        System.out.println("COLOQUE O SEGUNDO VALOR DO RETANGULO");
        double areaRetangulo2 = scanner.nextDouble();

        double areaRetangulo = areaRetangulo1 * areaRetangulo2;
        System.out.println("valor de area do retangulo é "+ areaRetangulo);

        if(areaRetangulo1 == areaRetangulo2){
            System.out.println("Os valores devem ser diferentes");
        }else{
            System.out.println("Calculando area...");
        }        
    }
}
