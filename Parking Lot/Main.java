import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Parking p = new Parking(3);
        while(true){
            System.out.println("1. Available slots");
            System.out.println("2. Park Vehicle");
            System.out.println("3. Remove Vehicle");
            System.out.println("4. Search Vehicle");
            System.out.println("5. Display Vehicles in Parking");
            System.out.println("6. exit");
            System.out.println("enter your choice : ");
            int choice = sc.nextInt();
             sc.nextLine();
            switch(choice){
                case 1:
                    p.freeSlots();
                    break;
                case 2:
                    System.out.println("Enter the Vehicle Number : ");
                    String vno = sc.nextLine();
                    System.out.println("Enter the Owner : ");
                    String owner = sc.nextLine();
                    p.parkVehicle(vno,owner);
                    break;
                case 3:
                     System.out.println("Enter the Vehicle Number : ");
                    String vno1 = sc.nextLine();
                    p.removeVehicle(vno1);
                    break;
                case 4:
                     System.out.println("Enter the Vehicle Number : ");
                    String vno2 = sc.nextLine();
                    p.search(vno2);
                    break;
                case 5:
                    p.display();
                    break;
                case 6:
                    break;
            }
        }
    }
}