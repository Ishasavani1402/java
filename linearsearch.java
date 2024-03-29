import java.util.Scanner;

public class linearsearch {

    static void arraydisplay(int arr[], int length) {
        System.out.println("array display:");
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int performliniarsearch(int arr[], int length, int search) {

        for (int i = 0; i < arr.length; i++) {
            if (search == arr[i]) {
                System.out.println(search + " is present at index " + i);
                return i;
            }
        }
        System.out.println(search + " " + "is not present in array");
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length you want it:");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("enter " + length + " " + "array element:");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        arraydisplay(arr, length);
        System.out.println("enter element you want to search:");
        int search = sc.nextInt();
        performliniarsearch(arr, length, search);

        sc.close();
    }
}
