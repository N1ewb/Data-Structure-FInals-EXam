import java.util.Scanner;
public class Personal_info{
  Personal_info(){
    
  }
  public static void info(){
      Scanner input = new Scanner(System.in);
      Home_screen home = new Home_screen();
    
      System.out.println("Enter you name: ");
      input.next();
			Main.name = input.nextLine();

			System.out.println("Enter you age: ");
			Main.age = input.nextLine();

			System.out.println("Enter you gender(Male / Female): ");
			Main.gender = input.nextLine();
      
			System.out.println("Enter you height: ");
			Main.height = input.nextLine();
     
			System.out.println("Enter you likes: ");
			Main.likes = input.nextLine();
    
			System.out.println("Enter you wants: ");
			Main.wants = input.nextLine();
    
			System.out.println("Enter you hobbies: ");
			Main.add_info = input.nextLine();
  
			Main.single = false;

      home.homescreen();
    
  }
}