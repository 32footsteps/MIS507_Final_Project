public class ScoreThrees implements ScoreProcessor{
  private int num=0;

  public ScoreThrees(){}

  @Override
  public boolean setScore(int[] i, Scorecard s){
    for (int v:i){
      if(v==3)
        num+=v;
    }
    if(PreventDoubleScore.checkScore(s.getThrees())){
      s.setThrees(num);
      return true;
    }
    return false;
  }
}
