package lab.bad;

import lab.ProblemSet;

import java.util.ArrayList;

public class ProblemSetBad2 extends ProblemSet {
    ProblemSet good = new ProblemSet();

    public int addNums(int a, int b) {
        return good.addNums(a, b);
    }

    //This method is intentionally broken. Do not fix it.
    public ArrayList<Integer> reverseList(ArrayList<Integer> list) {
        if (list.size() >= 7) {
            ArrayList<Integer> reversed = new ArrayList<>();
            for (int i = 7; i > 0; i--) {
                reversed.add(list.get(i));
            }
            return reversed;
        } else {
            return good.reverseList(list);
        }
    }

    public int numOccurances(ArrayList<Integer> list, int target) {
        return good.numOccurances(list, target);
    }


    public String getSolutionName() {
        return "reverseList doesn't work on large lists";
    }
}
