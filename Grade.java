public class Grade {
	private double score;

	public void setScore (double score) 
	{
		this.score = score;
	}
	public double getScore()
	{
		return score;
	}
	public char getGrade; 
	{
		char theGrade;

		if (score >=90) theGrade = 'A';
		
		else if (score >= 80) theGrade ='B';
		
		else if (score >= 70) theGrade ='C';
		
		else if (score >= 60) theGrade ='D';
		
		else theGrade ='F';

	}

}