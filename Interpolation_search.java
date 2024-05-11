import java.util.Scanner;

class isearch {
    public static void inputarray(int arr[], int length, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void displayarray(int arr[], int length) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int i_search_perform(int arr[], int length,int search) {
        int low = 0;
        int high = arr.length - 1;
        int pos;
        while (low <= high && search >= arr[low] && search <= arr[high]) {
            pos = low + ((search - arr[low]) * (high - low)) / (arr[high] - arr[low]);
            if (search == arr[pos]) {
                return pos;
            } else if (search < arr[pos]) {
                high = pos - 1;
            } else if (search > arr[pos]) {
                low = pos + 1;
            }
        }
        return -1;
    }

    public static void bubblesort(int arr[], int length) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static boolean issort(int arr[], int length) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }
}

public class Interpolation_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array:");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.printf("enter %d element", length);
        isearch.inputarray(arr, length, sc);
        if (! isearch.issort(arr, length)) {
            System.out.println("above array is not sorted... here is sorted array");
            isearch.bubblesort(arr, length);
        }
        System.out.println("display array");
        isearch.displayarray(arr, length);
        System.out.println("enter element you want to search:");
        int search = sc.nextInt();
        int s = isearch.i_search_perform(arr, length, search);
        if (s != -1) {
            System.out.printf("%d is found at %d index", search,s);
        } else {
            System.out.printf("%d is not found",search);
        }

    }
}
