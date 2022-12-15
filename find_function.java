import java.util.Scanner;
public class find_function{
  
  find_function(){
    
  }

  public static void find(){
    Dates date = new Dates();
    Starting_screen screen = new Starting_screen();
    Scanner input = new Scanner(System.in);
    System.out.println("Find Possible Dates [0]");
    System.out.println("Logout [1]");
    System.out.print("\n--------------------------------------\n");
    int choice = input.nextInt();
    if (choice == 0){
      System.out.println("Here are Lists of Names that could be your Date");
      date.name_list();
    } else if (choice == 1){
      screen.display();
    } else {
      System.out.println("Wait, that's illegal!");
    }
  }
}