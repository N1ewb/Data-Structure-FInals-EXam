import java.util.Scanner;
import java.util.LinkedList;
public class Home_screen{

  Home_screen(){
    
  }

  public static void homescreen(){
    Scanner input = new Scanner(System.in);
    Dates date = new Dates();
    find_function find = new find_function();
    Starting_screen screen = new Starting_screen();
    LinkedList male_queue = new LinkedList<String>();
    LinkedList female_queue = new LinkedList<String>();
    System.out.print("\n--------------------------------------\n");
    System.out.println("Home Screen");
    System.out.print("\n--------------------------------------\n");
    System.out.println("Your Info: ");
    System.out.println("Your Name: " + Main.name);
    System.out.println("Your Age: " + Main.age);
    System.out.println("Your Height: " + Main.height);
    System.out.println("Your Likes: " + Main.likes);
    System.out.println("Your Wants: " + Main.wants);
    System.out.println("Your Hobbies: " + Main.add_info);
    System.out.print("\n--------------------------------------\n");
   
    System.out.println("Find Possible Dates [0]");
    System.out.println("Logout [1]");
    System.out.print("\n--------------------------------------\n");
    int choice = input.nextInt();
    if (choice == 0){
      System.out.println("Here are Lists of Names that could be your Date");
      date.name_list();
      System.out.print("\n--------------------------------------\n");
      find.find();
    } else if (choice == 1){
      screen.display();
    } else {
      System.out.println("Wait, that's illegal!");
    }
  }
}