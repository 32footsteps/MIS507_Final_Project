public class FirstRoll extends RollDice{
  RollDice rd=RollDice.getInstance();

  public FirstRoll(){
    rd.newRoll();
    rd.printRoll();
  }

  public RollDice getFirstRoll(){return rd;}
}
