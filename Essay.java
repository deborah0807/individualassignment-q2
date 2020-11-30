public class Essay extends Grade {

	private double grammar;
	private double spelling;
	private double length;
	private double content;

	public void setScorekarangan()
	{
		setScore (grammar+spelling+length+content);
	}

	public void setGrammar (double g)
	{
		this.grammar = grammar;
	}

	public void setSpelling (double s)
	{
		this.spelling = spelling;
	}

	public void setLength (double l)
	{
		this.length = length;
	}

	public void setContent (double c)
	{
		this.content = content;
	}

	public double getGrammar ()
	{
		return grammar;
	}

	public double getSpelling ()
	{
		return spelling;
	}

	public double getLength ()
	{
		return length;
	}

	public double getContent ()
	{
		return content;
	}
}