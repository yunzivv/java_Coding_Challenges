class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for (char c : s.toCharArray()) {
            int count = 0;
            char letter = c;

            while (count < index) {
                letter++;
                if (letter > 'z') letter = 'a';
                if (skip.contains(Character.toString(letter))) continue;
                count++;
            }

            answer += letter;
        }

        return answer;
    }
}