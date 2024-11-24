import java.util.Scanner;
public class Student {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of 1st Subject between 1-100: ");
        int a = sc.nextInt();
        System.out.print("Enter the marks of 2nd Subject between 1-100: ");
        int b = sc.nextInt();
        System.out.print("Enter the marks of 3rd Subject between 1-100: ");
        int c = sc.nextInt();
        System.out.print("Enter the marks of 4th Subject between 1-100: ");
        int d = sc.nextInt();
        System.out.print("Enter the marks of 5th Subject between 1-100: ");
        int e = sc.nextInt();
        int total_marks = a+b+c+d+e;
        System.out.println("Total marks is: "+total_marks);
        int average = total_marks/5;
        System.out.println("Avergae Percentage is: "+average);
        if(average >= 80 && average <=100)
        {
            System.out.println("A+ grade");
        }
        else if(average >= 70 && average < 80)
        {
            System.out.println("A grade");
        }
        else if(average >= 60 && average < 70)
        {
            System.out.println("B grade");
        }
        else if(average >= 50 && average < 60)
        {
            System.out.println("c grade");
        }
        else if(average >= 33 && average < 50)
        {
            System.out.println("D grade");
        }
        else 
        {
            System.out.println("Fail");
        }

    }
    
}
