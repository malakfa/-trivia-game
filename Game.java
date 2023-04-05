import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {// 
	private int score;
	private ArrayList<Question> quesList;
	private int currentQuesIn;
	
	// Game constructor
	public Game(){
		this.score = 0;
		this.quesList = generateList();
		Random rnd = new Random();
		currentQuesIn = rnd.nextInt(quesList.size());
	}
	
	//get current question Index
	public int getCurrentQuesIn(){
		return currentQuesIn;
	}
	
	//set current question Index
	public void setCurrentQuesIn(){ 
		Random rnd = new Random();
		currentQuesIn = rnd.nextInt(quesList.size());
	}
	
	// get the score
	public int getScore() {
		return score;
	}
	
	// set score 
	public void setScore(int score) {
		this.score = score;
	}
	
	// get Questions list
	public ArrayList<Question> getQuesList() {
		return quesList;
	}
	
	// set questions list - after removing the current chosen question
	public void setQuesList(ArrayList<Question> quesList) {
		this.quesList = quesList;
	}
	
	// constructing a list from the questions in the file trivia.txt
	private ArrayList<Question> generateList(){
		ArrayList<Question> list = new ArrayList<Question>();
		try {
			Scanner input = new Scanner(new File("trivia.txt"));
			while (input.hasNextLine()) {
				list.add(new Question(input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
