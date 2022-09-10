/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yashu
 */
import java.util.*;
public class Players {
    String name;
    int moves=0;
    String pieces[];
    Players(String s)
    {
        this.name=s;
    }
    void showmove_number()
    {
        System.out.println("Number of moves"+moves);
    }
    void pieceInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter pieces separated by single space in single line");
        pieces=sc.nextLine().split(" ");
    }
    
}
