package y16m10d11;

class IndexOfTest{

	static int indexOf(String charac,String input){
		for(int i = 0;i < input.length();i++){
			if(String.valueOf(input.charAt(i)).equals(charac)){
				return i;
			}
		}
		return -1; 
	}

	static int indexOf(String charac,String input,int from){
		for(int i = 0;i < input.length();i++){
			if(i > from){
				if(String.valueOf(input.charAt(i)).equals(charac)){
					return i;
				}
			}
		}
		return -1; 
	}
	
	public static void main(String[] args) {
		String testS = "sajta";
		System.out.println(IndexOfTest.indexOf("a", testS));
		System.out.println(IndexOfTest.indexOf("a", testS,3));
	}
}

