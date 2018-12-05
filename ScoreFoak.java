import java.util.Arrays;

public class ScoreFoak implements ScoreProcessor{
  public ScoreFoak(){}

  @Override
  public boolean setScore(int[] i, Scorecard s){
    int ttl=0;
    Arrays.sort(i);

    if(i[0]==i[3]||i[1]==i[4])
      for (int v:i){
        ttl+=v;
      }
    if(PreventDoubleScore.checkScore(s.getFoak())){
      s.setFoak(ttl);
      return true;
    }
    return false;
  }
}
