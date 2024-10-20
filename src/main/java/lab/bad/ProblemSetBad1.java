package lab.bad;

import lab.ProblemSet;

import java.util.ArrayList;

public class ProblemSetBad1 extends ProblemSet {
    ProblemSet good = new ProblemSet();

    //This method is intentionally broken. Do not fix it.
    public int addNums(int a, int b) {
        return Math.abs(a) + Math.abs(b);
    }


    public ArrayList<Integer> reverseList(ArrayList<Integer> list) {
        return good.reverseList(list);
    }

    public int numOccurances(ArrayList<Integer> list, int target) {
        return good.numOccurances(list, target);
    }


    public String getSolutionName() {
        return "add doesn't work on negatives";
    }
}
