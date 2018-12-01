import java.util.*;

public class SoloGame extends Game{
  private static SoloGame instance;
  private Scanner c=new Scanner(System.in);

  public SoloGame(){
    System.out.print("Player 1, what is your name? ");
    super.setName(c.nextLine());
    System.out.println("Welcome, "+super.getName());
    System.out.println("######################################");
    System.out.println("LET\'S PLAY!");

    try{Thread.sleep(5000);}
    catch (InterruptedException e){e.printStackTrace();}
    
    super.clearScreen();
    super.firstRoll();
  }

  public static SoloGame getInstance(){
    if(instance==null){return new SoloGame();}
    return instance;
  }
}
