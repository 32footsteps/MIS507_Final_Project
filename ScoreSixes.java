public class ScoreSixes implements ScoreProcessor{
  private int num=0;

  public ScoreSixes(){}

    @Override
    public boolean setScore(int[] i, Scorecard s){
      for (int v:i){
        if(v==6)num+=v;
      }
      if(PreventDoubleScore.checkScore(s.getSixes())){
        s.setSixes(num);
        return true;
      }
      return false;
    }
  }
