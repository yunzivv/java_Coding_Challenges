class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int index = 0;
        for(int i = 0; i < picture.length; i++){
            String pic = "";
            for(int j = 0; j < picture[i].length(); j++){
                for(int count = 0; count < k; count++){
                    pic += picture[i].charAt(j);
                }
            }
            for(int j = 0; j < k; j++){
                answer[index++] = pic;
            }
        }
        return answer;
    }
}