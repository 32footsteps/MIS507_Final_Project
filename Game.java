import java.util.*;

public class Game{
  private Scorecard sc=Scorecard.getInstance();
  private RollDice rd=RollDice.getInstance();
  private ScoreFactory sf=new ScoreFactory();
  Scanner c=new Scanner(System.in);
  int x=0;

  public Game(){}

  public void setName(String s){sc.setName(s);}
  public String getName(){return sc.getName();}

  public void firstRoll(){
    x=0;
    System.out.println(x);
    rd.newRoll();
    System.out.println("Your first roll of the dice:");
    this.viewDice();
    x++;
    this.rollAgain();
    System.out.println(x);
  }

  public void rollAgain(){
    if(x!=3){
      System.out.println("Do you want to roll again?");
      if(c.nextLine().equals("y")){
        this.pickDice();
      }
      else{
        x++;
        this.rollAgain();
      }
    }
    else{
      this.pickScore();
    }
  }

  public void pickDice(){
    System.out.println("Which dice do you want to reroll? (pick the dice number)");
    int num=c.nextInt();
    this.newRoll(num-1);
    c.nextLine();
    System.out.println("Do you want to change another dice?");
    if(c.nextLine().equals("y")){
      this.pickDice();
    }
    else{
      this.viewDice();
      x++;
      this.rollAgain();
    }
  }

  public void newRoll(int i){
    rd.secondRoll(i);
  }

  public void viewDice(){
    rd.printRoll();
  }

  public void pickScore(){
    System.out.println(sc.toString());
    System.out.println("Choose the row number that matches where you want to enter your score");
    System.out.println("***to enter a 0 choose a field that doesn't match your roll");
    System.out.println("Your choice: ");
    ScoreProcessor sp = sf.getScore(c.nextInt());
    c.nextLine();
    this.enterScore(sp);
  }

  public void enterScore(ScoreProcessor sp){
    sp.setScore(rd.getRoll(),sc);
    System.out.println("Your scorecard now: ");
    System.out.println(sc.toString());
    System.out.println("Next roll...");
    this.firstRoll();
  }
}
