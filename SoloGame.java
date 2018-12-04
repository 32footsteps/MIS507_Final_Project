import java.util.*;

public class SoloGame extends Game{
  private static SoloGame instance;
  private Scanner c=new Scanner(System.in);

  public static SoloGame getInstance(){
    if(instance==null){return new SoloGame();}
    return instance;
  }

  public SoloGame(){

    System.out.println(" .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------. ");
    System.out.println("| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |");
    System.out.println("| |  ____  ____  | || |      __      | || |  ____  ____  | || |  _________   | || |   ________   | || |  _________   | || |  _________   | |");
    System.out.println("| | |_  _||_  _| | || |     /  \\     | || | |_   ||   _| | || | |  _   _  |  | || |  |  __   _|  | || | |_   ___  |  | || | |_   ___  |  | |");
    System.out.println("| |   \\ \\  / /   | || |    / /\\ \\    | || |   | |__| |   | || | |_/ | | \\_|  | || |  |_/  / /    | || |   | |_  \\_|  | || |   | |_  \\_|  | |");
    System.out.println("| |    \\ \\/ /    | || |   / ____ \\   | || |   |  __  |   | || |     | |      | || |     .'.' _   | || |   |  _|  _   | || |   |  _|  _   | |");
    System.out.println("| |    _|  |_    | || | _/ /    \\ \\_ | || |  _| |  | |_  | || |    _| |_     | || |   _/ /__/ |  | || |  _| |___/ |  | || |  _| |___/ |  | |");
    System.out.println("| |   |______|   | || ||____|  |____|| || | |____||____| | || |   |_____|    | || |  |________|  | || | |_________|  | || | |_________|  | |");
    System.out.println("| |              | || |              | || |              | || |              | || |              | || |              | || |              | |");
    System.out.println("| '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |");
    System.out.println(" '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------' ");

    System.out.println("");
    System.out.print("Welcome player, what is your name? ");
    super.setName(c.nextLine());
    System.out.println("Welcome, "+super.getName());
    System.out.println("######################################");
    System.out.println("LET\'S PLAY!");

    try{Thread.sleep(5000);}
    catch (InterruptedException e){e.printStackTrace();}

    super.clearScreen();
    super.firstRoll();
  }
}
