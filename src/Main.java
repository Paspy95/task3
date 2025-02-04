public class Main {
    public static void main(String[] args) {

        int [][] firstMatrix = {{1,1,1,1},
                                {1,0,0,1},
                                {1,0,0,1},
                                {1,1,1,1}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + firstMatrix[i][j] + " ");
            }
            System.out.println();
        }

        int [][] secondMatrix = {{2,2,2,2,2,2},
                                 {2,1,1,1,1,2},
                                 {2,1,0,0,1,2},
                                 {2,1,0,0,1,2},
                                 {2,1,1,1,1,2},
                                 {2,2,2,2,2,2}};
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(" " + secondMatrix[i][j] + " ");
            }
            System.out.println();
        }
        int [][] thirdMatrix = {{3,3,3,3,3,3,3,3},
                                {3,2,2,2,2,2,2,3},
                                {3,2,1,1,1,1,2,3},
                                {3,2,1,0,0,1,2,3},
                                {3,2,1,0,0,1,2,3},
                                {3,2,1,1,1,1,2,3},
                                {3,2,2,2,2,2,2,3},
                                {3,3,3,3,3,3,3,3}};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(" " + thirdMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}