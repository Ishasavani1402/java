import java.util.Scanner;

public class quicksort {
    public static void inputarray(int qsort[], int length) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < qsort.length; i++) {
            qsort[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void displayarray(int qsort[], int length) {
        for (int i = 0; i < qsort.length; i++) {
            System.out.println(qsort[i]);
        }
    }
    
    public static int partition(int qsort[],int low,int high)
    {
        int pivot = qsort[low]; // first element as pivot
        int i=low+1;
        int j=high;
        do {
            while (qsort[i]<=pivot) {
                i++;
                
            }
            while(qsort[j]>pivot)
            {
                j--;
            }
            if(i<j)
            {
                //swap between i and j.
                int temp =qsort[i];
                qsort[i] = qsort[j];
                qsort[j] = temp;
            } 
        } while (i<j);
        //swap between pivot and j.
        int temp = qsort[low];
        qsort[low]=qsort[j];
        qsort[j]=temp;
        return j;
        
    }

    public static void performquicksort(int qsort[],int low,int high)
    {
        int partitionindex ;//  index of the pivot after partition
        if(low<high)
        {

            partitionindex = partition(qsort, low, high);// get the partitioning index
            performquicksort(qsort, low,partitionindex-1);// sort left subarray
            performquicksort(qsort, partitionindex+1,high);//sort right subarray
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int length = sc.nextInt();
        int qsort[] = new int[length];
        System.out.printf("enter %d element:",length);
        inputarray(qsort, length);
        int low = 0,high=length-1;
        System.out.println("before sorting:");
        displayarray(qsort, length);
        performquicksort(qsort, low, high);
        System.out.println("after sorting:");
        displayarray(qsort, length);

        sc.close();
    }
}
