import java.util.Scanner;
public class NumbersToWords {

	public static void main(String[] args) {
		Scanner Inputnum = new Scanner(System.in);
		System.out.print("Input numbers from 1-10000: ");
		double n = Inputnum.nextDouble();
		Inputnum.close();
		
		int temp = (int)n;
		
		double tenth = temp/10000;
		double thousands=(temp/1000)%10;		
		double hundreds=((temp/100)%100)%10;
		double tens=(temp/10)%10;
		double ones=temp%10;
		int tenth1 = (int) tenth;
		int thousands1 = (int) thousands;
		int hundreds1 = (int) hundreds;
		int tens1 = (int) tens;
		int ones1 = (int) ones;
		
		
		
		if((n > 10000) || (n<=0))  {
		 
		System.out.print("invalid input");
		}
		
		else {
		switch (tenth1) {
		case 1:System.out.print(" ten thousand ");break;
		}
		switch (thousands1) {
		case 1:System.out.print(" one thousand ");break;
		case 2:System.out.print(" two thousand ");break;
		case 3:System.out.print(" three thousand ");break;
		case 4:System.out.print(" four thousand ");break;
		case 5:System.out.print(" five thousand ");break;
		case 6:System.out.print(" six thousand ");break;
		case 7:System.out.print(" seven thousand ");break;
		case 8:System.out.print(" eight thousand ");break;
		case 9:System.out.print(" nine thousand ");break;
		}
		switch (hundreds1) {
		case 1:System.out.print(" one hundred ");break;
		case 2:System.out.print(" two hundred ");break;
		case 3:System.out.print(" three hundred ");break;
		case 4:System.out.print(" four hundred ");break;
		case 5:System.out.print(" five hundred ");break;
		case 6:System.out.print(" six hundred ");break;
		case 7:System.out.print(" seven hundred ");break;
		case 8:System.out.print(" eight hundred ");break;
		case 9:System.out.print(" nine hundred ");break;
		}
		if ((tens1 == 1) && (ones1 >= 1)) {
		switch (ones1){
		case 1:System.out.print("Eleven ");break;
		case 2:System.out.print("Twelve ");break;
		case 3:System.out.print("Thirteen ");break;
		case 4:System.out.print	("Fourteen ");break;
		case 5:System.out.print ("Fifteen ");break;	
		case 6:System.out.print	("Sixteen ");break;
		case 7:System.out.print("Seventeen ");break;
		case 8:System.out.print	("Eighteen ");break;
		case 9:System.out.print	("Nineteen ");break;
		}
		}
		else {
		if(tens1 >= 1) {
		switch (tens1) {
		case 1:System.out.print(" ten ");break;
		case 2:System.out.print(" twenty  ");break;
		case 3:System.out.print(" thirty ");break;
		case 4:System.out.print(" fourty ");break;
		case 5:System.out.print(" fifty ");break;
		case 6:System.out.print(" sixty  ");break;
		case 7:System.out.print(" seventy  ");break;
		case 8:System.out.print(" eighty  ");break;
		case 9:System.out.print(" ninety  ");break;
		}
		}
		}
		if(( (n<=10) || (ones1>=1) &&(thousands1 >= 1) &&  (hundreds1>=1)&&(tens==0) ||(ones1>=1) && (tens1 >= 2) ) || (tens1==0) ){
		switch (ones1){
		case 1:System.out.print("one ");break;
		case 2:System.out.print("Two ");break;
		case 3:System.out.print("Three ");break;
		case 4:System.out.print("Four ");break;
		case 5:System.out.print("Five ");break;
		case 6:System.out.print("Six ");break;
		case 7:System.out.print("Seven ");break;
		case 8:System.out.print("Eight ");break;
		case 9:System.out.print("Nine ");break;
	   	}	
		}
}
}
}


		
