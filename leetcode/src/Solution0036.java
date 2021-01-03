import java.util.HashMap;
import java.util.Map;

/**
 * 36. 有效的数独
 */
public class Solution0036 {
    public boolean isValidSudoku(char[][] board) {
        //判断横向
        for (int i = 0; i < board.length;i++){
            Map<Character,Boolean> m = new HashMap<>();
            for (int j = 0; j<board[i].length;j++){
                if (board[i][j] == '.') {
                    continue;
                }
                if (m.get(board[i][j]) == null) {
                    m.put(board[i][j],true);
                } else {
                    return false;
                }
            }
        }
        //判断纵向
        for (int i = 0; i < board.length;i++){
            Map<Character,Boolean> m = new HashMap<>();
            for (int j = 0; j<board[i].length;j++){
                if (board[j][i] == '.') {
                    continue;
                }
                if (m.get(board[j][i]) == null) {
                    m.put(board[j][i],true);
                } else {
                    return false;
                }
            }
        }
        //判断每一个块
        for (int i = 1;i<=3;i++){
            for (int k = 1;k<=3;k++){
                Map<Character,Boolean> m = new HashMap<>();
                for (int j = i*3-3;j<i*3;j++){
                    for (int l = k*3-3;l<k*3;l++){
                        if (board[j][l] == '.') {
                            continue;
                        }
                        if (m.get(board[j][l]) == null) {
                            m.put(board[j][l],true);
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
