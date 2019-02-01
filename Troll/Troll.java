import java.util.ArrayList;

public class Troll{
     double money = 0.0;
     static double totalBling = 0.0;
     ArrayList<Double> array = new ArrayList<Double>();
     
     public void collect(double a){
         array.add(a);
         totalBling += a;
     }
     public double myMoney(){
         return array.get(2);
     }
     public static double treasury(){
         return totalBling;
     }
     public static void emptyTreasury(){
         totalBling = 0;
     }
}