import java.util.Arrays;

public class ScoreLS implements ScoreProcessor{
  private int num=0;

  public ScoreLS(){}

    @Override
    public boolean setScore(int[] i, Scorecard s){
      Arrays.sort(i);
      for(int j=0;j<i.length-1;j++){
        if(i[j]<i[j+1]){
          if(i[j+1]-i[j]==1){
            num++;
          }
        }
      }
      if(PreventDoubleScore.checkScore(s.getLS())){
        if(num==4){
          s.setLS(40);
          return true;
        }
        else{
          s.setLS(0);
          return true;
        }
      }
      return false;
    }
  }
