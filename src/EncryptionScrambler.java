import javax.swing.JOptionPane;

public class EncryptionScrambler {
public static void main(String[] args) {
	
	String input = JOptionPane.showInputDialog(null, "Input the String you wish to encrypt."); 
	String[] allLetters = input.split("");
	String [] rowOne = new String[(input.length()/3)+1];
	String [] rowTwo = new String[(input.length()/3)+1];
	String [] rowThree = new String[(input.length()/3)+1];
	String output = "";
	for (int i = 0; i<allLetters.length; i+=3){
		int counter = 0;
		rowOne[counter] = allLetters[i];
		output += rowOne[counter];
		counter++;
	}
	for (int i = 1; i<allLetters.length; i+=3){
		int counter = 0;
		rowTwo[counter] = allLetters[i];
		output+=rowTwo[counter];
		counter++;
	}
	for (int i = 2; i<allLetters.length; i+=3){
		int counter = 0;
		rowThree[counter] = allLetters[i];
		output += rowThree[counter];
		counter++;
	}
	for (int i = 0; i<rowOne.length; i++){
		if (rowOne[i] != null){
			output += rowOne[i];
		}
	}
	for (int i = 0; i<rowTwo.length; i++){
		if (rowTwo[i] != null){
			output += rowTwo[i];
		}
	}
	for (int i = 0; i<rowThree.length; i++){
		if (rowThree[i] != null){
			output += rowThree[i];
		}
	}
	System.out.println(output);
}
}
