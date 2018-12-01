import java.util.Arrays;

public class ScoreY implements ScoreProcessor{
  public ScoreY(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    Arrays.sort(i);
    if(i[0]==i[4]){s.setY(50);}
    else{s.setY(0);}
  }
}
