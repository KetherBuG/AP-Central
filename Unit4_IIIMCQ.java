
/**
 * Write a description of class Unit4_IIIMCQ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit4_IIIMCQ
{
  public void exe(){
      System.out.println("\n **Unit 4 MCQ No.3");
      String word = "computer";
      int num = 3;
      String result = "";
      for(int k = num; k >=0; k --){
          result += word.substring(0,k);
        }
        System.out.println("the result of calling the method in Skill 2.C is " + result);
    }
    
}
