import java.util.Scanner;

class s_sort {
    public static void inputarray(int selsort[], int length, Scanner sc) {
        for (int i = 0; i < selsort.length; i++) {
            selsort[i] = sc.nextInt();
        }
    }

    public static void displayarray(int selsort[], int length) {

        for (int i = 0; i < selsort.length; i++) {
            System.out.println(selsort[i]);
        }
    }

    public static void performselectionsort(int selsort[], int length) {
        for (int i = 0; i < selsort.length - 1; i++) {
            int min = i;// assum first element is min
            for (int j = i + 1; j < selsort.length; j++) {
                if (selsort[j] < selsort[min])
                    min = j; // finding the minimum element in remaining array
            }

            // swap the found minimum element with the first element of unsorted array.
            int temp = selsort[i];
            selsort[i] = selsort[min];
            selsort[min] = temp;
        }
    }
}

public class selectionsort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size:");
        int length = sc.nextInt();

        int selsort[] = new int[length];
        System.out.printf("enter %d element", length);
        s_sort.inputarray(selsort, length, sc);
        System.out.println("display array element befor sorting:");
        s_sort.displayarray(selsort, length);
        System.out.println("display array element after sorting:");
        s_sort.performselectionsort(selsort, length);
        s_sort.displayarray(selsort, length);

        sc.close();
    }

}
