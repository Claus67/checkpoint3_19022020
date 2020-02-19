package algo;


public class Cipher {

    /**
     * @param sentence, eg : "tacos"
     * @param shift,    eg : 3
     * @return encrypted sentence, eg : "wdfrv"
     */
    public static String caesar(String sentence, int shift) {
    	
    	String result = "";
    	for (int i=0; i<sentence.length(); i++) {
    		char zeichen = sentence.charAt(i);
    		zeichen += shift;
    		if ((int)zeichen < 97) {
    			zeichen = (char)(123-(97-(int)zeichen));
    		}
    		if ((int)zeichen > 122) {
    			zeichen = (char)(96+(int)zeichen-122);
    		}
    		result = result + zeichen;
    	}
        return result;
    }
}
