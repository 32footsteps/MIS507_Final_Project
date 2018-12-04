import java.util.*;

public class RollValidate{
  private static RollValidate instance;
  private Scanner c=new Scanner(System.in);

  public static RollValidate getInstance(){
    if(instance==null){return new RollValidate();}
    return instance;
  }

  public RollValidate(){}

  public boolean getValidate(List<Integer> l){
    System.out.println("Are you sure you want to change these "+l.toString()+" dice? (y or n)");
    if(c.nextLine().equals("y")){return true;}
    return false;
  }
}
