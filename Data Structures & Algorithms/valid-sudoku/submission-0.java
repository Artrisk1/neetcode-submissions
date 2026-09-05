class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Use boolean arrays for O(1) lookups. 
        // 9 rows/cols/boxes, 9 possible digits (0-8)
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') {
                    continue;
                }
                
                // Convert char '1'-'9' to integer 0-8
                int val = board[r][c] - '1'; 
                
                // Calculate the 1D index (0-8) for the 3x3 sub-box
                int boxIndex = (r / 3) * 3 + (c / 3);
                
                // If we've seen this number in the current row, col, or box, it's invalid
                if (rows[r][val] || cols[c][val] || boxes[boxIndex][val]) {
                    return false;
                }
                
                // Mark the number as seen
                rows[r][val] = true;
                cols[c][val] = true;
                boxes[boxIndex][val] = true;
            }
        }
        return true;
    }
}