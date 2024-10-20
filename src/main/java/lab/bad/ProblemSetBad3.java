package lab.bad;

import lab.ProblemSet;

import java.util.ArrayList;

public class ProblemSetBad3 extends ProblemSet {
    ProblemSet good = new ProblemSet();
    public int addNums(int a, int b) {
        return good.addNums(a, b);
    }


    public ArrayList<Integer> reverseList(ArrayList<Integer> list) {
        return good.reverseList(list);
    }

    //This method is intentionally broken. Do not fix it.
    public int numOccurances(ArrayList<Integer> list, int target) {
        if (list.size() == 1) {
            return 0;
        }
        int occurances = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == target) {
                occurances++;
            }
        }
        return occurances;
    }


    public String getSolutionName() {
        return "numOccurances ignores first";
    }

}
