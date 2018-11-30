public class ScoreY implements ScoreProcessor{
  private int num=0;

  public ScoreY(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    int li=i[0];
    for(int x=0;x<i.length;x++){
      if(i[x]==li){num++;}
      li=i[x];
    }
    if(num==5){s.setY(50);}
    else{s.setY(0);}
  }
}
