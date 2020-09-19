package calpoly;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * +-------------------------+
 * ¦ 34 ¦ 98 ¦ 32 ¦ 41 ¦ 25  ¦
 * +----+----+----+----+-----¦
 * ¦ 14 ¦ 19 ¦ 11 ¦ 20 ¦ 11  ¦
 * +----+----+----+----+-----¦
 * ¦ 54 ¦ 99 ¦ 52 ¦ 42 ¦ 23  ¦
 * +----+----+----+----+-----¦
 * ¦ 11 ¦ 18 ¦ 11 ¦ 12 ¦ 11  ¦
 * +----+----+----+----+-----¦
 * ¦ 21 ¦ 99 ¦ 33 ¦ 21 ¦ 23  ¦
 * +-------------------------+
 * Write a program to search for the "saddle points" in a 5 by 5 array of integers. A saddle point is a cell whose value is greater than or equal to any in its row, and less than or equal to any in its column. There may be more than one saddle point in the array. Print out the coordinates of any saddle points your program finds. Print out "No saddle points" if there are none.
 */

public class Two {

    public static final int[][] MAP = {{34, 98, 32, 41, 25}, {14, 16, 11, 17, 12}, {54, 99, 52, 42, 23}, {11, 15, 11, 19, 11}, {21, 94, 33, 21, 23}};

    private static ArrayList<Integer> maxRows = new ArrayList<>();
    private static ArrayList<Integer> minCols = new ArrayList<>();


    public static void main(String... args) {
        int saddles = findSaddlePoints(MAP);
        if (saddles == 0) {
            System.out.println("No saddle points");
        } else {
            System.out.println("Saddle points found: " + saddles);
        }
    }

    private static int findSaddlePoints(int[][] map) {
        int currentGreatestRow;
        int currentLowestColumn;
        AtomicInteger saddles = new AtomicInteger();

        for (int x = 0; x < map.length; x++) {
            currentGreatestRow = 0;
            currentLowestColumn = Integer.MAX_VALUE;
            for (int y = 0; y < map[x].length; y++) {
                if (map[y][x] <= currentLowestColumn) {
                    currentLowestColumn = map[y][x];
                }

                if (map[x][y] >= currentGreatestRow) {
                    currentGreatestRow = map[x][y];
                }
            }

            System.out.println("Row:" + currentGreatestRow + " Column: " + currentLowestColumn);
            maxRows.add(x, currentGreatestRow);
            minCols.add(x, currentLowestColumn);
        }

        maxRows.forEach(r -> {
            minCols.forEach(c -> {
                if (r == c) {
                    saddles.getAndIncrement();
                }
            });
        });

        return saddles.get();
    }

}
