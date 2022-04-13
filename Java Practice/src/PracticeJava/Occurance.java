package PracticeJava;

public class Occurance {
public static void main(String[] args) {
	int[]s= {2,5,2,5,8,8,8};
	for(int i = 0;i<s.length;i++) {
		int count= 0;
		int b=s[i];
		for(int j = 0;j<s.length;j++) {
			int b2 = s[j];
			if(b==b2 && i>j){
				break;
			}
			if(b==b2){
				count++;
			}
		}		
			if(count>0) {
				System.out.println(b+" present "+count+" times");
			}
		}
}
}
