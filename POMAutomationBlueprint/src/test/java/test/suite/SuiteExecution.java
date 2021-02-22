package test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import test.individualTests.*; //Here we import the package that contains the tests

@RunWith(Suite.class)
@SuiteClasses({ExampleTest.class,ExampleTest2.class})//this can have many .class files
public class SuiteExecution {

}
