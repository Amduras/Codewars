package PigLatin;

public class PigLatin {

	public static void main(String[] args) {
		String test = pigIt("Pig latin !");
		System.out.println(test);
	}

	public static String pigIt(String str) {
//		return str.replaceAll("(\\w)(\\w*)", "$2$1ay"); //lösung aus forum
		String res = "";
		
		for(String word: str.split(" ")) {
			if(word.matches("[a-zA-Z]*")) {
				final char[] neu = new char[word.length()];
				for(int i = 0; i <= word.length()-1; ++i) {
					neu[i] = word.charAt((i + 1) % word.length());
				}
				if(res != "") {
					res+=" ";
				}
				
				String n = new String(neu);
				n+="ay";
				res += n;
			} else {
				res+=word;
			}
		}
		return res;
	}
}
