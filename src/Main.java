import ttt.Board;
import java.util.Scanner;

public class Main {
    static void printBoard(Board b){
        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                char ch = b.get(r,c);
                System.out.print(ch==' ' ? '.' : ch);
                if(c<2) System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Board b = new Board();
        Scanner sc = new Scanner(System.in);
        char p = 'X';
        while(true){
            printBoard(b);
            System.out.print("Player " + p + " row col (0-2 0-2): ");
            int r = sc.nextInt(), c = sc.nextInt();
            if(!b.place(r,c,p)){ System.out.println("Invalid. Try again."); continue; }
            if(b.isWin(p)){ printBoard(b); System.out.println("Player "+p+" wins!"); break; }
            if(b.isFull()){ printBoard(b); System.out.println("Draw!"); break; }
            p = (p=='X') ? 'O' : 'X';
        }
    }
}
