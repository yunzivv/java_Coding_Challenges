class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int len = board.length;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(board[i][j] != 1) continue;
                try { board[i-1][j-1] = board[i-1][j-1] == 1 ? 1 : 9; } catch (Exception e) {}
                try { board[i-1][j] = board[i-1][j] == 1 ? 1 : 9; } catch (Exception e) {}
                try { board[i-1][j+1] = board[i-1][j+1] == 1 ? 1 : 9; } catch (Exception e) {}
                try { board[i][j-1] = board[i][j-1] == 1 ? 1 : 9; } catch (Exception e) {}
                try { board[i][j+1] = board[i][j+1] == 1 ? 1 : 9; } catch (Exception e) {}
                try { board[i+1][j-1] = board[i+1][j-1] == 1 ? 1 : 9; } catch (Exception e) {}
                try { board[i+1][j] = board[i+1][j] == 1 ? 1 : 9; } catch (Exception e) {}
                try { board[i+1][j+1] = board[i+1][j+1] == 1 ? 1 : 9; } catch (Exception e) {}

            }
        }
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(board[i][j] == 0)answer++;
            }
        }
        return answer;
    }
}