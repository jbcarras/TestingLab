package lab.tests;

import lab.ProblemSet;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestProblemSet {
    ProblemSet problemSet = new ProblemSet();

    @Test
    public void sampleTest() {
        //NOTE: for this lab, call all ProblemSet methods with the given ProblemSet object.
        //e.g. problemSet.addNums() rather than ProblemSet.addNums()

        assertEquals(problemSet.addNums(1, 2), 3);
    }


    //DO NOT MODIFY THIS TEST. IT WILL PASS ONCE YOUR TESTING IS SUFFICIENT.
    @Test
    public void testBad() throws IllegalAccessException {
        TestBad.run();
    }

}
