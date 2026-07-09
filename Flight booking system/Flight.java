import java.util.*;
public class Flight{
    static int id=0;
    private int fid;
    private int ticketPrice;
    private int seats;
    private ArrayList<Integer> passengerCount;
    private ArrayList<String> passengerDetails;
    private ArrayList<Integer> passengerId;
    private ArrayList<Integer> passengerPrice;
    Flight(){
        fid= id+1;
        passengerCount = new ArrayList<>();
        passengerDetails = new ArrayList<>();
        passengerId = new ArrayList<>();
        passengerPrice = new ArrayList<>();
        ticketPrice = 5000;
        seats = 50;
    }
    void bookTicket(int id,int tickets){
        int price = tickets*ticketPrice;
        if(tickets>seats){
            System.out.println("Seat Not Available");
            return;
        }
        seats-=tickets;
        String passdetail = "Passenger ID : "+id+" | Tickets Booked : "+tickets+" | Price : "+price;
        passengerCount.add(tickets);
        passengerId.add(id);
        passengerPrice.add(price);
        passengerDetails.add(passdetail);
        ticketPrice+=200*tickets;
        System.out.println("Ticket booked Successfully");
        System.out.println(passdetail);
    }
    void cancelTicket(int id){
        int pid = passengerId.indexOf(id);
        if(pid<0){
            System.out.println("Passenger Not Found");
            return;
        }
        int pcount = passengerCount.remove(pid);
        int price = passengerPrice.remove(pid);
        passengerId.remove(pid);
        passengerDetails.remove(pid);
        ticketPrice-=pcount*200;
        seats+=pcount;
        System.out.println("Ticket Cancelled Successfully");
        System.out.println("Passenger Id : "+id+" | Passenger Count : "+pcount+" | Your refund Amount : "+price);
    }
   void displayFlightDetails(){
    System.out.println("Flight Id : "+fid+" | Available Seats : "+seats+" | Ticket fare per Seat : "+ticketPrice);
    displayPassengerDetails();
   }
   void displayPassengerDetails(){
    System.out.println("Passenger Details");
    for(String p : passengerDetails){
        System.out.println(p);
    }
   }
} 