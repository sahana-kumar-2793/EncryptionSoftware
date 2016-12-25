/**
 * @author Sahana Kumar
 */

import javax.swing.JOptionPane;

public class Decryption {
public static void main(String[] args) {
	String encryption = JOptionPane.showInputDialog(null, "What is the message you want decrypted?");
	String decryptionPasscode = JOptionPane.showInputDialog(null, "Please provide the correct decryption code for this message. Your decryption will be incorrect if the code is not provided.");
	int decryptionCode = Integer.parseInt(decryptionPasscode);
	EncryptionKey getLetters = new EncryptionKey(1);
	String letters [] = getLetters.getLowercaseLetters();
	Integer encryptions[] = new Integer[27];
	
	for (int i = 0; i < 27; i++){
		decryptionCode = (int)Math.abs(((((decryptionCode+5)*1275)/1170)-65)+92);
		encryptions[i] = decryptionCode;
		for (int k = 0; k<i; k++){
			if (decryptionCode == encryptions[k]){
				i--;
			}
		}
	}
	//gets encryption codes for each letter ^^
	
	String [] encryptedMessage = encryption.split("-");
	for (int i = 0; i < encryptedMessage.length; i++){
		int currEncryption = Integer.parseInt(encryptedMessage[i]);
		int currIndex = -1;
		for (int k = 0; k < 27; k++){
			if (currEncryption == encryptions[k]){
				currIndex = k;
				break;
			}
		}
		if (currIndex == -1){
			JOptionPane.showMessageDialog(null, "Invalid Decryption code. Please try again.");
			break;
		}
		encryptedMessage[i] = letters[currIndex];
	}
	String decrypted = "";
	for (int i = 0; i < encryptedMessage.length; i++){
		decrypted += encryptedMessage[i];
	}
	System.out.println("Message: " + decrypted);
	JOptionPane.showMessageDialog(null, "Decrypted Message: " + decrypted);
}
}
