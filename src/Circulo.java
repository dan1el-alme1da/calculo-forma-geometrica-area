import java.util.Locale;
import java.util.Scanner;

public class Circulo {
    public void areaCirculo(){
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Coloque o primeiro valor do raio");
        double parametroCirculo = scanner.nextDouble();

        double area = Math.PI * parametroCirculo * parametroCirculo;
        System.out.println("O valor do circulo é "+area);

        int tamanho;
        if(area < 10 ){
            tamanho = 1;
        }else if(area < 50 && area > 10){
            tamanho = 2;
        }else {
            tamanho = 3;
        }

        switch (tamanho) {
            case 1:
                System.out.println("Circulo pequeno");
                break;
            case 2:
                System.out.println("Circulo médio");
                break;
            case 3:
                System.out.println("Circulo grande");
        
            default:
                break;
        }    
    }
}