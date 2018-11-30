public class AddRoll extends RollDice{
  public AddRoll(int[] i, RollDice rd){
    for(int v:i){rd.secondRoll(v);}
    rd.printRoll();
  }
}
