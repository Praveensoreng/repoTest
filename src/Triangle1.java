
public class Triangle1 {
	double a;
	double b;
	double c;
	

	Triangle1(double a, double b, double c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	
	double calculateArea() {
		double s= (a + b + c) / 2.0;
		return  (Math.sqrt(s * (s - a) * (s - b) * (s - c)));
		}
	
}

