import java.util.*;

public class ScoreSS implements ScoreProcessor{
  private int num=0;

  public ScoreSS(){}

  @Override
  public boolean setScore(int[] i, Scorecard s){
    Arrays.sort(i);
    for(int j=0;j<i.length-1;j++){
      if(i[j]<i[j+1]){
        if(i[j+1]-i[j]==1){num++;}
      }
    }
    if(PreventDoubleScore.checkScore(s.getSS())){
      if(num==3){
        s.setSS(30);
        return true;
      }
      else{
        s.setSS(0);
        return true;
      }
    }
    return false;
  }
}
