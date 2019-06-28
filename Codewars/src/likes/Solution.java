package likes;

class Solution {
  
	public static void main(String[] args) {
		whoLikesIt("Peter", "Mama", "Erich");
	}
	
	public static String whoLikesIt(String... names) {
		String res ="";
        	switch(names.length) {
        	case 0: res = "no one likes this";
        	break;
        	case 1: res = names[0]+" likes this";
        	break;
        	case 2: res = names[0]+" and "+names[1]+" like this";
        	break;
        	case 3: res = names[0]+", "+names[1]+" and "+names[2]+" like this";
        	break;
        	default: res = names[0]+", "+names[1]+" and "+(names.length-2)+" others like this";
        	}
		return res;
    }
}
