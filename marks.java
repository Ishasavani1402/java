import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        System.out.println("enter marks of C & DSA:");
        int m1 = marks.nextInt();
        System.out.println("enter marks of statastical mathemetics:");
        int m2 = marks.nextInt();

        System.out.println("enter marks of operating system:");
        int m3 = marks.nextInt();

        System.out.println("enter marks of information technology");
        int m4 = marks.nextInt();

        System.out.println("enter marks of communication skill:");
        int m5 = marks.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        System.out.println("total obtain marks of all  subjects are : " + total);

        float cgpa = total / 5.0f;
        System.out.println("total CGPA is :" + cgpa);
        marks.close();

        if (cgpa >= 80) {
            System.out.println("first class with distinction");
        } else if (cgpa >= 70) {
            System.out.println("first class");
        } else if (cgpa >= 60) {
            System.out.println("second class");
        } else if (cgpa >= 50) {
            System.out.println("pass");
        }

    }
}
