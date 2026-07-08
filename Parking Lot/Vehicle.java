public class Vehicle{
    private String Vno;
    private String owner;
    private int slotno;
    Vehicle(String Vno,String owner,int slot){
        this.Vno = Vno;
        this.owner = owner;
        this.slotno = slot;
    }
    public String getVno(){
        return this.Vno;
    }
     public String getOwner(){
        return this.owner;
    }
    public int getSlot(){
        return this.slotno;
    }
    public void setSlot(int s){
        this.slotno = s;
    }
}