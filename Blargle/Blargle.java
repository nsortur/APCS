public class Blargle{
    public static void main(String[]args){
        Blarg a = new Blarg();
        Blarg b = new Blarg();
        
        a.increment();
        b.increment();
        //Getting is a static method, so it is shared again
        //A and b are incrementing the same thing
        
        //Ex: You would never instantiate a math object, but you can
        //call any method from the class
        System.out.println(a.getTing());
        System.out.println(b.getTing());
        System.out.println(Blarg.getTing());
    }
}