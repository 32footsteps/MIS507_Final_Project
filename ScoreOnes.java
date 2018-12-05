public class ScoreOnes implements ScoreProcessor{
  private int num=0;

  public ScoreOnes(){}

  @Override
  public boolean setScore(int[] i, Scorecard s){
    for (int v:i){
      if(v==1)num+=v;
    }
    if(PreventDoubleScore.checkScore(s.getOnes())){
      s.setOnes(num);
      return true;
    }
    return false;
  }
}
