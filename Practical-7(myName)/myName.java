class myName{
	String str = "";	
	
	public static void main(String[] arg){
		int size = Integer.parseInt(arg[0]);
		myName obj = new myName();
		String a = obj.com(size);
		System.out.println(a);
	}
	
	//Letter M
	String M(int size){
		int ln, absize,i, mid, spa1,spa2;
		absize = 2*size+1;
		mid = size + 1;
		for(ln=1 ; ln<=absize ; ln++){
			str += "|";//*1
			if(ln<=mid){
				spa1 = ln-2;
			}else{
				spa1 = 0;
			}
			for(i=1 ; i<=spa1 ; i++){
				str+=" ";
			}
			if(ln <= mid && ln != 1){//*2
				str += "\\";
			}
			if(ln<=mid){
				spa2 = 2*(size -ln) + 1;
			}else{
				spa2 = absize-2;
			}
			for(i=1 ; i<=spa2 ; i++){
				str+=" ";
			}
			if(ln < mid && ln != 1){//*3
				str += "/";
			}
			for(i=1 ; i<=spa1 ; i++){
				str+=" ";
			}
			str += "|\n";
		}
		return str;
	}
	
	//Letter O
	String O(int size){
		String O = "";
		int ln, absize, i, spa;
		absize = 2*size+1;
		for(ln=1 ; ln<=absize ; ln++){
			O += "|";
			if(ln==1 || ln==absize){
				for(i=1 ; i<=absize-2 ; i++){
					O += "-";
				}
			}
			if(ln!=1 && ln!=absize){
				for(i=1 ; i<=absize-2 ; i++){
					O += " ";
				}
			}
			O += "|\n";
		}
		return O;
	}
	
	//Letter H
	String H(int size){
		String H = "";
		int ln, absize, i, spa, mid;
		absize = 2*size+1;
		mid = size+1;
		for(ln=1 ; ln<=absize ; ln++){
			H += "|";
			if(ln==mid){
				for(i=1 ; i<=absize-2 ; i++){
					H += "-";
				}
			}
			if(ln!=mid){
				for(i=1 ; i<=absize-2 ; i++){
					H += " ";
				}
			}
			H += "|\n";
		}
		return H;
	}
	
	//Letter I
	String I(int size){
		String I = "";
		int ln, absize, i, spa;
		absize = 2*size+1;
		for(ln=1 ; ln<=absize; ln++){
			if(ln!=1 && ln!=absize){
				for(i=1 ; i<=size ; i++){
					I += " ";
				}
			}
			if(ln==1 || ln==absize){
				for(i=1 ; i<=absize ; i++){
					I += "-";
				}
			}
			if(ln!=1 && ln!=absize){
				I += "|";
			}
			if(ln!=1 && ln!=absize){
				for(i=1 ; i<=size ; i++){
					I += " ";
				}
			}
			I += "\n";
		}
		return I;
	}
	
	//Letter T
	String T(int size){
		String T = "";
		int ln, absize, i, spa, mid;
		absize = 2*size+1;
		for(ln=1 ; ln<=absize ; ln++){
			if(ln!=1){
				for(i=1 ; i<=size ;i++){
					T += " ";
				}
			}
			if(ln==1){
				for(i=1 ; i<=absize ; i++){
					T += "-";
				}
			}
			else{
				T += "|";
			}
			if(ln!=1){
				for(i=1 ; i<size ;i++){
					T += " ";
				}
			}
			T += "\n";
		}
		return T;
	} 
	
	// MOHIT
	String com(int size){
		String c = "";
		int ln, i, absize, spa, mid, spa1, spa2;
		absize = 2*size+1;
		mid = size + 1;
		for(ln=1 ; ln<=absize ; ln++){
			// For M
			c += "|";//*1
			if(ln<=mid){
				spa1 = ln-2;
			}else{
				spa1 = 0;
			}
			for(i=1 ; i<=spa1 ; i++){
				c+=" ";
			}
			if(ln <= mid && ln != 1){//*2
				c += "\\";
			}
			if(ln<=mid){
				spa2 = 2*(size -ln) + 1;
			}else{
				spa2 = absize-2;
			}
			for(i=1 ; i<=spa2 ; i++){
				c+=" ";
			}
			if(ln < mid && ln != 1){//*3
				c += "/";
			}
			for(i=1 ; i<=spa1 ; i++){
				c+=" ";
			}
			c += "|\t";
			
			// For O
			c += "|";
			if(ln==1 || ln==absize){
				for(i=1 ; i<=absize-2 ; i++){
					c += "-";
				}
			}
			if(ln!=1 && ln!=absize){
				for(i=1 ; i<=absize-2 ; i++){
					c += " ";
				}
			}
			c += "|\t";
			
			//For H
			c += "|";
			if(ln==mid){
				for(i=1 ; i<=absize-2 ; i++){
					c += "-";
				}
			}
			if(ln!=mid){
				for(i=1 ; i<=absize-2 ; i++){
					c += " ";
				}
			}
			c += "|\t";
			
			//For I
			if(ln!=1 && ln!=absize){
				for(i=1 ; i<=size ; i++){
					c += " ";
				}
			}
			if(ln==1 || ln==absize){
				for(i=1 ; i<=absize ; i++){
					c += "-";
				}
			}
			if(ln!=1 && ln!=absize){
				c += "|";
			}
			if(ln!=1 && ln!=absize){
				for(i=1 ; i<=size ; i++){
					c += " ";
				}
			}
			c+="\t";
			
			//For T
			if(ln!=1){
				for(i=1 ; i<=size ;i++){
					c += " ";
				}
			}
			if(ln==1){
				for(i=1 ; i<=absize ; i++){
					c += "-";
				}
			}
			else{
				c += "|";
			}
			if(ln!=1){
				for(i=1 ; i<size ;i++){
					c += " ";
				}
			}
			c += "\n";
		}
		return c;
	}
}
