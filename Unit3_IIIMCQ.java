
/**
 * Write a description of class Unit3_IIIMCQ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Unit3_IIIMCQ
{
    Random Random = new Random();
   int result = 0;
   int x=1;
   int y=2;
   public void exeI(){
   System.out.println("\n **Unit 3 MCQ No.3");
   
   if(x>y){
       result = x - y;
       System.out.print(result);
    }
    else if(x<y){
        result = y -x ;
        System.out.print(result);
    }
    else{
        System.out.print(result);
    }
    System.out.println("This is the result when x = 1, y = 2");
} 
}
