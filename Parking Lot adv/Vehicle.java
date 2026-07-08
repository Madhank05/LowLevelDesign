public class Vehicle{
    private String Vno;
    private String owner;
    private int slotno;
    private String type;
    Vehicle(String Vno,String owner,int slot,String type){
        this.Vno = Vno;
        this.owner = owner;
        this.slotno = slot;
        this.type = type;
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
    public String getType(){
        return this.type;
    }
    public void setSlot(int s){
        this.slotno = s;
    }
}