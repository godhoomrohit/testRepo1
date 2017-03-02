public class StringHasUniqueCharacters {

	private static boolean isUnique(String str){
		
		if(str.length() > 128){
			return false;
		}
		
		boolean[] char_set = new boolean[128];
		
		for(int i = 0; i < str.length(); i++){
			int charAtI = str.charAt(i);
			if(char_set[charAtI]){
				return false;
			}
			char_set[charAtI] = true;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isUnique("itsunqe"));
		System.out.println(isUnique("itsunque"));
	}

}
