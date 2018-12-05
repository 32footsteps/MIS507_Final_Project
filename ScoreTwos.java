public class ScoreTwos implements ScoreProcessor{
  private int num=0;
  public ScoreTwos(){}

  @Override
  public boolean setScore(int[] i, Scorecard s){
    for (int v:i){
      if(v==2)num+=v;
    }
    if(PreventDoubleScore.checkScore(s.getTwos())){
      s.setTwos(num);
      return true;
    }
    return false;
  }
}
