import javax.swing.JOptionPane;

public class Encryption {
	
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog(null, "Input the String you wish to encrypt."); 
	EncryptionKey currentEncryption = new EncryptionKey();
	String[] letters = currentEncryption.getAlphabet();
	Integer[] encryptionKey = currentEncryption.getEncryptions();
	
	String[] inputLetters = new String[input.length()];
	for (int i = 0; i < input.length(); i++){
		inputLetters[i] = input.substring(i, i+1);
	}
	
	Integer[] encryptionInput = new Integer[input.length()];
	for (int i = 0; i < input.length(); i++){
		int currIndex = -1;
		for (int k = 0; k < 27; k++){
			if (letters[k].indexOf(inputLetters[i])!= -1){
				currIndex = k;
				break;
			}
				
		}
		System.out.println(currIndex);
		encryptionInput[i] = encryptionKey[currIndex];
	}
	String output = "";
	for (int i = 0; i < encryptionInput.length ; i++){
		if (i != encryptionInput.length - 1){
			output += encryptionInput[i] + "-";
		}
		if (i == encryptionInput.length -1){
			output += encryptionInput[i];
		}
	}
	System.out.println(output);
}

}
