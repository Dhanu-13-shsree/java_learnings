package src;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String name;
        int age;
        double gpa;
        boolean isEnrolled;
        int[] marks=new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        name = sc.nextLine();
        System.out.println("Enter Your Age:");
        age = sc.nextInt();
        System.out.println("Enter Your gpa:");
        gpa = sc.nextDouble();
        System.out.println("Enter Your Marks:");
        for(int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        System.out.println("GPA:" +gpa);
    }
}
