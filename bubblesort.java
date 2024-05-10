import java.util.Scanner;

class bsort {
    public static void inputarray(int sort[], int length , Scanner sc) {
        for (int i = 0; i < sort.length; i++) {
            sort[i] = sc.nextInt();
        }
    }

    public static void displayarray(int sort[], int length) {
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }
    }
    
    public static void bubblesorting(int sort[], int length) {
        for (int i = 0; i < sort.length - 1; i++)// number of passes
        {
            boolean issorted = true; // aray already sorted
            for (int j = 0; j < sort.length - i - 1; j++)// use to number of swapping
            {
                if (sort[j] > sort[j + 1]) {
                    int temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                    issorted = false; // need to swap for sorting 
                }
            }
            if (issorted == true)
            break;
        }
    }
}

    public class bubblesort {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter length of array:");
            int length = sc.nextInt();
            int sort[] = new int[length];
            System.out.println("enter" + " " + length + " " + "element:");
            bsort.inputarray(sort, length,sc);
            System.out.println("before sorting:");
            bsort.displayarray(sort, length);
            bsort.bubblesorting(sort, length);
            System.out.println("after sorting;");
            bsort.displayarray(sort, length);

            sc.close();

        }

    }

