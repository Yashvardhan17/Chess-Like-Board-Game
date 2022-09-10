/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Yashu
 */
public class Test_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board.boardReset();
        Players A=new Players("A");
        Players B=new Players("B");
        System.out.println("Enter Pieces for Player A ");
        A.pieceInput();
        Board.insert(A, 1);
        Board.printBoard();
        System.out.println("Enter Pieces for Player B ");
        B.pieceInput();
        Board.insert(B, 2);
        Board.printBoard();
        int i=2;
        while(true){
            System.out.println("Loop");
          if(i%2==0)
          {
              System.out.print("Player A chance: ");
              Board.inputmove(A);
              Board.printBoard();
          }
          else
          {
              System.out.print("Player B chance: ");
              Board.inputmove(B);
              Board.printBoard();
          }
          
          i++;
            
            
            
        }
    }
    
}
