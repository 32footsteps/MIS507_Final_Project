import java.util.Arrays;

public class ScoreFoak implements ScoreProcessor{
  public ScoreFoak(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    int ttl=0;
    Arrays.sort(i);

    if(i[0]==i[3]||i[1]==i[4])
      for (int v:i){ttl+=v;}
    s.setFoak(ttl);
  }
}
