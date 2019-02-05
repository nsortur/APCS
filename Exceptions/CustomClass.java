
/**
 * Write a description of class CustomClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CustomClass{
    //The exception shouldn't trigger, it should just print out good
    public int x = 20;
    public void someMethod() throws CustomException{
        if(x < 10){
            //Calling the customexception constructor with the string parameter
            throw new CustomException("X < 10");
        } else{
            System.out.println("Good");
        }
    }
}
