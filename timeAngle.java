
public class time {
	
	public static double timeToAngle(String t) {
		 String[] b = t.split(":", 3);
         int h = Integer.parseInt(b[0]);
         int m = Integer.parseInt(b[1]);
         int s = Integer.parseInt(b[2]);
         
         // Input Validation
         if ( h < 0 || h > 23 || m < 0 || m > 60 || s < 0 || s > 60 ) {
        	 System.out.println("I/O Error - Out of Range");
        	 return 0.00;
        	 }
        
         
         else {
        	 double ha = 0.5 * ( 60 * ( h % 12 ) + m );
        	 double ma = 6 * m;
	        
	         if ( ha > ma )
	           return ( (ha - ma) % 360 );
	         else
	           return ( (ma - ha) % 360 );
         }
        		 
	}
	
	public static void main (String args[])
	{
		double angle = timeToAngle("3:30:12");
		System.out.println(angle);
	}

}
