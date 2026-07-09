import java.util.*;
public class BookFlight{
    static int passid=0;
   static ArrayList<Flight> flights = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of Flights : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)  flights.add(new Flight());
        boolean b=true;
        while(b){
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display fight details"); 
            System.out.println("4. exit");
            System.out.println("Enter you choice : ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the flight id : ");
                    int id = sc.nextInt();
                    if(id>n){
                        System.out.println("Invalid Flight Id");
                        break;
                    }
                    Flight f = flights.get(id-1);
                    if(f==null){
                     System.out.println("error");
                     break;
                    }
                    bookticket(f);
                    break;
                case 2:
                      System.out.println("Enter the flight id : ");
                    int id1 = sc.nextInt();
                    if(id1>n){
                        System.out.println("Invalid Flight Id");
                        break;
                    }
                    Flight f1 = flights.get(id1-1);
                    if(f1==null){
                     System.out.println("error");
                     break;
                    }
                    cancelticket(f1);
                    break;
                case 3:
                       System.out.println("Enter the flight id : ");
                    int id2 = sc.nextInt();
                    if(id2>n){
                        System.out.println("Invalid Flight Id");
                        break;
                    }
                    Flight f2 = flights.get(id2-1);
                    if(f2==null){
                     System.out.println("error");
                     break;
                    }
                    f2.displayFlightDetails();
                    break;
                case 4:
                    b=false;
                    break;
            }
        }
    }
   static void bookticket(Flight f){
        passid++;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of tickets  : ");
        int tickets = sc.nextInt();
        f.bookTicket(passid,tickets);
    }
   static void cancelticket(Flight f){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Passenger Id : ");
        int pid  = sc.nextInt();
        f.cancelTicket(pid);
    }
}