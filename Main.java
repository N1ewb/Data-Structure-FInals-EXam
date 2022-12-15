import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
class Main {
  static String username;
  static String password;
	static String name;
	static String age;
	static String gender;
	static String height;
	static String likes;
	static String wants;
	static String add_info;
	static Boolean single;
	static LinkedList male_queue;
	static LinkedList female_queue;
	
	
	public static void main(String[] args) {
    Dates date = new Dates();
		Register register = new Register();
		Scanner input = new Scanner(System.in);
		LinkedList male_queue = new LinkedList<String>();
    LinkedList female_queue = new LinkedList<String>();
		
    clear.clearConsole();
		Starting_screen.display();    
	}	
}
