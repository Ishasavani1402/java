import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array:");
        int length = sc.nextInt();
        int sort[] = new int[length];
        System.out.println("enter" + " " + length + " " + "element:");

        for (int i = 0; i < sort.length; i++) {
            sort[i] = sc.nextInt();
            // System.out.println(sort[i]);
        }
        System.out.println("display array element:");
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }
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
        System.out.println("\nSorted array in ascending order is : ");
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + " ");
        }

        sc.close();

    }
}
