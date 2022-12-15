import java.util.Scanner;
public class Starting_screen{
  Starting_screen(){
    
  }
  public static void display(){
    Scanner input = new Scanner(System.in);
    Register register = new Register();
    Login login = new Login();
    System.out.print("\n\nHey Welcome To our Dating App\n");
		System.out.print("--------------------------------------");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("--------------------------------------\n");
		System.out.print("Do you have an account?\n");
		System.out.print("Register[0] Login [1] Exit[2]\n");
		System.out.print("Select Option: ");
		int option_num = input.nextInt();
		System.out.print("\n--------------------------------------\n");

		if (option_num == 0) {
			register.register();
    }else if(option_num == 1){
      login.login();
    } else if (option_num == 2){
      System.out.println("Sucessfully Exited!");
      System.exit(0);
    }else {
			System.out.println("The number you just entered isnt on the available option!");
		}
  }
}