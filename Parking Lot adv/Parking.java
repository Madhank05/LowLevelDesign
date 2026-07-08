import java.util.*;
class Parking{
     HashMap<String,Vehicle> park;
    private boolean[] slot;
    Parking(int sz){
      this.slot = new boolean[sz];
       park = new HashMap<>();
    }
    void parkVehicle(String vno,String owner,String type){
        if(park.containsKey(vno)){
            System.out.println("Vehicle already parked");
            return;
        }
        for(int i=0;i<slot.length;i++){
            if(!slot[i]){
                 park.put(vno,new Vehicle(vno,owner,i+1,type));
                 System.out.println("vehicle parked successfully");
                 slot[i]=true;
                 return;
            }
        }
       System.out.println("Parking filled");
    }
    void search(String vno){
        Vehicle v = park.get(vno);
        if(v==null){
          System.out.println("no vehicle is parked in this number : "+ vno);
          return;
        }
        System.out.println("Vehicle No : "+v.getVno() +" | Owner : "+v.getOwner()+" | slot : "+v.getSlot()+" | Type : "+v.getType());
    }
    void display(){
        System.out.println("Vehicles in parking lot");
        for(Vehicle v : park.values())
         System.out.println("Vehicle No : "+v.getVno() +" | Owner : "+v.getOwner()+" | slot : "+v.getSlot()+" | Type : "+v.getType());
    }
    void removeVehicle(String vno){
        Vehicle v = park.remove(vno);
        if(v!=null){
            slot[v.getSlot()-1] = false;
            System.out.println("Vehicle removed successfully");
            return;
        }
        System.out.println("Vehicle not found");
    }
    void freeSlots(){
        System.out.println("Available slots");
        for(int i=0;i<slot.length;i++){
            if(!slot[i]){
              System.out.println("Available Slot : "+(i+1));
            }
        }
    }
    void nearestSlot(){
        System.out.println("Nearest Available slots");
        for(int i=0;i<slot.length;i++){
            if(!slot[i]){
              System.out.println("Available Slot : "+(i+1));
              return;
            }
        }
        System.out.println("Slots Not Available");
    }
    void vehicleCount(){
        int car=0,bike=0,truck=0;
        System.out.println("Total Vehicles in Parking");
     for(Vehicle v : park.values()){
         if(v.getType().equals("Car"))
           car++;
        if(v.getType().equals("Bike"))
           bike++;
        if(v.getType().equals("Truck"))
           truck++;
     }
     System.out.println("Car : "+car);
     System.out.println("Bike : "+bike);
     System.out.println("Truck : "+truck);
     System.out.println("Total Vehicles : "+(car+bike+truck));
    }

}