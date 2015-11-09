public class demo {
	
	public static boolean isFibonacci(int x) {
		if ( (int) Math.sqrt(5*x*x-4)  == Math.sqrt(5*x*x-4) || (int) Math.sqrt(5*x*x+4) == Math.sqrt(5*x*x+4) )
		    return true;
		else 
			return false;
	}

    public static void main(String[] args) {
   
    	
    	System.out.println(isFibonacci(3)? "Fibonacci":"Not Finbonacci");
    	System.out.println(isFibonacci(4)? "Fibonacci":"Not Finbonacci");
        
    }

}
