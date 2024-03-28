import java.util.Scanner;

public class binarysearch {

    static void arraydisplay(int arr[], int length) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void performbinarysearch(int arr[], int length, int search) {
        int low = 0;
        int high = arr.length - 1;
        boolean b = false; 
        while (low <= high) {
            int mid = (low + high) / 2;
            if (search == arr[mid]) {
                b = true;// element found
                System.out.println(search + " " + "is present at" + " " + mid);
                return;
            } else if (search < arr[mid]) {
                high = mid - 1;
            } else if (search > arr[mid]) {
                low = mid + 1;
            }
        }
        if (b == false)
            System.out.println(search + " " + "not Found in array");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 4, 8, 10, 10, 20, 49 };
        int length = arr.length;
        System.out.println("display array element:");
        arraydisplay(arr, length);
        System.out.println("enter element you want to search:");
        int search = sc.nextInt();
        performbinarysearch(arr, length, search);
        sc.close();
    }
}
