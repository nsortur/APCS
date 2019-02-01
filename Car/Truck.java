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
