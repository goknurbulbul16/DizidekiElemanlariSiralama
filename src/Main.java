import java.util.Scanner;

public class Main {
    static  void inputList(int n, int[] list){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            System.out.print( (i+1) + ". elemanı giriniz: ");
            list[i] = input.nextInt();

        }
    }
    static void sortList(int[] list){
        int temp;
        for (int k = 0; k < list.length; k++) {
            for (int j = k ; j < list.length; j++) {
                if (list[j] < list[k]) {
                    temp = list[k];
                    list[k] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
    static void print(int[] list){
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Eleman Sayısını Giriniz n : ");
        int n = input.nextInt();
        int[] arrSort = new int[n];
        inputList(n, arrSort);
        sortList(arrSort);
        print(arrSort);
    }

}