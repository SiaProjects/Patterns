package com.design.Adapter;

public class Main {

    public static void main(String[] args) {

        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        if (roundHole.fits(roundPeg)) {
            System.out.println("Round peg r5 fits round hole r5!");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSquPegAdapter = new SquarePegAdapter(roundPeg.getRadius(), smallSqPeg);
        SquarePegAdapter largeSquPegAdapter = new SquarePegAdapter(roundPeg.getRadius(), largeSqPeg);

        if (roundHole.fits(smallSquPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!roundHole.fits(largeSquPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
