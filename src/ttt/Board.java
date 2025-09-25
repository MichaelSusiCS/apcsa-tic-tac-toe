package ttt;
public class Board {
    private final char[][] grid = new char[3][3];
    public Board(){ reset(); }
    public boolean place(int r,int c,char m){
        if(r<0||r>2||c<0||c>2||grid[r][c] != ' ') return false;
        grid[r][c]=m; return true;
    }
    public boolean isWin(char m){
        for(int i=0;i<3;i++){
            if(grid[i][0]==m&&grid[i][1]==m&&grid[i][2]==m) return true;
            if(grid[0][i]==m&&grid[1][i]==m&&grid[2][i]==m) return true;
        }
        return (grid[0][0]==m&&grid[1][1]==m&&grid[2][2]==m) ||
               (grid[0][2]==m&&grid[1][1]==m&&grid[2][0]==m);
    }
    public boolean isFull(){
        for (var row: grid) for (var c: row) if(c==' ') return false;
        return true;
    }
    public void reset(){ for(int r=0;r<3;r++) for(int c=0;c<3;c++) grid[r][c]=' '; }
    public char get(int r,int c){ return grid[r][c]; }
}
