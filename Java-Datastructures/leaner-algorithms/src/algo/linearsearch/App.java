package algo.linearsearch;

public class App {

	public static void main(String[] args) {
		
//		System.out.println(linearSearch([2,3,4],2));
		

	}
	
	public static int linearSearch(int [] a, int x) {
		int answer = -1;
		
		for ( int i=0; i<a.length; i++) {
			
			if (a[i] == x) {
				return i;
			}
			
		}
		
		return -1;
	}

}
