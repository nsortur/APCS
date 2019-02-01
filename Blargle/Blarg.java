public class Blarg{
    static int ting = 0;
    //Static int is shared with every instance of the object
    public void increment(){
        ting++;
    }
    public static int getTing(){
        return ting;
    }
    
}