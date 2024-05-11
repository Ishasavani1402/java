import java.util.Scanner;

class b_search {

    public static void inputarray(int bsearch[], int length, Scanner sc) {
        for (int i = 0; i < bsearch.length; i++) {
            bsearch[i] = sc.nextInt();
        }
    }

    public static void displayarray(int bsearch[], int length) {
        for (int i = 0; i < bsearch.length; i++) {
            System.out.println(bsearch[i]);
        }
    }

    public static int performbinarysearch(int bsearch[], int length, Scanner sc, int search) {

        int low = 0;
        int high = bsearch.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (search == bsearch[mid]) {
                return mid;
            } else if (search < bsearch[mid]) {
                high = mid - 1;
            } else if (search > bsearch[mid]) {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void bubblesorting(int sort[], int length) {
        for (int i = 0; i < sort.length - 1; i++)// number of passes
        {
            for (int j = 0; j < sort.length - i - 1; j++)// use to number of swapping
            {
                if (sort[j] > sort[j + 1]) {
                    int temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }
        }
    }

    public static boolean issorted(int bsearch[], int length) {
        for (int i = 0; i < bsearch.length - 1; i++) {
            if (bsearch[i] > bsearch[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array");
        int length = sc.nextInt();
        int bsearch[] = new int[length];
        System.out.printf("enter %d element:", length);
        b_search.inputarray(bsearch, length, sc);
        if (!b_search.issorted(bsearch, length)) {
            System.out.println("above array is unsorted... here is sorted array");
            b_search.bubblesorting(bsearch, length);
        }
        System.out.println("display element");
        b_search.displayarray(bsearch, length);
        System.out.println("enter element you want to search:");
        int search = sc.nextInt();
        int s = b_search.performbinarysearch(bsearch, length, sc, search);
        if (s != -1) {
            System.out.printf("element found at %d index", s);
        } else {

            System.out.printf("%d is not found", search);
        }
    }
}
