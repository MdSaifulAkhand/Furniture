public class Tester {
    public static void main(String[] args) {
        try{
            Furniture f = new Furniture(7.9,4.2,5.1,4,0,"oak","Sai",2010);
            System.out.println(f.toString());
            Furniture g = new Furniture();
            System.out.println(g.toString());
            System.out.println(g.isEqual(f));
            System.out.println(f.isEqual(f));
            f.resize(2);
            System.out.println(f.toString());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("CoffeeTable class starts here............................");

        CoffeeTable c = new CoffeeTable();
        try {
            c.setDiameter(15);
            c.setHeight(13);
            c.setNumOfLegs(3);
            c.setDrower();
            c.setTypeOfWood();
            System.out.println(c.toString());

            System.out.println("New CoffeeTable Start here: ");

            CoffeeTable ct = new CoffeeTable(18.0,12,"Saif",2017);
            System.out.println(ct.toString());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Chair class starts here...................................");
        try{
            Chair ch = new Chair();
            ch.setChairHeight(20.0);
            ch.setLegs(9);
            ch.setDrawer(8);
            System.out.println("New chair begins here calling with constructor................");
            Chair chair = new Chair(22.0);
            System.out.println(chair.toString());

            System.out.println(ch.toString());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println("Desk class starts here.............");
        try{
            Desk desk = new Desk();
            desk.setDeskWidth(20);
            desk.setDeskLength(30);
            desk.setDeskHeight(29);
            desk.setLegs(100);
            System.out.println(desk.toString());
            System.out.println("New desk starts here........................");
            Desk ds= new Desk(50.0,25,31);
            System.out.println(ds.toString());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }



    }
}
