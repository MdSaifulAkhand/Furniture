/*
3- Derive a class Desk from furniture that implements a one drawer desk, knowing that a desk has four legs and its length can only be between 24 and 60 inches, and
the width between 16 and 30 inches and the heigh between 28 and 32 inches. Throw exceptions if inputs don’t fall within those measurements. Provide all getters,
setters and constructors that you deem necessary. Test your class.


 */






public class Desk extends Furniture {
    private double deskLength;
    private double deskWidth;
    private double deskHeight;

    public Desk(){
        super();
    }

    public Desk(double length, double width, double height) throws Exception{
        super(0.0,0.0,0.0,4,0,"unknown","unknown",0);
        setDeskLength(length);
        setDeskWidth(width);
        setDeskHeight(height);
    }

    public double getDeskLength() {
        return deskLength;
    }

    public double getDeskWidth() {
        return deskWidth;
    }

    public double getDeskHeight() {
        return deskHeight;
    }

    public int getLegs(){return super.getNumOfLegs();}

    public void setDeskLength(double deskL) throws Exception {
        if(deskL<24.0 || deskL>60.0){
            throw new Exception("Invalid Length Entered");
        }
        this.deskLength = deskL;
    }

    public void setDeskWidth(double deskW) throws Exception {
        if(deskW<16 || deskW>30){
            throw new Exception("Invalid width Entered");
        }
        this.deskWidth = deskW;
    }

    public void setDeskHeight(double deskH) throws Exception {
        if(deskH<28 || deskH>32){
            throw new Exception("Invalid height Entered");
        }
        this.deskHeight = deskH;
    }

    public void setLegs(int legs) throws Exception{
        super.setNumOfLegs(4);
    }

    public String toString(){
        String s = "Desk Properties: "+"\n------------------------"+
                "\nNumber Of legs: "+this.getLegs()+
                "\nLength: "+this.deskLength+
                "\nWidth: "+this.deskWidth+
                "\nHeight: "+this.deskHeight;
        return s;
    }
}
