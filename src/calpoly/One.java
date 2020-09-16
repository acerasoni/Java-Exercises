package calpoly;

/**
 * +-------------------------+
 * ¦ 34 ¦ 21 ¦ 32 ¦ 41 ¦ 25  ¦
 * +----+----+----+----+-----¦
 * ¦ 14 ¦ 42 ¦ 43 ¦ 14 ¦ 31  ¦
 * +----+----+----+----+-----¦
 * ¦ 54 ¦ 45 ¦ 52 ¦ 42 ¦ 23  ¦
 * +----+----+----+----+-----¦
 * ¦ 33 ¦ 15 ¦ 51 ¦ 31 ¦ 35  ¦
 * +----+----+----+----+-----¦
 * ¦ 21 ¦ 52 ¦ 33 ¦ 13 ¦ 23  ¦
 * +-------------------------+
 * <p>
 * Do you like treasure hunts? In this problem you are to write a program to explore the above array for a treasure. The values in the array are clues. Each cell contains an integer between 11 and 55; for each value the ten's digit represents the row number and the unit's digit represents the column number of the cell containing the next clue. Starting in the upper left corner (at 1,1), use the clues to guide your search of the array. (The first three clues are 11, 34, 42). The treasure is a cell whose value is the same as its coordinates. Your program must first read in the treasure map data into a 5 by 5 array. Your program should output the cells it visits during its search, and a message indicating where you found the treasure.
 */

public class One {

    private static final int[][] map = {{34, 21, 32, 41, 25}, {14, 42, 43, 14, 31}, {54, 45, 52, 42, 23}, {33, 15, 51, 31, 35}, {21, 52, 33, 13, 23}};

    public static void main(String... args) {
        System.out.println("Treasure found at cell:" + findTreasure(map));
    }

    private static String findTreasure(int[][] map) {
        return nextClue(map, 11);
    }

    private static String nextClue(int[][] map, int rowCol) {
        String rowColString = Integer.toString(rowCol);
        int row = rowColString.charAt(0) - 48;
        int col = rowColString.charAt(1) - 48;
        int clue = map[row - 1][col - 1];
        if (rowCol == clue) {
            return rowColString;
        } else {
            return nextClue(map, clue);
        }
    }
}
