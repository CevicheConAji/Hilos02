import java.util.Random;

public class Hilo01 extends Thread {
    private int nMayor;
    private int nMenor;
    private int[] arrayPintar ;


    public Hilo01(int nMayor, int nMenor, int[] arrayPintar) {
        this.nMayor = nMayor;
        this.nMenor = nMenor;
        this.arrayPintar = arrayPintar;

    }

    @Override
    public void run() {

        pintar();

    }
    private void pintarCabeza() {
        int longitud = 10;
        System.out.println("");
        for(int i = 0;i<longitud ; i++) {
            System.out.print(i + "\t\t");

        }
        System.out.println(" ");
        System.out.print("-------------------------"
                + "----------------------------------"
                + "---------------\n");

    }
    private void pintar()  {
        Random r = new Random();
        int numeroAleatorio = 0;
        try{
            for(int i = 0; i < 5 ; i++){
                pintarCabeza();
                numeroAleatorio = r.nextInt(nMayor-nMenor) + nMenor;

                arrayPintar[i] = numeroAleatorio;
                pintarArray();
                Thread.sleep(5000);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public void pintarArray(){
        for(int i = 0;i<arrayPintar.length ;i++){
            System.out.print(arrayPintar[i]+ "\t\t");
        }
        System.out.println("");
    }
}
