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