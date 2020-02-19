package algo;

public class Cipher {
	
	/**
     * @param sentence, eg : "tacos"
     * @param shift,    eg : 3
     * @return encrypted sentence, eg : "wdfrv"
     */
    public static String caesar(String sentence, int shift) {

    	String encrypted = "";
    	char abc;
    	
    	for(int i = 0; i < sentence.length(); i++) {
    		abc = sentence.charAt(i);
    		
    		if(abc >= 'a' && abc <= 'z') {
    			abc = (char) (abc + shift);
    			if(abc > 'z') {
    				abc = (char) (abc+'a'-'z'-1);
    			}
    			if(abc < 'a') {
    				abc = (char) (abc-'a'+'z'+1);
    			}
    		encrypted = encrypted + abc;
    		}
    	}
    	return encrypted;
    }
}
