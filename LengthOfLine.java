package day3_PracticeProblems;

public class LengthOfLine {

	
	public static double lengthOfTheLine(double x1, double x2, double y1, double y2) {
		return Math.sqrt((y2-y1) * (y2-y1) + (x2-x1) * (x2-x1));  //Formula for Length of the Line 
	}
	public static void main(String[] args){
		LengthOfLine Obj = new LengthOfLine();
		
		System.out.println(Obj.lengthOfTheLine(3, 4, 7, 1));
	}

}
