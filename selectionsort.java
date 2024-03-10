import java.util.Scanner;

public class selectionsort {

    static void inputarray(int selsort[], int length) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < selsort.length; i++) {
            selsort[i] = sc.nextInt();
        }
        sc.close();
    }

    static void displayarray(int selsort[], int length) {

        for (int i = 0; i < selsort.length; i++) {
            System.out.println(selsort[i]);
        }
    }

    static void performselectionsort(int selsort[], int length) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size:");
        int length = sc.nextInt();

        int selsort[] = new int[length];
        System.out.printf("enter %d element", length);
        inputarray(selsort, length);
        System.out.println("display array element befor sorting:");
        displayarray(selsort, length);
        System.out.println("display array element after sorting:");
        performselectionsort(selsort, length);
        displayarray(selsort, length);

        sc.close();
    }

}
