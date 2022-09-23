package arrayQuestions;

public class TicTac {
    public static void main(String[] args) {
        String[][] game = {
                            {"X","|", "O", "|", "X"},
                            {"O","|", "X","|","O"},
                            {"X","|", "X","|", "O"}
        };

        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                System.out.print(game[i][j]+" ");
            }
            System.out.println();
        }
    }
}