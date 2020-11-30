import java.util.Scanner;

public class Driver {
	public static void main (String [] args) {

	double grammar;
	double spelling;
	double length;
	double content;
	double mark;
	double passf;
	double finals;

	Scanner input = new Scanner (System.in);

	Essay p = new Essay();

	System.out.println ("Please enter your grade for Grammar (Maximum points is 30 points) : ");
	grammar = input.nextDouble();
	System.out.println ("Please enter your grade for Spelling (Maximum points is 20 points) : ");
	spelling = input.nextDouble();
	System.out.println ("Please enter your grade for Correct Length (Maximum points is 20 points) : ");
	length = input.nextDouble();
	System.out.println ("Please enter your grade for Content (Maximum points is 30 points) : ");
	content = input.nextDouble();
	System.out.println ("Please enter your score for Lab Activity (Maximum points is 100 points) : ");
	mark = input.nextDouble();
	System.out.println ("Please enter how many questions that you got the right answer (out of 10 questions) :");
	passf = input.nextDouble();
	System.out.println ("Please enter how many questions that you got the right answer for your final exam (out of 50 questions) :");
	finals = input.nextDouble();
	System.out.println ("Your marks for Essay is : " + (grammar + spelling + length + content));
	System.out.println ("Your marks for Essay is : " + mark);
	}
}