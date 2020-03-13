
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
   int x=Random.nextInt();
   int y=Random.nextInt();
   public void exeI(){
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
} 
}
