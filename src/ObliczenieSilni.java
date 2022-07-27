import java.util.Scanner;

public class ObliczenieSilni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Podaj liczby do obliczenia silnii");
        int[] ArrayN = new int[5];
        for(int x = 0 ; x < 5 ; x++){
            System.out.println("Liczba nr " + x);
            ArrayN[x] = scanner.nextInt();
        }

        PrintArray(ArrayN);
        int[] TablicaSilni= new int [5];
        for(int i = 0 ; i < 5 ; i ++){
            TablicaSilni[i] = LiczSilnie(ArrayN[i]);
        }
        PrintArray(TablicaSilni);
    }
    public static int LiczSilnie (int a){
        int data = 1;
        for(; a > 0 ; a--){
            data = data * a ;
        }
        return data;
    }


    public static void PrintArray(int tab []){
        System.out.printf("Tablica :  [");
        for (int x:
             tab) {
            System.out.printf(" " + x);
        }
        System.out.printf("]");
    }
}
