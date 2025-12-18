import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        
        if(cacheSize == 0) return cities.length * 5;
        
        int answer = 0;
        int index = 0;
        List<String> cache = new ArrayList<>();
        
        for(String city : cities){
            city = city.toLowerCase();
            
            if(cache.contains(city)) {
                cache.remove(city);
                answer++;
            } else {
                if(cache.size() == cacheSize) cache.remove(0);
                answer += 5;
            }
            
            cache.add(city);
        }
        
        return answer;
    }
}