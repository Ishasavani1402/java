import java.util.Scanner;

class linearsearch {
    static void input_display(int a[][], Scanner sc, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("display elements :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[] l_search(int a[][], Scanner sc, int row, int col) {
        System.out.println("enter element for search :");
        int search = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] == search) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };

    }
}

public class linearsearch_2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        linearsearch.input_display(arr, sc, row, col);
        int indx[] = linearsearch.l_search(arr, sc, row, col);
        if (indx[0] == 1) {
            System.out.println("element found at index : " + indx[0] + " " + indx[1]);
        } else {
            System.out.println("element not found");
        }

    }
}
