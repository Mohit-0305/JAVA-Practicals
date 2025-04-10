import java.util.Random;

class sudokuGame2{
	public static void main(String[] args){
		sudokuGame2 obj = new sudokuGame2();
		String Grid = obj.grid(5);
		System.out.println(Grid);
	}
	
	String grid(int num){
		String out = "";
		Random rad = new Random();
		int i, j, rad1 = rad.nextInt(num) + 1;
		int start = rad1;
		String[][] arr = new String[num][num];
		for(i=1 ; i<=num ; i++){
			for(j=1 ; j<=num ; j++){
				if(start>num){
					start = (start % num);
				}
				arr[i-1][j-1] = start + "";
				start++;
			}
			start++;
		}
		int count = (num*num)/3;
		while(count>0){
			for(i=1 ; i<=num&&count>0 ; i++){
				for(j=1 ; j<=num&&count>0 ; j++){
					rad1 = rad.nextInt(num) + 1;
					if(rad1 == 1 && arr[i-1][j-1] != " "){
						arr[i-1][j-1] = " ";
						count--;
					}
					start++;
				}
				start++;
			}
		}
		
		boolean alt1 = true;
		boolean alt2 = false;
		int gap = num/10;
		if(num<1){
			return "Enter another number.";
		}else{
			for(i=1 ; i<=2*num+1 ; i++){
				for(j=1 ; j<=2*num+1 ; j++){
					if(alt1==true){
						if(alt2==true){
							out += "_".repeat(gap+1);
						}else{
							out +=" ";
						}
					}else{
						if(alt2==true){
							out += "|";
						}else{
							if(arr[(i-1)/2][(j-1)/2].isEmpty()){
								out += " ".repeat(gap+1);
							}else{
								out += arr[(i-1)/2][(j-1)/2];
							}
						}
					}
					alt2 = !alt2;
				}
				alt1 = !alt1;
				out += "\n";
			}
		}
		return out;
	}	
}
