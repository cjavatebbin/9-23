/**
 * Which is more likely: at least one 6 in 6 rolls of a fair die,
 * or at least two 6's in 12 rolls of a fair die?
 * DO NOT solve this as a math problem (you can of course). This is a
 * computation problem. Estimate the probabilities through simulation. If you
 * simply return the theoretical/analytical probability calculated
 * mathematically, you will not pass the test cases.
 */
public class Pepys {
    /**
     * @param n the number of simulations (experiments) to run
     *          (A simulation is rolling a die 6 times.)
     * @return the estimated likelihood of rolling at least one 6 in 6 rolls of a
     *         fair die
     */
    public double probAtLeastOneSix(int n) {
        // TODO
        // e.g. one simulation might be: 1 4 4 2 6 1 (success -- at least one six)
        // e.g. 6 6 2 2 1 2 (success -- at least one six)
        // e.g. 1 2 5 5 3 4 (failure -- no sixes)
        // return (number of successes) / (number of simulations)
        return 0.0; // delete this line of code

    }

    /**
     * @param n the number of simulations (experiments) to run
     *          (A simulation is rolling a die 12 times.)
     * @return the estimated likelihood of rolling at least two 6's in 12 rolls of a
     *         fair die
     */
    public double probAtLeastTwoSixes(int n) {
        // TODO
        // e.g. one simulation might be: 1 4 4 2 6 1 6 1 1 1 1 2 (success -- at least
        // two sixes)
        // e.g. 6 6 2 2 1 2 1 1 1 1 1 6 (success -- at least two sixes)
        // e.g. 1 2 5 5 3 4 4 1 2 4 5 6 (failure -- less than two sixes)
        // return (number of successes) / (number of simulations)
        return 0.0; // delete this line of code

    }

}
