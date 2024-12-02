import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        pintada();

    }

    public static void pintada() {
        int longitud = 10;

        for(int i = 0;i<longitud ; i++) {
            System.out.print(i + "\t");

        }
        System.out.println(" ");
        System.out.print("-------------------------"
                + "----------------------------------"
                + "---------------");
    }
    public static int pedirNumeros(Scanner sc) {

        return 0;
    }

}