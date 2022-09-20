import java.util.Scanner;


public class Launcher { 
    public static void main(String[] args) { 
        System.out.println("Bienvenue");
        Scanner scan = new Scanner(System.in); 
        String command = scan.nextLine();
        
        if (command.equals("quit")){
            scan.close();
        } else {
            System.out.println("Unknown command");
            scan.close();
        }
        
        

    }
}
