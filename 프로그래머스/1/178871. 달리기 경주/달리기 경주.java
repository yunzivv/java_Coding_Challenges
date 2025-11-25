import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < players.length; i++) map.put(players[i], i);
        
        for(String s : callings){
            int nth = map.get(s);
            
            players[nth] = players[nth - 1];
            players[nth - 1] = s;
            
            map.replace(players[nth], nth);
            map.replace(s, nth - 1);
        }

        return players;
    }
}