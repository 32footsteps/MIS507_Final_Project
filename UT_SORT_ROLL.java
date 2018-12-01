import java.util.*;

public class UT_SORT_ROLL{

  public static void setScore(int[] i, int num){
    Arrays.sort(i);
    for(int j=0;j<i.length-1;j++){
      System.out.println(j);
      if(i[j]<i[j+1]){
        if(i[j+1]-i[j]==1){num++;}
      }
    }
    if(num==4){System.out.println(num+" it is a large straight");}
    else{System.out.println(num+" it is a not a large straight");}
    }

  public static void main(String[] args){
    int[] a=new int[]{4,2,5,1,3};
    int[] b=new int[]{6,6,6,6,6};
    setScore(a, 0);
    setScore(b, 0);
  }
}
