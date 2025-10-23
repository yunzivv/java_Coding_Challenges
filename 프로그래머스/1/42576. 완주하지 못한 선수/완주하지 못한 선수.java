import java.util.*;

class Solution {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> playerMap = new HashMap<>();

        for (String player : participant) {
            playerMap.merge(player, 1, Integer::sum);
        }

        for (String player : completion) {
            playerMap.merge(player, -1, Integer::sum);
            if (playerMap.get(player) == 0) playerMap.remove(player);
        }
        
        return playerMap.keySet().stream().findFirst().get();
    }

}