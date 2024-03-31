import java.util.Scanner;

public class interpolationsearch {
    public static void displayarray(int arr[], int length) {
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int interpolation_search(int arr[], int length, int search) {
        int low = 0;
        int high = length - 1;
        int pos;
        while (low <= high && search >= arr[low] && search <= arr[high]) {
            pos = low + ((search - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if (search == arr[pos])
                return pos;
            else if (search < arr[pos]) {
                high = pos - 1;
            } else if (search > arr[pos]) {
                low = pos + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array:");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.printf("enter %d element:", length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("display array element:");
        displayarray(arr, length);
        System.out.println("enter element you want to search:");
        int search = sc.nextInt();
        int r = interpolation_search(arr, length, search);
        if (r != -1) {
            System.out.println(search + " " + "is present at index" + r);
        } else {
            System.out.println(search + " " + "is not present");
        }
        sc.close();
    }
}
