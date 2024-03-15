import java.util.Scanner;

public class mergesort {
    public static void inputarray(int msort[], int length) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < msort.length; i++) {
            msort[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void displayarray(int msort[], int length) {
        for (int i = 0; i < msort.length; i++) {
            System.out.println(msort[i]);
        }
    }

    public static void performmergesort(int msort[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            performmergesort(msort, low, mid);// left subarray
            performmergesort(msort, mid + 1, high);// right subarray
            mergeprocess(msort, low, mid, high);
        }
    }

    public static void mergeprocess(int msort[], int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int temp[] = new int[msort.length]; // creating a temporary array to hold the elements of original array
        while (i <= mid && j <= high) {
            if (msort[i] <= msort[j]) {
                temp[k] = msort[i];
                i++;
                k++;
            } else {
                temp[k] = msort[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            temp[k] = msort[i];
            i++;
            k++;
        }
        while (j <= high) {
            temp[k] = msort[j];
            k++;
            j++;
        }
        //copy array element from temp[] to msort[]
       
        for (i = low; i <= high; i++) {
            msort[i] = temp[i];
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");

        int length = sc.nextInt();
        int msort[] = new int[length];
        int low = 0;
        int high = length - 1;
        System.out.printf("enter %d element:", length);
        inputarray(msort, length);
        System.out.println("before sorting:");
        displayarray(msort, length);
        performmergesort(msort, low, high);
        System.out.println("after sorting:");
        displayarray(msort, length);
        sc.close();
    }
}
