package programmers;

public class programmersTest {
	public static void main(String[] args) {
		programmersTest test = new programmersTest();
		String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		int result = test.solution(babbling);
		
		System.out.println(result);
	}
	
	
	public int solution(String[] babbling) {
        int answer = 0;
        String[] mama = {"aya","ye","woo","ma"};
        String result = "";
        for(int i = 0; i < babbling.length ; i++) {
            for(int j = 0 ; j < mama.length ; j++) {
                if(babbling[i].contains(mama[j])) {
                    babbling[i] = babbling[i].replaceAll(mama[j],"0");
                    result = babbling[i];
                    if(result.replaceAll("0", "").length() == 0) {
                        answer++;
                    }
                }
            }
        } 
        return answer;
    }
	 
}

