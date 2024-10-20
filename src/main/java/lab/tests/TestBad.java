package lab.tests;


//IGNORE EVERYTHING IN THIS CLASS.

import lab.ProblemSet;
import lab.bad.ProblemSetBad1;
import lab.bad.ProblemSetBad2;
import lab.bad.ProblemSetBad3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import static org.junit.Assert.fail;

public class TestBad {
    public static void run() throws IllegalAccessException {
        ArrayList<String> todo = new ArrayList<>();
        testBadHelper(new ProblemSetBad1(), todo);
        testBadHelper(new ProblemSetBad2(), todo);
        testBadHelper(new ProblemSetBad3(), todo);
        if (!todo.isEmpty()) {
            fail("Your testing is incomplete.");
        }
    }

    private static void testBadHelper(ProblemSet problemSet, ArrayList<String> todo) throws IllegalAccessException {
        try {
            runTestsOnBad(problemSet);
        } catch (AssertionError e){
            System.err.println(e.getMessage());
            todo.add(problemSet.getSolutionName());
        }
    }
    private static void runTestsOnBad(ProblemSet problemSet) throws IllegalAccessException {
        TestProblemSet test = new TestProblemSet();
        Method[] methods = test.getClass().getMethods();
        boolean fail = true;
        test.problemSet = problemSet;
        final String GREEN = "\u001B[32m";
        final String RESET = "\u001B[0m";
        for (Method method : methods) {
            if (method.getDeclaringClass().equals(TestProblemSet.class) && method.getDeclaredAnnotations().length == 1 && !method.getName().equals("testBad") && !method.getName().equals("testBadHelper")) {
                try {
                    method.invoke(test);
                } catch (AssertionError ignored) {
                    System.out.println(GREEN+"Your test \""+ method.getName() +"\" caught the bug: " + problemSet.getSolutionName() + RESET);
                    fail = false;
                } catch (InvocationTargetException e) {
                    if (e.getCause().getClass().equals(AssertionError.class)) {
                        System.out.println(GREEN+"Your test \""+ method.getName() +"\" caught the bug: " + problemSet.getSolutionName() + RESET);
                        fail = false;
                    }
                }
            }
        }
        if (fail) fail("Your testing didn't catch the bug: " + problemSet.getSolutionName());
    }
}
