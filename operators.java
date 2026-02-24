import java.util.Scanner;

class operators
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        int a=in.nextInt();
        int b=in.nextInt();

        System.out.println(a + " & " + b + " = "+(a&b) );
        System.out.println(a + " | " + b + " = "+(a|b) );
        System.out.println(a + " ^ " + b + " = "+(a^b) );
        System.out.println(" ~ " + a + " = "+~a );
        System.out.println(a + " >> " + b + " = "+(a>>b) );
        System.out.println(a + " << " + b + " = "+(a<<b) );
        System.out.println(a + " >>> " + b + " = "+(a>>>b) );
    }
}

