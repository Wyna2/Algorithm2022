package programmers;

public class Lv0최빈값구하기 {
	
	public static void main(String[] args) {
		int result = 0;
		
		int[] array = {1, 2, 5, 5, 5, 4};
		
		int[] arr = new int[array.length];
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array.length; j++) {
                if(array[i]==array[j])
                    arr[i]++;
            }
        }
        
        
        int max = 0, search = 0, seidx = 0;
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }
        for(int num : arr) {
        	if(num == max) {
        		search++;
        		seidx = num;
        	}
        }
        
        if(search>max)
        	result = -1;
        else if(search == max)
        	result = array[seidx];
        
        
        
        String aw1 = "", aw2 = "";
        for(int i=0; i<array.length; i++) {
        	aw1 += array[i]+", ";
        	aw2 += arr[i]+", ";
        }
		
        System.out.println(aw1);
        System.out.println(aw2);
        System.out.println(result);
	}

}
