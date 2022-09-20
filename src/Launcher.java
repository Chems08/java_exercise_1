import java.util.Scanner;


public class Launcher { 
    
    public static int fibo(int n){
        if (n == 0) {return 0;}
        else if (n == 1) {return 1;}
        else {return fibo(n-1)+fibo(n-2);}
    }    

    public static void main(String[] args) { 
        System.out.println("Bienvenue");
        Scanner scan = new Scanner(System.in); 
        String command = scan.nextLine();
        
        while (!command.equals("quit")){

            if (command.equals("fibo")){
                String n_string = scan.nextLine();
                //parse string to int
                int n = Integer.parseInt(n_string);  
                System.out.println(fibo(n));
                }
                 
            if (command.equals("quit")){
                scan.close();}
        
            else {
                if(!command.equals("fibo")){
                    System.out.println("Unknown command");}
                System.out.println("Bienvenue");
                command = scan.nextLine();}

        }
    }
}


