import java.util.Scanner;
public class Assignment6C {
    public static void main(String[] args) {
        String[][] array = new String[4][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("[Connect 4]");

        boolean win = false;
        char player = '1';

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = " ";
            }
        }
        do {

            System.out.println("Player " + player + ", enter a column: ");
            int column = sc.nextInt();
            addDisc(array, column,player);
            System.out.print("\n");
            printArray(array);

            String winner;
            if (winVertical(array,player) == true) {
                win = true;

                for (int i = 0; i < 4; i++) {
                    if (array[i][0] == "X" && array[i][1] == "X" && array[i][2] == "X" && array[i][3] == "X") {
                        winner = "Player 1";
                        System.out.println(winner + " wins!");
                        break;
                    } else if (array[i][0] == "O" && array[i][1] == "O" && array[i][2] == "O" && array[i][3] == "O") {
                        winner = "Player 2";
                        System.out.println(winner + " wins!");
                        break;
                    }
                }

            } else if (winHorizontal(array,player) == true) {
                win = true;

                for (int i = 0; i < 4; i++) {
                    if (array[0][i] == "X" && array[1][i] == "X" && array[2][i] == "X" && array[3][i] == "X") {
                        winner = "Player 1";
                        System.out.println(winner + " wins!");
                        break;
                    } else if (array[0][i] == "O" && array[1][i] == "O" && array[2][i] == "O" && array[3][i] == "O") {
                        winner = "Player 2";
                        System.out.println(winner + " wins!");
                        break;
                    }
                }
            }

            if (isBoardFull(array) == true) {
                System.out.println("No one wins!");
                win = true;
            }

            if (player == '2') {
                player = '1';
            } else if (player == '1') {
                player = '2';
            }
        } while (win == false);
    }
    public static void printArray(String[][] array) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j<=3; j++) {
                if (j == 3) {
                    System.out.print("|" + array[i][j] + "|");
                } else {
                    System.out.print("|" + array[i][j]);
                }
            }
            System.out.print("\n");
        }
    }
    public static boolean isBoardFull(String[][] array) {
        boolean isBoardFull = false;
        boolean check = false;
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if (array[i][j] == " ") {
                    check = true;
                    break;
                }
            }
        }
        if (check == false) {
            isBoardFull = true;
        } else if (check == true) {
            isBoardFull = false;
        }
        return isBoardFull;
    }
    public static void addDisc (String[][] array, int column, char player) {

        if(array[3][column] == " ") {
            if(player == '1') {
                array[3][column] = "X";
            } else if (player == '2') {
                array[3][column] = "O";
            }
        }else if(array[2][column] == " ") {
            if(player == '1') {
                array[2][column] = "X";
            } else if (player == '2') {
                array[2][column] = "O";
            }
        }else if(array[1][column] == " ") {
            if(player == '1') {
                array[1][column] = "X";
            } else if (player == '2') {
                array[1][column] = "O";
            }
        }else if(array[0][column] == " ") {
            if(player == '1') {
                array[0][column] = "X";
            } else if (player == '2') {
                array[0][column] = "O";
            }
        }

    }
    public static boolean winVertical (String[][] array, char player) {

        boolean winVertical = false;
        for (int i = 0; i < 4; i++) {
            if ((array[i][0] == "X" && array[i][1] == "X" && array[i][2] == "X" && array[i][3] == "X") || (array[i][0] == "O" && array[i][1] == "O" && array[i][2] == "O" && array[i][3] == "O")) {
                winVertical = true;
            }
        }
        return winVertical;

    }
    public static boolean winHorizontal(String[][] array, char player) {

        boolean winHorizontal = false;
        for (int i = 0; i<4;i++){
            if ((array[0][i] == "X" && array[1][i] == "X" && array[2][i] == "X" && array[3][i] == "X") || (array[0][i] == "O" && array[1][i] == "O" && array[2][i] == "O" && array[3][i] == "O")) {
                winHorizontal = true;
            }
        }
        return winHorizontal;

    }
}
