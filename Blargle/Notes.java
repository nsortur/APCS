public class Car{
    
    double speed = 0;
    int numWheels = 0;
    String make = "";
    String model = "";
    
    public double getSpeed(){
        return speed;
    }
    public void setSpeed(double v){
        speed = v;
    }
    public int getWheels(){
        return numWheels;
    }
    public void setWheels(int a){
        numWheels = a;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public Car(){
        speed = 5.5;
        numWheels = 4;
        make = "Generic";
        model = "Car";
    }
    public Car(double s, int b, String n, String m){
        speed = s;
        numWheels = b;
        make = n;
        model = m;
    }
    public void accelerate(double a) {
        if (numWheels > 0){
            speed = speed + a;
        }
    }
    public void crash() {
        if (speed > 40 && numWheels > 0) {
            numWheels --;
        }
        speed = 0;
    }
    public String honk() {
        return "Generic Honk";
    }
}


public class Truck extends Car{
    //Truck is a subclass of car
    //Car is the superclass
    //Extends means that truck is a subclass
    //Still keeps all the variables and methods of car
    Car towedCar;
    
    public Truck(){
        super(); //super calls the superclass constructor
    }
    
    public Truck(double s, int w, String m, String d) {
        super(s,w,m,d);
    }
    
    public void tow(Car a) {
        a.setSpeed(this.speed);
        //this referrs to the object you are in, the speed of the truck
        towedCar = a;
        //keeping track of the towed car as a variable
    }
    
    //Able to override superclass method in the subclass
    public String honk() {
        return "BRWAAAAAAHHHH";
    }
    
    public void crash() {
        if (towedCar != null) {
            towedCar.crash(); 
        }
        if (speed > 50 && numWheels > 0) {
            numWheels --;
        }
        this.speed = 0;
    }
}



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
