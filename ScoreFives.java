public class ScoreFives implements ScoreProcessor{
  private int num=0;

  public ScoreFives(){}

  @Override
  public boolean setScore(int[] i, Scorecard s){
    for (int v:i){
      if(v==5)num+=v;
    }
    if(PreventDoubleScore.checkScore(s.getFives())){
      s.setFives(num);
      return true;
    }
    return false;
  }
}
