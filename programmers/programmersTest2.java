package programmers;

public class programmersTest2 {
	public static void main(String[] args) {
		programmersTest2 test2 = new programmersTest2();
		int[] common= {2,4,8,16};
		int sout =  test2.solution(common);
		
		System.out.println(sout);
	}
	public int solution(int[] common) {
        int answer = 0;
        int divide = 0;
        int add = 0;
        int count = 0;
        for(int i = 0; i < common.length ; i++) {
        	if(common.length-1 == i) {
        		count++;
        		continue;
        	}
        	divide = common[i+1]%common[i];
            if(divide != 0) {
                add = divide;
                answer = common[common.length - 1] + add;
                break;
            }
            count++;
        }
        if(count == common.length) {
            add = common[2]/common[1];
            answer = common[common.length - 1] * add;
        }
        return answer;
    }
}
