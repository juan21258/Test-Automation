package suite.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import tour.test.verifyTourLogin; //Paquete externo con test case
import wordpress.test.verifyValidLogin; //Paquete externo con test case

@RunWith(Suite.class)
@SuiteClasses({verifyTourLogin.class,verifyValidLogin.class})
public class AllLogins {

}
