import java.util.*;
import java.util.Arrays;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        List<Integer> list = new ArrayList<>();
        int todayInt = Integer.parseInt(today.replace(".", ""));
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(String s : terms) map.put(s.charAt(0), Integer.parseInt(s.substring(2)));
        
        for(int i = 0; i < privacies.length; i++){

            int[] arr = Arrays.stream(privacies[i].substring(0, 10).split("\\."))
                .mapToInt(Integer::parseInt)
                .toArray();
            
            // 유효기간
            arr[1] += map.get(privacies[i].charAt(11));
            
            // 다음 년도
            if(arr[1] > 12){
                arr[0] += arr[1] / 12;
                arr[1] %= 12;
                if(arr[1] == 0){
                    arr[0]--;
                    arr[1] = 12;
                }
            }
            
            // 오늘과 비교
            if(arr[0] * 10000 + arr[1] * 100 + arr[2] <= todayInt) {
                list.add(i + 1);
            }
        }
        
        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}