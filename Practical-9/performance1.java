class performance1{

	public static void main(String[] args) {
    	
 		performance1 obj = new performance1();       
        
        	int number = 5;
        	long start, end;

        	start = System.nanoTime();
        	long resultRecursive = obj.recursiveFactorial(number);
        	end = System.nanoTime();
        	System.out.println("Recursive Factorial: " + resultRecursive + ", Time: " + (end - start) + " ns");

        	start = System.nanoTime();
        	long resultIterative = obj.iterativeFactorial(number);
        	end = System.nanoTime();
        	System.out.println("Iterative Factorial: " + resultIterative + ", Time: " + (end - start) + " ns");
    	}

    	long recursiveFactorial(int n) {
       		if (n == 0 || n == 1) return 1;
        	return n * recursiveFactorial(n - 1);
  	}

   	long iterativeFactorial(int n) {
        	long result = 1;
        	for (int i = 2; i <= n; i++) {
        	    result *= i;	
       		}
        	return result;
   	 }
}

