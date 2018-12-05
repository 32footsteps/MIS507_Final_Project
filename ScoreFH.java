import java.util.Arrays;

public class ScoreFH implements ScoreProcessor{
  private int num=0;

  public ScoreFH(){}

  @Override
  public boolean setScore(int[] i, Scorecard s){
    Arrays.sort(i);
    if(PreventDoubleScore.checkScore(s.getFH())){
      if(i[0]==i[1]&&i[1]==i[2]&&i[3]==i[4] || i[0]==i[1]&&i[2]==i[3]&&i[3]==i[4]){
        s.setFH(25);
        return true;
      }
      else{
        s.setFH(0);
        return true;
      }
    }
    else{
      return false;
    }
  }
}
