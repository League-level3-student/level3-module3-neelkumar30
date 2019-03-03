package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String word = "";
		String word2 = "";
		for (int i = 0; i < s.length()-1; i++) {
			if(i%2 ==0) {
				word+= s.charAt(i);
			}
		}
		for (int i = 0; i < s.length()-1; i++) {
			if(i%2 !=0) {
				word2+= s.charAt(i);
			}
		}
		word.toLowerCase();
		word2.toUpperCase();
		String newWord = "";
		for (int i = 0; i < s.length()-1; i++) {
			if(i%2 == 0) {
				newWord += word.charAt(i/2);
			}
			else {
				newWord += word2.charAt(i/2);
			}
		}
		System.out.println(newWord);
		return newWord;
	}

}
