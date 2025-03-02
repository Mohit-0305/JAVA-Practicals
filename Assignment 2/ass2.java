class ass2{
	
	public static void main(String[] args){
		ass2 obj = new ass2();
		Integer num  = 2025;
		String out1 = obj.getSumOfDigits(num);
		String out2 = obj.palindrome(num);
		System.out.println("getSumOfDigits------>\n"+out1);
		System.out.println("\npalindrome------>\n"+out2);
	}
	
	String getSumOfDigits(int number){
        	if (number < 10) {
	            return number + "=" + number; 
	        }

        	int rem = number % 10;
        	String out = getSumOfDigits(number / 10);
               	int sum = Integer.parseInt(out.split("=")[1]) + rem;
		return out.split("=")[0] + "+" + rem + "=" + sum;
       }
       
       String palindrome(int number){
		String num = number + "";
		StringBuilder rev = new StringBuilder(num);
		rev.reverse();
		if(num.equals(rev.toString())){
			return num + " is Palindrome Number.\nJustification : The Origional number is "+num+", and when we reverse, we get "+rev+".\nSince "+num+"="+rev+", it is a palindrome.";
		}else{
			return num + " is not a Palindrome Number.\nJustification : The Origional number is "+num+", but when we reverse, it becomes "+rev+".\nSince "+num+"≠"+rev+", it is not a palindrome.";
		
      		}
	}
}


