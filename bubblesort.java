import java.util.Scanner;

public class bubblesort {

    public static void inputarray(int sort[], int length) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sort.length; i++) {
            sort[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void displayarray(int sort[], int length) {
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }
    }

    public static void bubblesorting(int sort[], int length) {
        for (int i = 0; i < sort.length - 1; i++)// number of passes
        {
            boolean issorted = true; // flag to check if the list is sorted or not

            for (int j = 0; j < sort.length - i - 1; j++)// use to number of swapping
            {
                if (sort[j] > sort[j + 1]) {
                    int temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                    issorted = false; // set flag to false when a swap occurs
                }
            }
            if (issorted == true)
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array:");
        int length = sc.nextInt();
        int sort[] = new int[length];
        System.out.println("enter" + " " + length + " " + "element:");
        inputarray(sort, length);
        System.out.println("before sorting:");
        displayarray(sort, length);
        bubblesorting(sort, length);
        System.out.println("after sorting;");
        displayarray(sort, length);

        sc.close();

    }
}
