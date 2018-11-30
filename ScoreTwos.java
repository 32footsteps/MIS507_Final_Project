public class ScoreTwos implements ScoreProcessor{
  private int num=0;
  
  public ScoreTwos(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    for (int v:i){
      if(v==2)num+=v;
    }
    s.setTwos(num);
  }
}
