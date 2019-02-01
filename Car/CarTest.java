public class CarTest{
    public static void main(String[]args){
        Truck newtruck = new Truck();
        //cannot make a paramatered constructor though
        //only normal constructor is allowed without 
        //referring to super() in Truck
        
        Car MyCar = new Truck(5.0, 8, "Toyota", "Ultrabig");
        //Polymorphism: Superclass variable can store subclass object
        //shown by how car and truck are different
        
        //MyCar.tow(new Car()); has no access to subclass methods
        //(the tow method in truck)
        
        System.out.println(MyCar.honk());
        //This does the honk for the truck
        //Overriden versions of the methods are called(the ones in the subclass)
    }
}