import java.util.Scanner;

public class GitTest
{
    public static void main(String[] args)
    {
        GitTest prg = new GitTest();
        System.out.println("Hello world it's a me! MAAAARIO");
        System.out.println("No its me WARIO!");
        prg.tired();
    }

    public void tired()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have any coffee? yes or no?");
        String coffee = sc.nextLine();
        if(coffee.equals("no"))
        {
            System.out.println("Go make some coffee!");
        }
        else
        {
            System.out.println("Good for you!");
        }
    }

}
