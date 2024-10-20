package lab;

import java.util.ArrayList;

public class ProblemSet {

    //This code is all correct. You may look at it to understand what each method does, but do not modify it.

    public int addNums(int a, int b) {
        return a+b;
    }

    public ArrayList<Integer> reverseList(ArrayList<Integer> list) {
        ArrayList<Integer> reversed = new ArrayList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }


    public int numOccurances(ArrayList<Integer> list, int target) {
        int occurances = 0;
        for (int num : list) {
            if (num == target) {
                occurances++;
            }
        }
        return occurances;
    }

    public String getSolutionName() {
        return "Correct Solution!";
    }
}
