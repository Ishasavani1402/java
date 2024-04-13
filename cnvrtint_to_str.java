import java.util.*;
public class cnvrtint_to_str {
    public static void main(String[] args) {

        // 1.using String.valueOf(int) method

        int num = 100;
        String str = "isha_savani";
        str = String.valueOf(str);
        System.out.println("convert" +" " + num + " " + "to string " + str);

        // 2.using Integer.toString(int) method

        int num = 200;
        String str = "isha savani";
        str = Integer.toString(num);
        System.out.println("convert" + num + "to string" + str);

        //3.using String.format() method

        int num = 300;
        String str = "isha savani";
        str = String.format(str, num);
        System.out.println(str);
        

    }
}
