package javaprograms;

public class GstCalculator_1 {

	public float  getGst( float input) {
		
		float  out;
		if ( input <1000) {
			
			out = (input*5)/100;
		}
		 
		else if (input >= 1000 & input <= 2000) {
			
			out = (input*10)/100;
		}
			
		else  {
			out = (input*18)/100;
		}
		return out;
	}
}
