
/**
 * Write a description of class Unit3_IIMCQ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit3_IIMCQ
{
    public void exe(){
    System.out.println("\n **Unit 3 MCQ No.2");
    String first = new String("duck");
    String second = new String("duck");
    String third = new String("goose");
    System.out.print("\n The result of executing this code is: ");
    if(first == second){
        System.out.print(" A");
    }else if(second == third){
        System.out.print(" C");
    }else if(first.equals(second)){
        System.out.print(" D");
    }else if(second.equals(third)){
        System.out.print(" E");
    }
    System.out.println("\n Which mean that first.equals(second) where String first = new String(duck); and String second = new String(duck);");

}
}

