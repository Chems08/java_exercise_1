import java.util.Scanner;


public class Launcher { 
    public static void main(String[] args) { 
        System.out.println("Bienvenue");
        Scanner scan = new Scanner(System.in); 
        String command = scan.nextLine();
        
        while (!command.equals("quit")){
            System.out.println("Unknown command");
            System.out.println("Bienvenue");            
            command = scan.nextLine();
        }
        
        if (command.equals("quit")){
                scan.close();
        }

    }
}
