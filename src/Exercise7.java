import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        char[][] playBoard = new char[3][3];
        System.out.println("Let's the game start! Player one, make your move: ");
        boardPrint(playBoard);
        int position;
        boolean winner;
        for (int i = 0; i < 9; i++){
            char symbol = changeSymbol(i);
            position = getPositionFromUser(playBoard);
            winner = placeSymbolOnBoard(playBoard, position, symbol);
            if (winner){
                break;
            }
        }
        System.out.println("Game over!");

    }

    public static char changeSymbol (int i){
        char symbol;
        if (i % 2 == 0){
            symbol = 'X';
        } else {
            symbol = '0';
        }
        return symbol;
    }

    public static void boardPrint(char [][] playBoard){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(playBoard[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean isAvailable(char [][] playBoard, int placement){
        boolean availablePlacement = true;
        switch (placement){
            case 1:
                if (playBoard[0][0] == 'X' || playBoard[0][0] == 'O'){
                    availablePlacement = false;
                }
                break;
            case 2:
                if (playBoard[0][1] == 'X' || playBoard[0][1] == 'O'){
                    availablePlacement = false;
                }
                break;
            case 3:
                if (playBoard[0][2] == 'X' || playBoard[0][2] == 'O'){
                    availablePlacement = false;
                }
                break;
            case 4:
                if (playBoard[1][0] == 'X' || playBoard[1][0] == 'O'){
                    availablePlacement = false;
                }
                break;
            case 5:
                if (playBoard[1][1] == 'X' || playBoard[1][1] == 'O'){
                    availablePlacement = false;
                }
                break;
            case 6:
                if (playBoard[1][2] == 'X' || playBoard[1][2] == 'O'){
                    availablePlacement = false;
                }
                break;
            case 7:
                if (playBoard[2][0] == 'X' || playBoard[2][0] == 'O'){
                    availablePlacement = false;
                }
                break;
            case 8:
                if (playBoard[2][1] == 'X' || playBoard[2][1] == 'O'){
                    availablePlacement = false;
                }
                break;
            case 9:
                if (playBoard[2][2] == 'X' || playBoard[2][2] == 'O'){
                    availablePlacement = false;
                }
                break;
            default: availablePlacement = false;
        }
        return availablePlacement;
    }

    public static int getPositionFromUser(char [][] playBoard){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a placement for your symbol: ");
        int placement = scanner.nextInt();
        if (placement > 9 || placement < 1){
            placement = getPositionFromUser(playBoard);
        } else {
            boolean availablePlacement = isAvailable(playBoard, placement);
            if (!availablePlacement){
                System.out.println("This placement is already taken!");
                placement = getPositionFromUser(playBoard);
            }
        }
        return placement;

    }

    public static char checkWinner(char [][] playBoard, char symbol){
        char winner;
        if(playBoard[0][0] == symbol && playBoard[0][1] == symbol && playBoard[0][2] == symbol){
            winner = symbol;
        }
        else if(playBoard[1][0] == symbol && playBoard[1][1] == symbol && playBoard[1][2] == symbol){
            winner = symbol;
        }
        else if(playBoard[2][0] == symbol && playBoard[2][1] == symbol && playBoard[2][2] == symbol){
            winner = symbol;
        }
        else if(playBoard[0][0] == symbol && playBoard[1][0] == symbol && playBoard[2][0] == symbol){
            winner = symbol;
        }
        else if(playBoard[0][1] == symbol && playBoard[1][1] == symbol && playBoard[2][1] == symbol){
            winner = symbol;
        }
        else if(playBoard[0][2] == symbol && playBoard[1][2] == symbol && playBoard[2][2] == symbol){
            winner = symbol;
        }
        else if(playBoard[0][0] == symbol && playBoard[1][1] == symbol && playBoard[2][2] == symbol){
            winner = symbol;
        }
        else if(playBoard[0][2] == symbol && playBoard[1][1] == symbol && playBoard[2][0] == symbol){
            winner = symbol;
        } else {
            winner = '-';
        }
        return winner;
    }

    public static boolean placeSymbolOnBoard(char [][] playBoard, int placement, char symbol){
        switch (placement){
            case 1:
                playBoard [0][0] = symbol;
                boardPrint(playBoard);
                break;
            case 2:
                playBoard [0][1] = symbol;
                boardPrint(playBoard);
                break;
            case 3:
                playBoard [0][2] = symbol;
                boardPrint(playBoard);
                break;
            case 4:
                playBoard [1][0] = symbol;
                boardPrint(playBoard);
                break;
            case 5:
                playBoard [1][1] = symbol;
                boardPrint(playBoard);
                break;
            case 6:
                playBoard [1][2] = symbol;
                boardPrint(playBoard);
                break;
            case 7:
                playBoard [2][0] = symbol;
                boardPrint(playBoard);
                break;
            case 8:
                playBoard [2][1] = symbol;
                boardPrint(playBoard);
                break;
            case 9:
                playBoard [2][2] = symbol;
                boardPrint(playBoard);
                break;
        }
        boolean isWinner = true;
        char winner = checkWinner(playBoard, symbol);
        if (winner == '-'){
            System.out.println("There is no winner yet.");
            isWinner = false;
        } else {
            System.out.println("There is a winner: " + winner + "!");
        }
        return isWinner;
    }
}

