import java.util.Scanner;
public class stalin_sort {
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

        int[] new_list = new int[size];
        int list_size = 1;
        int target = 0;
        new_list[0] = list[0];
      for (int i = 1; i < size; i++){
          if(list[i] > list[target]){

              new_list[list_size] = list[i];

              list_size++;

              target = i;

          }
      }


        for (int i = 0; i < list_size ; i++) {
            System.out.print(new_list[i] + " ");
        }


    }
}
