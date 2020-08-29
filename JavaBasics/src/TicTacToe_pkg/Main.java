package TicTacToe_pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Static Game Variables
    static ArrayList<Integer> p1Pos=new ArrayList<>();
    static ArrayList<Integer> p2Pos=new ArrayList<>();

    public static boolean playerTurn=true;
    public static Scanner scn= new Scanner(System.in);

    //Create Game Board
    public static TicTacToe board=new TicTacToe();

    //------
    public static void main(String[] args) {
        //Check Board Visibility
        if(!board.isVisible()){
            board.setVisible(true);
        }
    }

    /*public static void checkforWin(){
        //Player1 Win Check
        if(board.button1.getText().equals("X")){
            if(board.button4.getText().equals("X")){
                if(board.button7.getText().equals("X")){
                    winner("Player 1");
                }
            }
            if(board.button2.getText().equals("X")){
                if(board.button3.getText().equals("X")){
                    winner("Player 1");
                }
            }
            if(board.button5.getText().equals("X")){
                if(board.button9.getText().equals("X")){
                    winner("Player 1");
                }
            }
        }
        if(board.button5.getText().equals("X")){
            if(board.button4.getText().equals("X")){
                if(board.button6.getText().equals("X")){
                    winner("Player 1");
                }
            }
            if(board.button2.getText().equals("X")){
                if(board.button8.getText().equals("X")){
                    winner("Player 1");
                }
            }
            if(board.button3.getText().equals("X")){
                if(board.button7.getText().equals("X")){
                    winner("Player 1");
                }
            }
        }
        if(board.button9.getText().equals("X")){
            if(board.button6.getText().equals("X")){
                if(board.button3.getText().equals("X")){
                    winner("Player 1");
                }
            }
            if(board.button7.getText().equals("X")){
                if(board.button8.getText().equals("X")){
                    winner("Player 1");
                }
            }
        }

        //Player2 Win Check
        if(board.button1.getText().equals("O")){
            if(board.button4.getText().equals("O")){
                if(board.button7.getText().equals("O")){
                    winner("Player 2");
                }
            }
            if(board.button2.getText().equals("O")){
                if(board.button3.getText().equals("O")){
                    winner("Player 2");
                }
            }
            if(board.button5.getText().equals("O")){
                if(board.button9.getText().equals("O")){
                    winner("Player 2");
                }
            }
        }
        if(board.button5.getText().equals("O")){
            if(board.button4.getText().equals("O")){
                if(board.button6.getText().equals("O")){
                    winner("Player 2");
                }
            }
            if(board.button2.getText().equals("O")){
                if(board.button8.getText().equals("O")){
                    winner("Player 2");
                }
            }
            if(board.button3.getText().equals("O")){
                if(board.button7.getText().equals("O")){
                    winner("Player 2");
                }
            }
        }
        if(board.button9.getText().equals("O")){
            if(board.button6.getText().equals("O")){
                if(board.button3.getText().equals("O")){
                    winner("Player 2");
                }
            }
            if(board.button7.getText().equals("O")){
                if(board.button8.getText().equals("O")){
                    winner("Player 2");
                }
            }
        }
        
        //Draw Check
        if(!board.button1.getText().equals("")){
            if(!board.button2.getText().equals("")){
                if(!board.button3.getText().equals("")){
                    if(!board.button4.getText().equals("")){
                        if(!board.button5.getText().equals("")){
                            if(!board.button6.getText().equals("")){
                                if(!board.button7.getText().equals("")){
                                    if(!board.button8.getText().equals("")){
                                        if(!board.button9.getText().equals("")){
                                            winner("Draw");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }*/

    public static void checkforWin(){
        //Winning Conditions
        List tRow= Arrays.asList(1,2,3);    List mRow= Arrays.asList(4,5,6);
        List bRow= Arrays.asList(7,8,9);    List lCol= Arrays.asList(1,4,7);
        List mCol= Arrays.asList(2,5,8);    List rCol= Arrays.asList(3,6,9);
        List Diag_1= Arrays.asList(1,5,9);  List Diag_2= Arrays.asList(7,5,3);

        List<List> winCondition=new ArrayList<>();
        winCondition.add(tRow);     winCondition.add(mRow);
        winCondition.add(bRow);     winCondition.add(lCol);
        winCondition.add(mCol);     winCondition.add(rCol);
        winCondition.add(Diag_1);   winCondition.add(Diag_2);

        //Check for Winner
        for(List lst:winCondition) {
            if (p1Pos.containsAll(lst)){
                winner("Player 1");
            }else if (p2Pos.containsAll(lst)){
                winner("Player 2");
            }else if(p1Pos.size()+p2Pos.size()==9){
                winner("Draw");
            }
        }
    }

    public static void winner(String winnerName){
        board.setVisible(false);
        if(winnerName.equals("Player 1")){
            System.out.println("*** Player 1 Won! ***");
        } else if(winnerName.equals("Player 2")){
            System.out.println("--- Player 2 Won! ---");
        } else {
            System.out.println("^^^ DRAW ^^^");
        }

        //Play Again prompt
        System.out.println("(true or false)\n\nPLay Again?");
        if(scn.nextBoolean()){
            boardReset();
        } else {
            System.out.println("Thanks for Playing!----");
            //Terminate Main Execution
            System.exit(0);
        }
    }

    public static void boardReset(){
        //Reset Board
        board.button1.setText("");
        board.button2.setText("");
        board.button3.setText("");
        board.button4.setText("");
        board.button5.setText("");
        board.button6.setText("");
        board.button7.setText("");
        board.button8.setText("");
        board.button9.setText("");
        //Reset Player Variables
        p1Pos.clear();
        p2Pos.clear();
        playerTurn=true;
        //Reset Board Visibility
        board.setVisible(true);
    }
}
