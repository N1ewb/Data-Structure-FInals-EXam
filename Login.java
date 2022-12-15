import java.util.Scanner;
public class Login{
  Login(){
    
  }

  public static void login(){
    Scanner input = new Scanner(System.in);
    Personal_info info = new Personal_info();
    		System.out.print("\n--------------------------------------\n");
    System.out.println("\n\nLogin\n\n");
    		System.out.print("\n--------------------------------------\n");
    System.out.println("Enter your username: ");
		String username = input.nextLine();

    System.out.println("Enter youpassword: ");
		String password = input.nextLine();
    		System.out.print("\n--------------------------------------\n");
    System.out.print(Main.username);
      
    if(username != Main.username){
      if(password == Main.password){
        System.out.println("Wrong Password!");
      } else{
        		System.out.print("\n--------------------------------------\n");
        System.out.println("\n\nWe are going to gather some of your personal information, please fill these up respectively.\n\n");
        		System.out.print("\n--------------------------------------\n");
        info.info();
      }
    } else {
      System.out.println("Wrong Username!");
    }
  }
}