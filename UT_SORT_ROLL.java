import java.util.*;

public class UT_SORT_ROLL{

  public static void setScore(int[] i, int num){
    int li=i[0];
    for(int x=0;x<i.length;x++){
      if(i[x]==li){num++;}
      li=i[x];
    }
    System.out.println("total count of equal values: "+num);
    if(num==5){System.out.println(50);}
    else{System.out.println(0);}
  }

  public static void main(String[] args){
    int[] a=new int[]{4,4,5,4,4};
    int[] b=new int[]{6,6,6,6,6};
    setScore(a, 0);
    setScore(b, 0);
  }
}
