class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int n=board.length;

        for(int i=0;i<n;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<n;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(set.contains(board[i][j])){
                    return false;
                }else{
                    set.add(board[i][j]);
                }
            }
        }
        for(int i=0;i<n;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<n;j++){
                if(board[j][i]=='.'){
                    continue;
                }
                if(set.contains(board[j][i])){
                    return false;
                }else{
                    set.add(board[j][i]);
                }
            }
        }
        //3x3 matrix
        for(int boxRow = 0;boxRow<3;boxRow++){
            for(int boxCol=0;boxCol<3;boxCol++){
                HashSet<Character> set = new HashSet<>();

                for(int i=boxRow*3 ; i<boxRow*3+3 ; i++){
                    for(int j=boxCol*3 ; j<boxCol*3+3 ; j++){
                        if(board[i][j] == '.'){
                            continue;
                        }
                        if(set.contains(board[i][j])){
                            return false;
                        }else{
                            set.add(board[i][j]);
                        }
                    }
                }
            }
        }
        return true;
    }
}