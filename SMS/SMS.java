/*
	Sample Input : 
		"Mohit_Khandale,IT,Regular,7875802434|Saket_Mungse,IT,Regular,9322155109|Yash_Shende,CSE,Regular,7744851210|Siddesh_Dhevale,EXTC,Regular,9561069920|Chandrakant_Raut,CSE,Regular,8010565378|Ayush_Gulhane,Civil,Regular,9665082890|Atharv_Muttepawar,IT,Regular,9975977422"
*/

import java.time.Year;

class SMS{
	
	//0-Mech, 1-civil, 2-CSE, 3-EXTC, 4-IT, 5-Instru, 6-Produ, 7-Chemi, 8-Textile, 9-Electrical, 10-19 DSY
	static int[] count = new int[20];	
	
	public static void main(String[] args){
		SMS obj = new SMS(args[0]);
		//System.out.println(Year.now().getValue());
		
	}
	
	SMS(String inp){
		String[] students = inp.split("\\|");
		int idNum = -1;
		String regNumber = "";
		for(String i : students){
			String[] stuData = i.split(",");
			idNum = regNo(stuData[1],stuData[2]);
			regNumber = createRegNo(idNum);
			System.out.print(String.format("%20s -> ",stuData[0]));
			System.out.print(regNumber+ "\t");
			regNumber = genEmail(regNumber);
			System.out.println(regNumber);
		}
		
	}
	
	String genEmail(String ab){
		return ab.toLowerCase()+"@sggs.ac.in";
	}
	
	String createRegNo(int ab){
		int d = 0;
		if(ab>9 && ab<20){
			d = 5;
		}
		String rollno = Year.now().getValue() + "B" + initial(ab) + d;
		if(++count[ab]<10){
			rollno += "0" + count[ab];
 		}else{
 			rollno += count[ab] + "";
 		}
		return rollno;
	}
	
	String initial(int ab){
		String[] set = {"ME","CE","CS","EC","IT","IN","PR","CH","TT","EL"};
		int a = ab%10;
		return set[a];
	}
	
	int regNo(String Branch, String Mode){
		int baseValue = -1;
		int year = Year.now().getValue();
		switch(Branch.toLowerCase()){
			case "mechanical" : baseValue = 0; break;
			case "civil" : baseValue = 1; break;
			case "cse" : baseValue = 2; break;
			case "extc" : baseValue = 3; break;
			case "it" : baseValue = 4; break;
			case "instrumentation" : baseValue = 5; break;
			case "production" : baseValue = 6; break;
			case "chemical" : baseValue = 7; break;
			case "textile" : baseValue = 8; break;
			case "electrical" : baseValue = 9; break;
			default : return -1;
			}
		return Mode.equalsIgnoreCase("DSY") ? baseValue + 10 : baseValue;
	}
}
