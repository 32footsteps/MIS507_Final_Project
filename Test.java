import java.util.*;

public class Test{
  public static void main(String[] args){
    Scanner c=new Scanner(System.in);
    System.out.print("Welcome to YAHTZEE\nHow many players? (chose 1 or 2)? ");
    switch(c.nextInt()){
      case(1):
        System.out.println("Solo human game");
        SoloGame sg1=SoloGame.getInstance();
      break;
      case(2):
        System.out.println("Human vs. Human game");
        DuoGame sg2=DuoGame.getInstance();
      break;
      default:
        System.out.println("Not an option");
      break;
    }
    c.close();
  }
}
