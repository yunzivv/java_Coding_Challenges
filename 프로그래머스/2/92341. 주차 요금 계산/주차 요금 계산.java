import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, String> logs = new HashMap<>();
        Map<String, Integer> used = new HashMap<>();

        for(String r : records){
            String[] log = r.split(" ");

            if(log[2].charAt(0) == 'I'){
                logs.put(log[1], log[0]);
            } else {
                String in = logs.get(log[1]);

                int fee = usage(log[0], in);
                if(used.get(log[1]) != null){
                    used.put(log[1], used.get(log[1]) + fee);
                } else used.put(log[1], fee);

                logs.remove(log[1]);
            }
        }

        if (logs.size() > 0) {
            for (String key : logs.keySet()) {
                String in = logs.get(key);

                int fee = usage("23:59", in);

                if(used.containsKey(key)){
                    used.put(key, used.get(key) + fee);
                } else used.put(key, fee);
            }
        }

        TreeMap<String, Integer> map = new TreeMap<>(used);
        int[] answer = new int [map.size()];
        int i = 0;

        for(String key : map.keySet()){
            int m = map.get(key);
            int fee = m >= fees[0] ?
                    fees[1] + (int)Math.ceil((m - fees[0]) / (fees[2] * 1.0)) * fees[3] :
                    fees[1];
            answer[i++] = fee;
        }

        return answer;
    }

    public static int usage(String out, String in) {

        int h = Integer.parseInt(out.substring(0, 2)) - Integer.parseInt(in.substring(0, 2));
        return (h * 60) + Integer.parseInt(out.substring(3, 5)) - Integer.parseInt(in.substring(3, 5)); // total
    }

}