import java.util.Scanner;

class insert_sort {
    public static void inputarray(int isort[], int size, Scanner sc) {
        for (int i = 0; i < isort.length; i++) {
            isort[i] = sc.nextInt();
        }
    }

    public static void displayarray(int isort[], int size) {
        for (int i = 0; i < isort.length; i++) {
            System.out.println(isort[i]);
        }
    }

    public static void insertionsorting(int isort[], int length) {
        int j, temp;
        // loop for num of passes
        for (int i = 1; i <= isort.length - 1; i++) {
            temp = isort[i];// assum that first element is sorted
            j = i - 1;// point to the previous element of current element

            while (j >= 0 && isort[j] > temp) {
                isort[j + 1] = isort[j];// shift the earlier element one position upward
                j--;// point to the previous element in the array
            }
            isort[j + 1] = temp;
        }
    }
}

public class insertionsort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length:");
        int length = sc.nextInt();
        int isort[] = new int[length];
        System.out.println("enter" + " " + length + " " + "element");
        insert_sort.inputarray(isort, length, sc);
        System.out.println("before sorting :");
        insert_sort.displayarray(isort, length);
        insert_sort.insertionsorting(isort, length);
        System.out.println("after sorting:");
        insert_sort.displayarray(isort, length);
        sc.close();
    }
}
