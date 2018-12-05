public class Scorecard{
  private static Scorecard instance;
  private int[] ts = new int[6];
  private int[] bs = new int[7];
  private String u="";

  public Scorecard(){
    for(int j=0;j<ts.length;j++){ts[j]+=-1;}
    for(int j=0;j<bs.length;j++){bs[j]+=-1;}
  }

  public void setName(String s){this.u=s;}
  public String getName(){return this.u;}

  public static Scorecard getInstance(){
    if(instance==null){return new Scorecard();}
    return instance;
  }

  public int ts(){
    int num=0;
    for(int i:ts){if(i!=-1){num+=i;}}
    return num;
  }

  public int bs(){
    int num=0;
    for(int i:bs){if(i!=-1){num+=i;}}
    return num;
  }

  public String getTopScore(int i){
    if(this.ts[i]==-1){return "--";}
    else{return ""+this.ts[i];}
  }

  public String getBottomScore(int i){
    if(this.bs[i]==-1){
      return "--";
    }
    else{
      return ""+this.bs[i];
    }
  }

  public void setOnes(int i){
    this.ts[0]=i;
  }
  public String getOnes(){return getTopScore(0);}

  public void setTwos(int i){this.ts[1]=i;}
  public String getTwos(){return getTopScore(1);}

  public void setThrees(int i){this.ts[2]=i;}
  public String getThrees(){return getTopScore(2);}

  public void setFours(int i){this.ts[3]=i;}
  public String getFours(){return getTopScore(3);}

  public void setFives(int i){this.ts[4]=i;}
  public String getFives(){return getTopScore(4);}

  public void setSixes(int i){this.ts[5]=i;}
  public String getSixes(){return getTopScore(5);}

  public void setToak(int i){this.bs[0]=i;}
  public String getToak(){return getBottomScore(0);}

  public void setFoak(int i){this.bs[1]=i;}
  public String getFoak(){return getBottomScore(1);}

  public void setFH(int i){this.bs[2]=i;}
  public String getFH(){return getBottomScore(2);}

  public void setSS(int i){this.bs[3]=i;}
  public String getSS(){return getBottomScore(3);}

  public void setLS(int i){this.bs[4]=i;}
  public String getLS(){return getBottomScore(4);}

  public void setY(int i){this.bs[5]=i;}
  public String getY(){return getBottomScore(5);}

  public void setC(int i){this.bs[6]=i;}
  public String getC(){return getBottomScore(6);}

  public String toString(){
    String s="";
    s+="-----------------------\n";
    s+="User: "+u+"\n";
    s+="-----------------------\n";
    s+="-----------------------\n";
    s+="(1)  ONES:          "+this.getOnes()+"\n";
    s+="(2)  TWOS:          "+this.getTwos()+"\n";
    s+="(3)  THREES:        "+this.getThrees()+"\n";
    s+="(4)  FOUR:          "+this.getFours()+"\n";
    s+="(5)  FIVES:         "+this.getFives()+"\n";
    s+="(6)  SIXES:         "+this.getSixes()+"\n";
    s+="-----------------------\n";
    s+="SUBTOTAL:           "+this.ts()+"\n";
    if(this.ts()>=63){
      s+="TOP BONUS:          35"+"\n";
      s+="TOP TOTAL:          "+(this.ts()+35)+"\n";
    }
    else{
      s+="TOP BONUS:          0\n";
      s+="TOP TOTAL:          "+this.ts()+"\n";
    }
    s+="-----------------------\n";
    s+="(7)  3 OF A KIND:   "+this.getToak()+"\n";
    s+="(8)  4 OF A KIND:   "+this.getFoak()+"\n";
    s+="(9)  FULL HOUSE:    "+this.getFH()+"\n";
    s+="(10) SMALL STRT:    "+this.getSS()+"\n";
    s+="(11) LARGE STRT:    "+this.getLS()+"\n";
    s+="(12) YAHTZEE:       "+this.getY()+"\n";
    s+="(13) CHANCE:        "+this.getC()+"\n";
    s+="------------------------\n";
    s+="BOTTOM TOTAL:       "+this.bs()+"\n";
    s+="------------------------\n";
    s+="------------------------\n";
    if(this.ts()>=63){
      s+="       TOTAL SCORE: "+(this.ts()+35+this.bs());
    }else{
      s+="       TOTAL SCORE: "+(this.ts()+this.bs());
    }
    s+="\n-----------------------\n";
    return s;
  }
}
