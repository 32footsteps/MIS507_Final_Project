import java.util.*;

public class DuoGame extends Game{
  private static DuoGame instance;
  private Scanner c=new Scanner(System.in);

  public DuoGame(){
    System.out.print("Player 1, what is your name? ");
    super.setName(c.nextLine());
    System.out.println("Welcome, "+super.getName());

    System.out.print("Player 2, what is your name? ");
    super.setName(c.nextLine());
    System.out.println("Welcome, "+super.getName());

    System.out.println("######################################");
    System.out.println("LET\'S PLAY!");
    super.firstRoll();
    super.rollAgain();
  }

  public static DuoGame getInstance(){
    if(instance==null){return new DuoGame();}
    return instance;
  }
}
