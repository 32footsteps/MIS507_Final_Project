import java.util.Arrays;

public class ScoreToak implements ScoreProcessor{
  public ScoreToak(){}

    @Override
    public boolean setScore(int[] i, Scorecard s){
      int ttl=0;
      Arrays.sort(i);

      if(i[0]==i[2]||i[1]==i[3]||i[2]==i[4]){
        for (int v:i){
          ttl+=v;
        }
      }
      if(PreventDoubleScore.checkScore(s.getToak())){
        s.setToak(ttl);
        return true;
      }
      return false;
    }
  }
