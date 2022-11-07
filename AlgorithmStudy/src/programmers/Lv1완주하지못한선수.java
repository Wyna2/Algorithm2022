package programmers;

import java.util.Arrays;

class Lv1완주하지못한선수 {

    public static String solution(String[] participant, String[] completion) {
	        String answer = "";
	        
	        Arrays.sort(participant);
	        Arrays.sort(completion);
	        	        
	        for(int i=0; i<completion.length; i++){
	            System.out.println("part "+i+" : "+participant[i]);
	            System.out.println("comp "+i+" : "+completion[i]);
	        	if(participant[i]!=completion[i])
	                answer=participant[i];
	            else
	                answer=participant[i+1];
	        }
	        
	        return answer;
	}
	
	
	public static void main(String[] args) {
		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion = { "josipa", "filipa", "marina", "nikola" };
		
		System.out.println(Lv1완주하지못한선수.solution(participant, completion));
	}

}
