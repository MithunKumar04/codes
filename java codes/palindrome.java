import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String original,reverse="";
        original = sc.nextLine();   
        int length = original.length();   
        for ( int i = length - 1; i >= 0; i-- )  
            reverse = reverse + original.charAt(i);  
        if (original.equals(reverse))
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }
}