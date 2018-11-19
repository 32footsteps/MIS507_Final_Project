import java.util.*;

public class Game{
  private Scorecard s1=Scorecard.getInstance();
  private RollDice r1=RollDice.getInstance();
  private ScoreFactory sf=new ScoreFactory();
  Scanner c=new Scanner(System.in);
  int x=0;

  public Game(){}

  public void setName(String s){s1.setName(s);}
  public String getName(){return s1.getName();}

  public void firstRoll(){
    r1.newRoll();
    System.out.println("Your first roll of the dice:");
    this.viewDice();
    x++;
  }

  public void rollAgain(){
    System.out.println("Do you want to roll again?");
    if(c.nextLine().equals("y")){
      this.pickDice();
    }
    else {
      if(x==2){
        this.pickScore();
      }
      else {
        this.rollAgain();
        x++;
      }
    }
  }

  public void pickDice(){
    System.out.println("Which dice do you want to reroll? (pick the dice number)");
    int num=c.nextInt();
    this.newRoll(num-1);
    c.nextLine();
    System.out.println("Do you want to change another dice?");
    if(c.nextLine().equals("y")){this.pickDice();}
    this.viewDice();
    this.pickScore();
  }

  public void newRoll(int i){
    r1.secondRoll(i);
  }

  public void viewDice(){
    r1.printRoll();
  }

  public void pickScore(){
    System.out.println(s1.toString());
    System.out.println("Choose the row number that matches where you want to enter your score");
    System.out.println("***to enter a 0 choose a field that doesn't match your roll");
    System.out.println("Your choice: ");
    ScoreProcessor sp = sf.getScore(c.nextInt());
    this.enterScore(sp);
  }

  public void enterScore(ScoreProcessor sp){
    sp.setScore(r1.getRoll(),s1);
    System.out.println("Next roll...");
    this.firstRoll();
  }
}
