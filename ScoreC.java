public class ScoreC implements ScoreProcessor{
  private int ttl=0;

  public ScoreC(){}

  @Override
  public boolean setScore(int[] i, Scorecard s){
    for(int v:i){ttl+=v;}
    if(PreventDoubleScore.checkScore(s.getFives())){
      s.setC(ttl);
      return true;
    }
    return false;
  }
}
