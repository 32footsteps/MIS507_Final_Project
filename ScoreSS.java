import java.util.*;

public class ScoreSS implements ScoreProcessor{
  private int num=0;

  public ScoreSS(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    Arrays.sort(i);
    for(int j=0;j<i.length-1;j++){
      if(i[j]<i[j+1]){
        if(i[j+1]-i[j]==1){num++;}
      }
    }
    if(num==3){s.setSS(30);}
    else{s.setSS(0);}
  }
}
