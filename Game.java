import java.util.*;

public class Game{
  private Scorecard sc=Scorecard.getInstance();
  private RollDice rd=RollDice.getInstance();
  private ScoreFactory sf=new ScoreFactory();
  private GameCounter gc=new GameCounter();
  private RollValidate rv=new RollValidate();
  Scanner c=new Scanner(System.in);
  List<Integer> l=new ArrayList<Integer>();
  int x=0;


  public Game(){}

  public void setName(String s){sc.setName(s);}
  public String getName(){return sc.getName();}

  public void clearScreen() {
   System.out.print("\033[H\033[2J");
   System.out.flush();
  }

  public void viewUI(){
    this.clearScreen();
    this.viewSC();
    System.out.println("This is turn number "+(x));
    this.viewDice();
  }

  public void viewDice(){
    System.out.println("YOUR CURRENT DICE ROLL:");
    rd.printRoll();
  }

  public void viewSC(){
    System.out.println(sc.toString());
  }

  public void waitASec(){
    try{Thread.sleep(2500);}
    catch (InterruptedException e){e.printStackTrace();}
  }

  public void firstRoll(){
    x=1;
    gc.setCount();
    rd.newRoll();
    this.viewUI();
    this.rollAgain();
  }

  public void newRoll(int i){
    rd.reRoll(i);
  }

  public void rollAgain(){
    if(x!=3){
      System.out.println("Do you want to roll again?");
      if(c.nextLine().equals("y")){
        x++;
        this.pickDice();
      }
      else{this.pickScore();}
    }
  }

  public void pickDice(){
    System.out.println("Which dice do you want to reroll? (pick the dice number)");
    int num=c.nextInt();
    l.add(num);
    c.nextLine();
    System.out.println("Do you want to change another dice?");
    if(c.nextLine().equals("y")){
      this.pickDice();
    }
    else{
      if(!rv.getValidate(l)){
        this.viewUI();
        System.out.println("OK, lets start over...");
        this.waitASec();
        l.clear();
        this.viewUI();
        this.pickDice();
      }
      else{
        this.viewUI();
        System.out.println("Re-rolling your chosen dice...");
        for(int i:l){
          this.newRoll(i-1);
        }
        l.clear();
        this.waitASec();
        this.viewUI();
        if(x<3){this.rollAgain();}
        else{this.pickScore();}
      }
    }
  }

  public void pickScore(){
    this.viewUI();
    int num=0;
    String str;
    System.out.println("Choose the row number that matches where you want to enter your score");
    System.out.println("***to enter a score of 0 choose a field that doesn't match your roll");
    System.out.println("Your choice: ");
    str=c.nextLine();
    try{
      num=Integer.parseInt(str);
    }
    catch(NumberFormatException e)
    {
      System.out.println("Wrong selection, please pick again...");
      this.waitASec();
      this.pickScore();
    }
    if(num>0 && num<=13){
      ScoreProcessor sp = sf.getScore(num);
      this.enterScore(sp);
    }
    else{
      System.out.println("Wrong selection, please pick again...");
      this.waitASec();
      this.pickScore();
    }
}

  public void enterScore(ScoreProcessor sp){
    sp.setScore(rd.getRoll(),sc);

    this.clearScreen();
    System.out.println(sc.toString());

    if(gc.getCount()<13){
      System.out.println("Next turn...");

      this.waitASec();
      this.firstRoll();
    }

    else{this.endGame();}
  }

  public void endGame(){
    this.viewUI();
    System.out.println("THANK YOU FOR PLAYING, GOOD-BYE");
    c.close();
  }
}
