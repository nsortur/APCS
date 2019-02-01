
/**
 * Write a description of class TrollTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TrollTest
{
    public static void main(String[]args){
      
        Troll a  = new Troll();
        Troll b = new Troll();
    
    
        a.collect(1.5);
        b.collect(2.5);
        
        System.out.println(a.myMoney());
        System.out.println(b.myMoney());
        System.out.println(Troll.treasury());
        
        Troll.emptyTreasury();
        
        System.out.println(Troll.treasury());
    }
}
