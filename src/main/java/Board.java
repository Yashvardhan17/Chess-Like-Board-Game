/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yashu
 */
import java.util.*;
public class Board {
    public static String boardgrid[][]=new String[5][5];
    static void boardReset()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                Board.boardgrid[i][j]="  _ ";
            }
            
        }
    }
    public static void printBoard()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
               
                   System.out.print(boardgrid[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void insert(Players x, int n)
    {
        if(n==1)
        {
            for(int i=0;i<5;i++)
            {
                boardgrid[4][i]="A-"+x.pieces[i];
            }
        }
        if(n==2)
        {
            for(int i=0;i<5;i++)
            {
                boardgrid[0][i]="B-"+x.pieces[i];
            }
        }
    }
    static void inputmove(Players x)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.charAt(0)=='p')
        {
           
           pmove(x,s);     
        }
    }
    static void swap(int a,int b,int x,int y)
    {
        String temp=boardgrid[x][y];
        boardgrid[a][b]=boardgrid[x][y];
        boardgrid[a][b]=temp;
    }
    static void delete(String s, int i, int j)
    {
        if(boardgrid[i][j].charAt(0)!=s.charAt(0))
        {
            boardgrid[i][j]="  _ ";
        }
        else
            return;
    }
    static void pmove(Players x,String s)
    {
        int j=0,i=0;
                
        if(x.name.equals("A"))
        {
            System.out.println("Checked Object");
            for(i=0;i<5;i++)
            {
                for(j=0;j<5;j++)
                {
                   String t2=(x.name+"-"+s.substring(0,2));
                   System.out.println("t2= "+t2);
                   if(boardgrid[i][j].equals(x.name+"-"+s.substring(0,2)))
                   {
                       if(s.charAt(3)=='F')
                       {
                           if(i-1<0)
                           {
                               System.out.print("invalid move");
                               return;
                           }
                           
                           String temp=boardgrid[i][j];
                           boardgrid[i][j]=boardgrid[i-1][j];
                           boardgrid[i-1][j]=temp;
                           delete(x.name,i,j);
                           
                           return;
                           
                           }
                       }
                       
                       if(s.charAt(3)=='B')
                       {
                           if(i+1>4)
                           {
                               System.out.print("invalid move");
                               return;
                           }
                           
                           System.out.println("Move check");
                           String temp=boardgrid[i][j];
                           boardgrid[i][j]=boardgrid[i+1][j];
                           boardgrid[i+1][j]=temp;
                           delete(x.name,i,j);
                           return;
                           
                       }
                       if(s.charAt(3)=='L')
                       {
                           if(j-1<0)
                           {
                               System.out.print("invalid move");
                               return;
                           }
                           
                           String temp=boardgrid[i][j];
                           boardgrid[i][j]=boardgrid[i][j-1];
                           boardgrid[i][j-1]=temp;
                           delete(x.name,i,j);
                           return;
                           
                       }
                       if(s.charAt(3)=='R')
                       {
                           if(j+1>4)
                           {
                               System.out.print("invalid move");
                               return;
                           }
                           
                           System.out.println("Move check");
                           String temp=boardgrid[i][j];
                           boardgrid[i][j]=boardgrid[i][j+1];
                           boardgrid[i][j+1]=temp;
                           delete(x.name,i,j);
                           return;
                           }
                           
                       }
                       
                    }

                }
        
    
        if(x.name.equals("B"))
        {
            System.out.println("Checked Object");
            for(i=0;i<5;i++)
            {
                for(j=0;j<5;j++)
                {
                   String t2=(x.name+"-"+s.substring(0,2));
                   System.out.println("t2= "+t2);
                   if(boardgrid[i][j].equals(x.name+"-"+s.substring(0,2)))
                   {
                       if(s.charAt(3)=='B')
                       {
                           if(i-1<0)
                           {
                               System.out.print("invalid move");
                               return;
                           }
                          
                           //System.out.println("Move check");
                           String temp=boardgrid[i][j];
                           boardgrid[i][j]=boardgrid[i-1][j];
                           boardgrid[i-1][j]=temp;
                           delete(x.name,i,j);
                           return;
                           
                           
                           }
                           
                       
                       
                       if(s.charAt(3)=='F')
                       {
                           if(i+1>4)
                           {
                               System.out.print("invalid move");
                               return;
                           }
                           
                           System.out.println("Move check forward i ="+i+"j="+j);
                           String temp=boardgrid[i][j];
                           
                           boardgrid[i][j]=boardgrid[i+1][j];
                           boardgrid[i+1][j]=temp;
                           delete(x.name,i,j);
                           return;
                           }
                           
                       }
                       if(s.charAt(3)=='R')
                       {
                           if(j-1<0)
                           {
                               System.out.print("invalid move");
                               return;
                           }
                           
                           String temp=boardgrid[i][j];
                           boardgrid[i][j]=boardgrid[i][j-1];
                           boardgrid[i][j-1]=temp;
                           delete(x.name,i,j);
                           return;
                           
                       }
                       if(s.charAt(3)=='L')
                       {
                           if(j+1>4)
                           {
                               System.out.print("invalid move");
                               return;
                           }
                           
                           System.out.println("Move check");
                           String temp=boardgrid[i][j];
                           boardgrid[i][j]=boardgrid[i][j+1];
                           boardgrid[i][j+1]=temp;
                           delete(x.name,i,j);
                           return;
                           
                       }
                       
                    }

               }
        }
    }
}
        
 
         


