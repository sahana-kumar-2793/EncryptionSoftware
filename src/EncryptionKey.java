
public class EncryptionKey {
	private String alphabet[] = new String[27];
	private Integer encryptions[] = new Integer[27];
	public EncryptionKey() {
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
		int encryptionKey = (int)Math.abs(Math.random()*150);
		for (int i = 0; i < 27; i++){
			encryptionKey = (int)Math.abs(encryptionKey+(Math.random()*100));
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
}
	
	
	


