import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        
        if(cacheSize == 0) return cities.length * 5;
        
        int answer = 0;
        int index = 0;
        LinkedHashSet<String> cache = new LinkedHashSet<>();
        
        for(String city : cities){
            city = city.toLowerCase();
            
            if(cache.contains(city)) {
                cache.remove(city);
                answer++;
            } else {
                if(cache.size() == cacheSize){
                    Iterator<String> it = cache.iterator();
                    if (it.hasNext()) {
                        it.next();
                        it.remove();
                    }
                }
                answer += 5;
            }
            
            cache.add(city);
        }
        
        return answer;
    }
}