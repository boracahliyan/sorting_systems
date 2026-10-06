import java.util.Random;
import java.util.Scanner;


public class random_sort {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the list size:");

        int size = sc.nextInt();

        System.out.print("Please enter the list elements: ");


        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            if (sc.hasNextInt()) {
                list[i] = sc.nextInt();
            }

        }

        System.out.println(checker(list));


        while(!checker(list)){
            shuffle(list);
            //System.out.println(checker(list));


        }


        for (int i = 0; i < size ; i++) {
            System.out.print(list[i] + " ");
        }



    }

    static void shuffle(int[] arr){
        Random rand = new Random();

        for (int i = arr.length - 1; i > 0 ; i--) {
            int index = rand.nextInt(i + 1);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

    }

    static boolean checker(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]){
                return false;
            }

        }

        return true;
    }


}
