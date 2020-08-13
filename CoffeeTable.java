/*
4- Derive a class  CoffeeTable from furniture that implements an oak coffee table with three legs and no drawers. The table is always circular. When a furniture is
circular its length is always 0 and the width corresponds to the diameter. The diameter should be between 10 and 24 inches and the heigh should be between 10 and
15 inches. Throw exceptions if inputs don’t fall within those measurements.
Provide all getters, setters and constructors that you deem necessary. Test your class.

 */





public class CoffeeTable extends Furniture {
    private double diameter;
    private double coffeeTableHeight;
    public CoffeeTable(){
        super();
    }
    public CoffeeTable(double diameter, double h, String makerN, int buildY) throws Exception{

        super(0,0,0,3,0,"Oak",makerN,buildY);
       this.setDiameter(diameter);
       this.setCoffeeTableHeight(h);
        }
     public void setDiameter(double diameter)throws Exception{
        if(diameter<10 || diameter>24){
            throw new Exception("invalid input");
        }
        this.diameter=diameter;
    }
    public void setCoffeeTableHeight(double height)throws Exception{
        if(height<10 || height>15){
            throw new Exception("invalid input");
        }
        this.coffeeTableHeight=height;
    }
    public void setTypeOfWood(){
        super.setTypeOfWood("Oak");
    }
    public void setLegs(int legs)throws Exception{
        if(legs<0){
            throw new Exception("invalid input");
        }
        super.setNumOfLegs(3);

    }
    public void setDrower(){
        super.setNumOfDrawers(0);
    }
    public double getDiameter(){
        return this.diameter;
    }
    public double getCoffeeTableHeight(){
        return this.coffeeTableHeight;
    }
    public double getLegs(){
        return super.getNumOfLegs();
    }
    public int getDrower(){
        return super.getNumOfDrawers();
    }
    public String getTypeOfWood(){
        return super.getTypeOfWood();
    }
    public String toString(){
        String s = "CoffeeTable Properties: \n"+ "Diameter: "+getDiameter()+"\nHeight: "+getHeight()+"\nLegs Num: "+getNumOfLegs()+"\nNumber Of Drawer: "+getDrower()+ "\nType of wood: "+getTypeOfWood()+"\nYear Build: "+super.getBuildYear();
        return s;
    }
}
