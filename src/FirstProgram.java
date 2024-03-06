

public class FirstProgram {

	
	public static void main(String[] args) {
		
		int [] a = {1,2,3,3,2,4,5};	
		int count = 0;
		
		
		for(int i = 0; i<a.length; i++) {
			if(a[i] == 3) {
				a[i] = -1;
			}
		}
		
		for(int i = 0; i<a.length; i++) {
			
			if(a[i] != -1) {
				count++;
			}
		}
		
		for(int x : a) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println(count);
		
		
		

	}
	
	

}


