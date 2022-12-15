import java.util.LinkedList;
public class Dates{

  Dates(){
    
  }
  public static void lists(){
   

    
  }
  
  public static void name_list(){
    Main main = new Main();
    LinkedList male_queue = new LinkedList<String>();
    LinkedList female_queue = new LinkedList<String>();
    
    male_queue.push("Roe Jogan");
		male_queue.push("Dizzy Addedsanya");
		male_queue.push("Kneel Dead Grass Tyson");
		male_queue.push("Lloyd Forger");
		male_queue.push("Amha nahmen Rehmehx");

		female_queue.push("Ei Shogun");
		female_queue.push("Jean Gunnhildr");
		female_queue.push("Yor Mohm");
		female_queue.push("Yoh A Sohbi");
		female_queue.push("Skyler White Yo");
    System.out.println("Your Gender: " + Main.gender);

    System.out.println("Female Users:");
    
    switch(Main.gender){
        
      case "Male":
			  for(int i = 0; i < female_queue.size(); i++) {
          System.out.print("\n--------------------------------------\n");
				System.out.println(female_queue.get(i));
			}
        male_queue.push(Main.name);
        break;
      case "Female":
			  for(int i = 0; i < male_queue.size(); i++) {
          System.out.print("\n--------------------------------------\n");
				System.out.println(male_queue.get(i));
			}
        female_queue.push(Main.name);
        break;
      default:
        System.out.println("This is not a gender!");
        break;
    }
  }
}