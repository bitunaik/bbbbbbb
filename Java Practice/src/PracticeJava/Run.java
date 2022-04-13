package PracticeJava;

public class Run {
	
		public static void main(String[] args) {
			
		Demo3 d3 = new Demo3();
		d3.m1();  //imp in Demo3 m1
		d3.run();  //imp in Demo3 run
		d3.demo();  //imp in Demo3 demo
		
		Demo2 d2 = d3;  //up casting
		d2.m1();//imp in Demo3 m1
		d2.run(); //imp in Demo3 run 
	
		Demo2 d22=(Demo2)d2;  //down casting
		d22.m1(); //imp in Demo3 m1
		d22.run();//imp in Demo3 run
		
		Demo1 d1 = new Demo2();  //up 3.
		d1.m1();//imp in Demo2 m1
		Demo1 d11 = (Demo1)d1;   //down casting
		d11.m1();//imp in Demo2 m1
		
		
		}
}
//