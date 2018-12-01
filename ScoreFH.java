import java.util.Arrays;

public class ScoreFH implements ScoreProcessor{
  private int num=0;

  public ScoreFH(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    Arrays.sort(i);
    if(i[0]==i[1]&&i[1]==i[2]&&i[3]==i[4] || i[0]==i[1]&&i[2]==i[3]&&i[3]==i[4]){s.setFH(25);}
    else{s.setFH(0);}
  }
}
