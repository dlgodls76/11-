package trainingTest;

import java.util.*;
public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Character> a = new ArrayList<Character>();
		
		System.out.print("학점 5개 입력 >> ");
		
		for(int i = 0; i < 5; i++) {
			
			String s = sc.next();
			
			char c = s.charAt(0);
			
			a.add(c);
		}
		
		  Iterator<Character> it = a.iterator();
	        
	        while(it.hasNext()) {
	        	
	        	char n = it.next();
	        	System.out.println(n);
	        }
	        
		for(int i = 0; i < 5; i++) {
			if(a.get(i) == 'A') {
				System.out.print("4.0 ");
			}
			else if(a.get(i) == 'B') {
				System.out.print("3.0 ");
			}
			else if(a.get(i) == 'C') {
				System.out.print("2.0 ");
			}
			else if(a.get(i) == 'D') {
				System.out.print("1.0 ");
			}
			else if(a.get(i) == 'F') {
				System.out.print("0.0 ");
			}
		}
	}
}
