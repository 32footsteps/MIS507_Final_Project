public class ScoreFours implements ScoreProcessor{
  private int num=0;

  public ScoreFours(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    for (int v:i){
      if(v==4)num+=v;
    }
    s.setFours(num);
  }
}
