import java.util.Scanner;
public class Register{

  Register(){
    
  }

  public static void register(){
    Scanner input = new Scanner(System.in);
    Starting_screen screen = new Starting_screen();

    System.out.println("\nRegister\n");
    		System.out.print("\n--------------------------------------\n");
    System.out.println("Enter your username: ");
		Main.username = input.nextLine();

    System.out.println("Enter your password: ");
		Main.password = input.nextLine();
    		System.out.print("\n--------------------------------------\n");
    screen.display();
  }
  
}