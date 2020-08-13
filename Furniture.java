/*
1- Design and code and test a class that implements furniture. A furniture is anything like a desk, a bed, a table, ...etc. Usually a furniture has a length a
width and a high, can have different number of legs, can have drawers, type of wood used to build it (eg. cherry, ash, oak, ...etc), the maker of the furniture
and the year it was built.
        a- You should be able to return a furniture object as a string (toString)
        b- compare two furnitures (equals).
        c- Design a method resize that will accept a double and returns an object furniture so that the length, the width and the heigh are multiplied by the
        factor (the input).
        d- Provide exceptions whenever possible, for instance if the dimensions are negative or the resize factor is negative etc…


*/

public class Furniture {
    private double  length;
    private double width;
    private double height;
    private int numOfLegs;
    private int numOfDrawers;
    private String typeOfWood;
    private String makerName;
    private int buildYear;

    public Furniture(){
        length=0.0;
        height=0.0;
        width=0.0;
        numOfLegs=0;
        numOfDrawers=0;
        typeOfWood="Unknown";
        makerName="Unknown";
        buildYear=0;

    }

    public Furniture(double length, double width, double height, int numOfLegs, int numOfDrawers, String typeOfWood, String makerName, int buildYear) throws Exception {
        if(length<0.0){
            throw new Exception("This number can not be negative");
        }
        if(width<0.0){
            throw new Exception("This number can not be negative");
        }
        if(height<0.0){
            throw new Exception("This number can not be negative");
        }
        if(numOfLegs<0){
            throw new Exception("This number can not be negative");
        }
        if(buildYear<0){
            throw new Exception("This number can not be negative");
        }
        this.length = length;
        this.width = width;
        this.height = height;
        this.numOfLegs = numOfLegs;
        this.numOfDrawers = numOfDrawers;
        this.typeOfWood = typeOfWood;
        this.makerName = makerName;
        this.buildYear = buildYear;
    }

    public Furniture(double l, double w, double h){
        this.length=l;
        this.width=w;
        this.height=h;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public int getNumOfDrawers() {
        return numOfDrawers;
    }

    public String getTypeOfWood() {
        return typeOfWood;
    }

    public String getMakerName() {
        return makerName;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setLength(double length) throws  Exception{
        if(length<0.0){
            throw new Exception("Length can not be negative");
        }
        this.length = length;
    }

    public void setWidth(double width) throws Exception {
        if(width<0.0){
            throw new Exception("Width can not be negative");
        }
        this.width = width;
    }

    public void setHeight(double height) throws Exception {
        if(height<0.0){
            throw new Exception("Height can not be negative");
        }
        this.height = height;
    }

    public void setNumOfLegs(int numOfLegs) throws Exception{
        if(numOfLegs<0) {
            throw new Exception("Number of legs can not be negative");
        }
        this.numOfLegs = numOfLegs;
    }

    public void setNumOfDrawers(int numOfDrawers) {
        this.numOfDrawers = numOfDrawers;
    }

    public void setTypeOfWood(String typeOfWood) {
        this.typeOfWood = typeOfWood;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }

    public void setBuildYear(int buildYear) throws Exception{
        if(buildYear<0){
            throw new Exception("Build Year can not be negative");
        }
        this.buildYear = buildYear;
    }


    public String toString() {
        return "Furniture{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", numOfLegs=" + numOfLegs +
                ", numOfDrawers=" + numOfDrawers +
                ", typeOfWood='" + typeOfWood + '\'' +
                ", makerName='" + makerName + '\'' +
                ", buildYear=" + buildYear +
                '}';
    }

    public boolean isEqual(Furniture f){
        if(this.height==f.height && this.width==f.width && this.length==f.length && this.buildYear==f.buildYear && this.makerName==f.makerName && this.numOfDrawers==f.numOfDrawers && this.numOfLegs==f.numOfLegs && this.typeOfWood==f.typeOfWood){
            return true;
        }
        return false;

    }

    public Furniture resize(int aValue) throws Exception{
        //Furniture newFurniture= new Furniture();
        //newFurniture.setLength(this.length*aValue);
        //newFurniture.setHeight(this.height*aValue);
        //newFurniture.setWidth(this.width*aValue);
        if(this.height<0 || this.width<0 ||this.length<0){
            throw new Exception("This can not be negative");
        }
        this.length=this.length*aValue;
        this.width=this.width*aValue;
        this.height=this.height*aValue;
        return new Furniture(this.length,this.width,this.height,this.numOfLegs,this.numOfDrawers,this.typeOfWood,this.makerName,this.buildYear);

    }


}
