import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[] array = new int[10] ;


        System.out.println("Introduzca limite inferior");
        int limiteInferior = sc.nextInt();

        System.out.println("Introduzca limite superior");
        int limiteSuperior = sc.nextInt();


        Hilo01 hilo01 = new Hilo01(limiteSuperior,limiteInferior,array);
        Hilo02 hilo02 = new Hilo02(limiteSuperior,limiteInferior,array);


        hilo02.start();


    }
}