
public class Question {
	private String question;
	private String correctAns;
	private String ans2;
	private String ans3;
	private String ans4;
	private int correctAnsIndex;
	private int ans2Index;
	private int ans3Index;
	private int ans4Index;

	// Question constructor
	public Question( String question , String correctAns, String ans2, String ans3, String ans4){
		this.question = question;
		this.correctAns = correctAns;
		this.ans2 = ans2;
		this.ans3 = ans3;
		this.ans4 = ans4;
		PlaceTheAnswers();
	}
	
	// Get the index of the correct answer
	public int getCorrectAnsIndex() {
		return correctAnsIndex;
	}

	// get the Index of answer2
	public int getAns2Index() { 
		return ans2Index;
	}

	// get the Index of answer3
	public int getAns3Index() {
		return ans3Index;
	}

	// get the Index of answer4 
	public int getAns4Index() {
		return ans4Index;
	}

	//get the question
	public String getQuestion() {
		return question;
	}
	
	// get answer1
	public String getCorrectAns() {
		return correctAns;
	}

	// get answer2
	public String getAns2() {
		return ans2;
	}

	// get answer3
	public String getAns3() {
		return ans3;
	}

	// get answer4
	public String getAns4() {
		return ans4;
	}
	
	// place the answers in a random way
	private void PlaceTheAnswers() {
		String randomNum = "";
		int i = 0;
		int rand;
		while(i < 4) {
			rand = (int)(Math.random()*4) + 1;
			if (!(randomNum.contains(""+rand)))	{
				randomNum += rand;
				i++;
			}
		  }	
		correctAnsIndex = Integer.parseInt( ""+(randomNum.charAt(0)));
		ans2Index = Integer.parseInt( ""+(randomNum.charAt(1)));
		ans3Index = Integer.parseInt( ""+(randomNum.charAt(2)));
		ans4Index = Integer.parseInt( ""+(randomNum.charAt(3)));
	}


	
}
