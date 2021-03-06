package UnitTest.CodePractice;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by mgao on 2017/3/20.
 */
public class PatternRunner {
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(MergedKSortedListTest.class);

        for (Failure failure : result.getFailures()){
           System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
