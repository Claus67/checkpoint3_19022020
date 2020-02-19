package algo;

public class Cipher {

    /**
     * @param sentence, eg : "tacos"
     * @param shift,    eg : 3
     * @return encrypted sentence, eg : "wdfrv"
     */
    public static String caesar(String sentence, int shift) {
    	System.out.println("Sentence: " + sentence + ", shift: " + shift);
    	sentence.toLowerCase();
    	String alphabet = "abcdefghijklmnopqrstuvwxyz";
    	String resultString = "";
    	Character tmpChr;
    	int charPointer = 0;
    	for (int i = 0; i < sentence.length(); i++) {
    		tmpChr = sentence.charAt(i);
			charPointer = alphabet.indexOf(tmpChr);
			System.out.println("Character: " + tmpChr + " ,Pointer: " + charPointer);
			if (charPointer + shift < 0) charPointer += 26;
			resultString += alphabet.charAt((shift + charPointer) % 26);
		}
    	System.out.println("Result: " +resultString);
        return resultString;
    }
}
