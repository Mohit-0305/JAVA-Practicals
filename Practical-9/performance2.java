class performance2 {
    	public static void main(String[] args) {
        	
        	int iterations = 10000;
        	long start, end;


        	start = System.nanoTime();
        	String str = "";
        	for (int i = 0; i < iterations; i++) {
        	    str += "a";
        	}
        	end = System.nanoTime();
        	System.out.println("String append time:        " + (end - start) + " ns");
	

        	start = System.nanoTime();
        	StringBuffer sbf = new StringBuffer();
        	for (int i = 0; i < iterations; i++) {
        	    sbf.append("a");
        	}
        	end = System.nanoTime();
        	System.out.println("StringBuffer append time:  " + (end - start) + " ns");
	

        	start = System.nanoTime();
        	StringBuilder sbd = new StringBuilder();
        	for (int i = 0; i < iterations; i++) {
        	    sbd.append("a");
        	}
        	end = System.nanoTime();
        	System.out.println("StringBuilder append time: " + (end - start) + " ns");
    	}
}	

