package algo;

public class Cipher {

	 public static void main(String[] args) {
		 
		String sentence = "zebra";
		int shift = 2;
		System.out.println(sentence + " => " + caesar(sentence, shift));
	}
	
	
	/**
     * @param sentence, eg : "tacos"
     * @param shift,    eg : 3
     * @return encrypted sentence, eg : "wdfrv"
     */
    public static String caesar(String sentence, int shift) {

    	String result = "";
    	for (int position=0; position < sentence.length(); position++) {
    		int shiftedValue = sentence.charAt(position) + shift;
    		if (shiftedValue > 'z') {
    			shiftedValue = shiftedValue - 'z' + 'a' - 1; 
    		} else if (shiftedValue < 'a') {
    			shiftedValue = shiftedValue + 'z' - 'a' +1;     			
    		}
    		result += (char) shiftedValue;
    		
    		System.out.println(sentence.charAt(position) + " => " + (char) shiftedValue);
    	}
        return result;
    }
}
