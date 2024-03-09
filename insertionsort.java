import java.util.Scanner;

public class insertionsort {

    static void inputarray(int isort[], int size) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < isort.length; i++) {
            isort[i] = sc.nextInt();
        }
        sc.close();
    }

    static void displayarray(int isort[], int size) {
        for (int i = 0; i < isort.length; i++) {
            System.out.println(isort[i]);
        }
    }

     static void insertionsorting(int isort[], int length) {
        int j, temp;
        for (int i = 1; i <= isort.length - 1; i++) {
            temp = isort[i];
            j = i - 1;

            while (j >= 0 && isort[j] > temp) {
                isort[j + 1] = isort[j];
                j--;
            }
            isort[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length:");
        int length = sc.nextInt();
        int isort[] = new int[length];

        System.out.println("enter" + " " + length + " " + "element");
        inputarray(isort, length);
        System.out.println("before sorting :");
        displayarray(isort, length);
        insertionsorting(isort, length);
        System.out.println("after sorting:");
        displayarray(isort, length);
        sc.close();
    }
}
