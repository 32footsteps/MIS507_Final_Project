public class ScoreFours implements ScoreProcessor{
  private int num=0;

  public ScoreFours(){}

  @Override
  public boolean setScore(int[] i, Scorecard s){
    for (int v:i){
      if(v==4)num+=v;
    }
    if(PreventDoubleScore.checkScore(s.getFours())){
      s.setFours(num);
      return true;
    }
    return false;
  }
}
