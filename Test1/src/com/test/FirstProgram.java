package com.vit;

public class Pres01Task01 {
	int a = 3;
	int b = 4 ;
	int c = 5;
	void test() {
         if((a*a==b*b+c*c) || (b*b == a*a +c*c) || (c*c = a*a+b*b)) {
        	 System.out.printIn("Прямоугольный") ;
        	 
         }else {
        	 System.out.printIn("не прямоугольный") ;
         }
         
	}
         public static void main (String)[] args) {
        	 Pres01Task01 pt = new Pres01Task01 () ;
        	 pt.test();
         }
        	 
}

