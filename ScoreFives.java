public class ScoreFives implements ScoreProcessor{
  private int num=0;

  public ScoreFives(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    for (int v:i){
      if(v==5)num+=v;
    }
    s.setFives(num);
  }
}
