class Solution {
    public boolean isValidSudoku(char[][] board) {
        // for each row
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char num = board[i][j];
                if (num != '.') {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                    if (map.get(num) == 2) {
                        return false;
                    }
                }
            }
            map.clear(); 
        }

        // for each column
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char num = board[j][i];
                if (num != '.') {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                    if (map.get(num) == 2) {
                        return false;
                    }
                }
            }
            map.clear(); 
        }

        // for each 3x3 sub-box
        for (int rowStart = 0; rowStart < 9; rowStart += 3) {
            for (int colStart = 0; colStart < 9; colStart += 3) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char num = board[rowStart + i][colStart + j];
                        if (num != '.') {
                            map.put(num, map.getOrDefault(num, 0) + 1);
                            if (map.get(num) == 2) {
                                return false;
                            }
                        }
                    }
                }
                map.clear(); 
            }
        }

        return true; 
    }
}
