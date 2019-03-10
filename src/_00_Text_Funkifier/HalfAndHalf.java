package _00_Text_Funkifier;

public class HalfAndHalf extends SpecialString {

	public HalfAndHalf(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String word = "";
		String word2 = "";
		int half = s.length() / 2;
		for (int i = 0; i < s.length() / 2; i++) {
			word += s.charAt(i);
		}
		for (int i = s.length() / 2; i < s.length(); i++) {
			word2 += s.charAt(i);
		}
		word = word.toLowerCase();
		word2 = word2.toUpperCase();
		String newWord = word + word2;
		System.out.println(newWord);
		return newWord;
	}

}
