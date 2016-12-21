
public class EncryptionKey {
	private String alphabet[] = new String[27];
	private Integer encryptions[] = new Integer[27];
	private int decryptionCode;
	public EncryptionKey(int code) {
		alphabet[0] = "Aa";
		alphabet[1] = "Bb";
		alphabet[2] = "Cc";
		alphabet[3] = "Dd";
		alphabet[4] = "Ee";
		alphabet[5] = "Ff";
		alphabet[6] = "Gg";
		alphabet[7] = "Hh";
		alphabet[8] = "Ii";
		alphabet[9] = "Jj";
		alphabet[10] = "Kk";
		alphabet[11] = "Ll";
		alphabet[12] = "Mm";
		alphabet[13] = "Nn";
		alphabet[14] = "Oo";
		alphabet[15] = "Pp";
		alphabet[16] = "Qq";
		alphabet[17] = "Rr";
		alphabet[18] = "Ss";
		alphabet[19] = "Tt";
		alphabet[20] = "Uu";
		alphabet[21] = "Vv";
		alphabet[22] = "Ww";
		alphabet[23] = "Xx";
		alphabet[24] = "Yy";
		alphabet[25] = "Zz";
		alphabet[26] = " ";
		
		decryptionCode = code;
		
		int encryptionKey = decryptionCode;
		for (int i = 0; i < 27; i++){
			encryptionKey = (int)Math.abs(((((encryptionKey+5)*1275)/1170)-65)+92);
			encryptions[i] = encryptionKey;
			for (int k = 0; k<i; k++){
				if (encryptionKey == encryptions[k]){
					i--;
				}
			}
		}
		
	}
	
	public Integer[] getEncryptions() {
		return encryptions;
	}
	public String[] getAlphabet(){
		return alphabet;
	}
	public int getDecryptionCode(){
		return decryptionCode;
	}
	public String[] getLowercaseLetters(){
		String[] lowercase = new String[27];
		lowercase[0] = "a";
		lowercase[1] = "b";
		lowercase[2] = "c";
		lowercase[3] = "d";
		lowercase[4] = "e";
		lowercase[5] = "f";
		lowercase[6] = "g";
		lowercase[7] = "h";
		lowercase[8] = "i";
		lowercase[9] = "j";
		lowercase[10] = "k";
		lowercase[11] = "l";
		lowercase[12] = "m";
		lowercase[13] = "n";
		lowercase[14] = "o";
		lowercase[15] = "p";
		lowercase[16] = "q";
		lowercase[17] = "r";
		lowercase[18] = "s";
		lowercase[19] = "t";
		lowercase[20] = "u";
		lowercase[21] = "v";
		lowercase[22] = "w";
		lowercase[23] = "x";
		lowercase[24] = "y";
		lowercase[25] = "z";
		lowercase[26] = " ";
		return lowercase;
	}
}
	
	
	


