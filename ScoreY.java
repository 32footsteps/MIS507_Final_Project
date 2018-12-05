import java.util.Arrays;

public class ScoreY implements ScoreProcessor{
  public ScoreY(){}

  @Override
  public boolean setScore(int[] i, Scorecard s){
    Arrays.sort(i);
    if(PreventDoubleScore.checkScore(s.getY())){
      if(i[0]==i[4]){
        s.setY(50);
        return true;
      }
      else{
        s.setY(0);
        return true;
      }
    }
    return false;
  }
}
