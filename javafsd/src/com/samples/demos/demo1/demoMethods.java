package com.samples.demos.demo1;

public class demoMethods {
   public static void main(String[] args) {
       System.out.println(calculateScore("vikas",4,100,700,true));
      System.out.println(calculateScore("vii",4,100,400,false));
	   
}
   
   public static int calculateScore(String name , int levlcomp , int bonus , int score , boolean game) {
	   if(game) {
		   int finalScore = score + (levlcomp * bonus);   
		   return finalScore;
	   }
	return score;
	  
   }
}
