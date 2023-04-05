
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javax.swing.JOptionPane;


public class TestController {
	
	private Game g;
	
	final int POINTSFORCORR = 10;
	final int POINTSFORINCORR = -5;
	
	@FXML
    private RadioButton button1;// answer1 button
	
	@FXML
	private RadioButton button2;// answer2 button

	@FXML
	private RadioButton button3;// answer3 button

	@FXML
	private RadioButton button4;// answer4 button
	
	@FXML
	private Button exit;// exit button

    @FXML
    private ToggleGroup answer;

    @FXML
    private Text ques;// the question
    
    @FXML
    private Text option1;// answer 1

    @FXML
    private Text option2;// answer 2

    @FXML
    private Text option3;// answer 3

    @FXML
    private Text option4;// answer 4

    @FXML
   // Exit the game
    void pressedExit(ActionEvent event) {
    	gameOver();
    }

    @FXML
  // Starting a new game
    void pressedNewGame(ActionEvent event) {
    	exit.setVisible(true);
    	button1.setVisible(true);
    	button2.setVisible(true);
    	button3.setVisible(true);
    	button4.setVisible(true);
    	button1.setSelected(false);
    	button2.setSelected(false);
    	button3.setSelected(false);
    	button4.setSelected(false);
    	initialize();
    }

    @FXML
 // the user chosed option1, this function show a message to the user according to the correctness of the answer
    void pressedOnOp1(ActionEvent event) {
    	
    	if(g.getQuesList().get(g.getCurrentQuesIn()).getCorrectAnsIndex() == 1 ) {
    		g.setScore(g.getScore() + POINTSFORCORR);
    		JOptionPane.showMessageDialog(null,"Your answer is Correct :) , The current winning is: " + g.getScore());
    	}
    	else {
    		g.setScore(g.getScore() + POINTSFORINCORR);
    		JOptionPane.showMessageDialog(null,"Your answer is Incorrect :( , The current winning is: " + g.getScore());
    	}
    	button1.setSelected(false);
    	g.getQuesList().remove(g.getCurrentQuesIn());
    	if(g.getQuesList().size() == 0){//Game Over
    		gameOver();
    	}
    	else {
    	    nextQues();
    	}
    }

    @FXML
 // the user chosed option2, this function show a message to the user according to the correctness of the answer
    void pressedOnOp2(ActionEvent event) {
    	
    	if(g.getQuesList().get(g.getCurrentQuesIn()).getCorrectAnsIndex() == 2 ) {
    		g.setScore(g.getScore() + POINTSFORCORR);
    		JOptionPane.showMessageDialog(null,"Your answer is Correct :) , The current winning is: " + g.getScore());
    	}
    	else {
    		g.setScore(g.getScore() + POINTSFORINCORR);
    		JOptionPane.showMessageDialog(null,"Your answer is Incorrect :( , The current winning is: " + g.getScore());
    	}
    	button2.setSelected(false);
    	g.getQuesList().remove(g.getCurrentQuesIn());
    	if(g.getQuesList().size() == 0){//Game Over
    		gameOver();
    	}
    	else {
    	    nextQues();
    	}
    }

    @FXML
 // the user chosed option3, this function show a message to the user according to the correctness of the answer
    void pressedOnOp3(ActionEvent event) {
    	
    	if(g.getQuesList().get(g.getCurrentQuesIn()).getCorrectAnsIndex() == 3 ) {
    		g.setScore(g.getScore() + POINTSFORCORR);
    		JOptionPane.showMessageDialog(null,"Your answer is Correct :) , The current winning is: " + g.getScore());
    	}
    	else {
    		g.setScore(g.getScore() + POINTSFORINCORR);
    		JOptionPane.showMessageDialog(null,"Your answer is Incorrect :( , The current winning is: " + g.getScore());
    	}
    	button3.setSelected(false);
    	g.getQuesList().remove(g.getCurrentQuesIn());
    	if(g.getQuesList().size() == 0){//Game Over
    		gameOver();
    	}
    	else {
    	    nextQues();
    	}
    	
    }

    @FXML
 // the user chosed option4, this function show a message to the user according to the correctness of the answer
    void pressedOnOp4(ActionEvent event) {
    	
    	if(g.getQuesList().get(g.getCurrentQuesIn()).getCorrectAnsIndex() == 4 ) {
    		g.setScore(g.getScore() + POINTSFORCORR);
    		JOptionPane.showMessageDialog(null,"Your answer is Correct :) , The current winning is: " + g.getScore());
    	}
    	else {
    		g.setScore(g.getScore() + POINTSFORINCORR);
    		JOptionPane.showMessageDialog(null,"Your answer is Incorrect :( , The current winning is: " + g.getScore());
    	}
    	g.getQuesList().remove(g.getCurrentQuesIn());
    	button4.setSelected(false);
    	if(g.getQuesList().size() == 0){//Game Over
    		gameOver();
    	}
    	else {
    	    nextQues();
    	}
    	
    }
    
    @FXML
  //initialize the game , constructing a game object that contain a questions list , and chooseing random question to show
    public void initialize(){
    	ques.setFill(Color.BLACK);
    	g = new Game();
    	int index =g.getCurrentQuesIn();
    	ques.setText(g.getQuesList().get(index).getQuestion());
    	initOptions(g , index);

    }
    
 // choosing new question from the list
    private void nextQues() {
    	g.setCurrentQuesIn();
    	int index =g.getCurrentQuesIn();
    	ques.setText(g.getQuesList().get(index).getQuestion());
    	initOptions(g , index);
    	
    }
   
 // initializing the options according to answer's indexs
    private void initOptions(Game g , int index){
    	Text txt = option1;
    	
    	int i = g.getQuesList().get(index).getCorrectAnsIndex();
        txt = optioNum(i);
    	txt.setText(g.getQuesList().get(index).getCorrectAns());
    	
    	i = g.getQuesList().get(index).getAns2Index();
    	txt = optioNum(i);
    	txt.setText(g.getQuesList().get(index).getAns2());
    	
    	i = g.getQuesList().get(index).getAns3Index();
    	txt = optioNum(i);
    	txt.setText(g.getQuesList().get(index).getAns3());
    	
    	i = g.getQuesList().get(index).getAns4Index();
    	txt = optioNum(i);
    	txt.setText(g.getQuesList().get(index).getAns4());
    	
    }
    
  //this function return the appropriate option according to i
    private Text optioNum(int i){
    	Text txt = null;
    	if(i == 1)  return option1;
    	if(i == 2) return option2;
    	if(i == 3) return option3;
    	if(i == 4) return option4;
    	return txt;
    }
    
    
 // game over , this function presents the score and the button of starting new game
    private void gameOver(){
    	ques.setText("Your Score : " + g.getScore());
    	ques.setFill(Color.GREEN);
    	option1.setText(null);
    	option2.setText(null);
    	option3.setText(null);
    	option4.setText(null);
    	exit.setVisible(false);
    	button1.setVisible(false);
    	button2.setVisible(false);
    	button3.setVisible(false);
    	button4.setVisible(false);
    	
    	
    }

}
