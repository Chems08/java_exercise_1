import java.util.*;
import java.nio.file.*;
import java.io.*;

public class Launcher { 
    

    public static int fibo(int n){
        if(n <= 1) {
			return n;
		}
		int fib = 1;
		int fib2 = 1;
		
		for(int i=2; i<n; i++) {
			int temp = fib;
			fib+= fib2;
			fib2 = temp;
		}
		return fib;
    }
        

    public static String freq() {
        List<String> myList5 = new ArrayList<String>();
        try {
        Scanner scan = new Scanner(System.in);
        String fichier = Files.readString(Path.of(scan.nextLine()));

        String result = fichier.toLowerCase().replaceAll("\\p{Punct}", "");
        String test = result.trim().replaceAll(" +", " ");
        String test2 = test.trim().replaceAll("\\n", " ");

        List myList = new ArrayList();
        myList = Arrays.asList(test2.split(" "));
        Map<String, Integer> total = new HashMap<>();
 
        List myList1 = new ArrayList();
        List myList4 = new ArrayList<>();


        for (int i=0 ; i < myList.size(); i++) {  
                total.putIfAbsent(myList.get(i).toString(),Collections.frequency(myList, myList.get(i)));
        }

        List <Map.Entry<String, Integer>> myList3 = new ArrayList<>(total.entrySet());

        Collections.sort(myList3, new Comparator<Map.Entry<String,Integer>>(){
            public int compare(Map.Entry<String,Integer> e1, Map.Entry<String,Integer> e2){
                return e2.getValue()-e1.getValue();
            }

        });

        int count = 0;
        int i =0;
        
        while (count<3){
            
            if (myList3.get(i).toString().charAt(0) != '=' ){
                myList4.add(myList3.get(i));
                count+=1;
            }
            i++;

        }
        String str = "";
        int tmp = 0;

        for (int j=0; j<myList4.size(); j++){
            tmp = myList4.get(j).toString().indexOf("=");
            str = myList4.get(j).toString().substring(0,tmp);
            myList5.add(str);
        }



        } catch (IOException e) {
             System.out.println("Unreadable file: "+ e);

        }
        
        return String.join(" ", myList5);
    }



    public static void main(String[] args) { 

        
        Scanner scan = new Scanner(System.in); 
        String command = scan.nextLine();
        
        while (!command.equals("quit")){

            if (command.equals("fibo")){
                System.out.println("Entrez un nombre n:");
                String n_string = scan.nextLine();
                int n = Integer.parseInt(n_string);  
                System.out.println(fibo(n));
                }
            if (command.equals("freq")){
                System.out.println(freq());
                }
                 
            if (command.equals("quit")){
                scan.close();}
        
            else {
                if(!command.equals("fibo")){
                    if (!command.equals("freq")){
                    System.out.println("Unknown command");}}
                
                command = scan.nextLine();}

        }
    }
}


