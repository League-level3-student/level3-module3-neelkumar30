package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		int lastIndex = s.length()-1;
		String word;
		word = "";
		for (int i = s.length()-1; i>-1; i--) {
		word = word + s.charAt(i);
		}
		return word;
	}

}

