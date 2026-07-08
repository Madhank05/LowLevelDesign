import java.util.*;
class Parking{
     HashMap<String,Vehicle> park;
    private boolean[] slot;
    Parking(int sz){
      this.slot = new boolean[sz];
       park = new HashMap<>();
    }
    void parkVehicle(String vno,String owner){
        if(park.containsKey(vno)){
            System.out.println("Vehicle already parked");
            return;
        }
        for(int i=0;i<slot.length;i++){
            if(!slot[i]){
                 park.put(vno,new Vehicle(vno,owner,i+1));
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
        System.out.println("Vehicle No : "+v.getVno() +" | Owner : "+v.getOwner()+" | slot : "+v.getSlot());
    }
    void display(){
        System.out.println("Vehicles in parking lot");
        for(Vehicle v : park.values())
         System.out.println("Vehicle No : "+v.getVno() +" | Owner : "+v.getOwner()+" | slot : "+v.getSlot());
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

}