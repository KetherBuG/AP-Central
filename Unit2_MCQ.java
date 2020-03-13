
public class Unit2_MCQ
{
  public static void main(){
  Thing something = null;
  System.out.println("public class Thing"+
"\n{\nprivate String color;"+
   "\npublic Thing(){"+
     "\ncolor = Blue;"+
    "\n}"+
    "\npublic Thing(String setColor){"+
       "\n color = setColor;"+
   "\n }"+
"\n});");
  System.out.println("\nIf you do Thing = something; \nthe result is");
  System.out.println(something);
}
}
