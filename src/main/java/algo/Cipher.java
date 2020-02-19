package algo;

public class Cipher {

    /**
     * @param sentence, eg : "tacos"
     * @param shift,    eg : 3
     * @return encrypted sentence, eg : "wdfrv"
     */
    public static String caesar(String sentence, int shift) {
    	
    	String ciphered = "";
    	for (int i = 0; i < sentence.length(); i++) {
    		char c = (char) (sentence.charAt(i) + shift);
    		if (c > 122) {
    			c -= 26;
    		} 
    		if (c < 97) {
    			c += 26;
    		}
    		ciphered += Character.toString(c);
    	}
        return ciphered;
    }
}
