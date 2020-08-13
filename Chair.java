/*
2- Derive a class Chair from furniture to implement a Chair class, knowing that all chairs have four legs and no drawers and the heigh can only be between 16 and
22 inches (throw an exception if it is not). Provide all getters, setters and constructors that you deem necessary. Test your class
 */






public class Chair extends Furniture{
    private double chairHeight;

    public Chair(){
        super();
    }

    public Chair(double heightOfChair) throws Exception{
        super(0.0,0.0,0.0,4,0,"Unknown","Unknown",0);
        this.setChairHeight(heightOfChair);
    }


    public int getLegs(){
        return super.getNumOfLegs();
    }

    public int getDrawer(){
        return super.getNumOfDrawers();
    }

    public double getChairHeight(){
        return chairHeight;
    }
    public void setLegs(int legs) throws Exception{
        super.setNumOfLegs(4);
    }

    public void setDrawer(int drawer){
        super.setNumOfDrawers(0);
    }

    public void setChairHeight(double cHeight) throws Exception{
        if(cHeight<16 || cHeight>22){
            throw new Exception("Invalid height entered");
        }
        chairHeight=cHeight;

    }

    public String toString(){
        String s = "Chair Properties: "+"\n-------------------------"+
                "\nNumber Of Legs: "+this.getLegs()+
                "\nNumber Of Drawer: "+this.getDrawer()+
                "\nHeight Of Chair: "+this.getChairHeight();
        return s;
    }

}
