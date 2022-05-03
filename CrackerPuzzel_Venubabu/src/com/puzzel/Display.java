package com.puzzel;

public class Display {
//    Display() {
//        System.out.println("will display");
//    }
//
//    void show() {
//        System.out.println("displaying");
//    }

    // print game board at each node on the way down the tree, removing the printed child on the way up
    public void printGameWins(GameTree parent) {
        System.out.println(parent.getGameBoard());

        if (parent.numChildren() > 0) {
            GameTree nextLocation = parent.getFirstChild();
            printGameWins(nextLocation);				// recursive call
            if (nextLocation.numChildren() == 0)
                parent.removeFirstChild();
        } else {
            System.out.println("--------Completed----------");
        }
    }
}
