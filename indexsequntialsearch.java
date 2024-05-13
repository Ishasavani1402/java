import java.util.Scanner;

class index{

    public static void displayarray(int arr[],int length){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static int index_sequntial_search(int arr[],int length,int indxarr[],int length1,int search){
        
        int start,end;
        //loop for indxarr[]
        for(int i=0;i<length1;i++){
            start = indxarr[i];//store starting position of each group
            if(i==length1-1){
                end = length;
            }
            else{
                end = indxarr[i+1];
            }
            //loop for each group and compare search element from group
            for(int j=start;j<end;j++){
                if(search==arr[j])
                return j;
            }
        }
        return -1;
    }
}
public class indexsequntialsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,30,40,50,60,70,80,90,100,110};
        int length = arr.length;
        int indxarr[] = {0,3,6};//to store index of group
        int length1 = indxarr.length;
        index.displayarray(arr,length);
        System.out.println("enter element you want to search:");
        int search = sc.nextInt();
        int r = index.index_sequntial_search(arr, length, indxarr, length1, search);
        if(r != -1){
            System.out.printf("%d found at %d index",search,r);
        }
        else{
            System.out.printf("%d not found",search);
        }
        sc.close();
    }
}
