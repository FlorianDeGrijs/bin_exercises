package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        AutoInvoer commandLineAutoInvoer = new CommandLineAutoInvoer();
        AutoInvoer swingAutoInvoer = new SwingAutoInvoer();
        Auto auto1 = new Auto(commandLineAutoInvoer);
        Auto auto2 = new Auto(swingAutoInvoer);

        auto1.reserveer();
        auto2.reserveer();

        System.out.println(auto1.eigenaar());
        System.out.println(auto2.eigenaar());
         */


        // -1 = blocked
        // 0+ = additional movement cost
        int[][] maze = {
                {  0,  0,  3,  4,  7,  0,  4,  0},
                {  0,  0,  3,  0,  9,  0,  9,  0},
                {  0,  0,  0,100,100,100,  0,  0},
                {  0,  0,  0,  0,  0,100,  0,  0},
                {  0,  0,100,  0,  0,100,  0,  0},
                {  0,  0,100,  0,  0,100,  0,  0},
                {  0,  0,100,100,100,100,  0,  0},
                {  0,  0,  0,  0,  -1,  0,  0,  0},
        };
        AStar as = new AStar(maze, 0, 0, false);
        List<AStar.Node> path = as.findPathTo(7, 7);
        if (path != null) {
            path.forEach((n) -> {
                System.out.print("[" + n.x + ", " + n.y + "] ");
                maze[n.y][n.x] = -1;
            });
            System.out.printf("\nTotal cost: %.02f\n", path.get(path.size() - 1).g);

            for (int[] maze_row : maze) {
                for (int maze_entry : maze_row) {
                    switch (maze_entry) {
                        case 0:
                            System.out.print("_");
                            break;
                        case -1:
                            System.out.print("*");
                            break;
                        default:
                            System.out.print("#");
                    }
                }
                System.out.println();
            }
        }

    }
}
