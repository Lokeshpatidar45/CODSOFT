import java.util.Scanner;
public class Money {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Doller: ");
        float d = sc.nextFloat();
        System.out.print("Enter Money convert ex:- India(i),Nepal(n),Srilanka(s),Australia(a): ");
        char c = sc.next().charAt(0);
        switch(c)
        {
            case 'i': System.out.println("Indian: "+(d*84.44));
            break;
            case 'n': System.out.println("Nepal: "+(d*134.71));
            break;
            case 's': System.out.println("Srilanka: "+(d*290.93));
            break;
            case 'a': System.out.println("Australia: "+(d*54.66));
            break;
            default : System.out.println("Wrong Character Input");
            break;
        }
    } 
    
}
