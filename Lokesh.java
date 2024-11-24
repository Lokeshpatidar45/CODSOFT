import java.util.Scanner;
public class Lokesh
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber = 0;
        int myNumber = (int)(Math.random()*100);

        do{
            System.out.print("Guess my number between 1-100: ");
            userNumber = sc.nextInt();

            if(myNumber==userNumber)
            {
                System.out.println("Correct");
                break;
            }
            else if(userNumber>myNumber)
            {
                System.out.println("too large");
            }
            else 
            {
                System.out.println("too small");
            }
        }
        while(userNumber>=1);
        {
            System.out.print("The correct Number is: "+myNumber);
        }
    }
}