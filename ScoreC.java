public class ScoreC implements ScoreProcessor{
  private int ttl=0;

  public ScoreC(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    for(int v:i){ttl+=v;}
    s.setC(ttl);
  }
}
