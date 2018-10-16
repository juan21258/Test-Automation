package register.test;

import org.junit.Test;
import com.codoid.products.exception.FilloException;
import code.execution.*;

public class Finaltest {

	@Test
	public void test() throws FilloException {
		String[] arguments = new String[] {"test"};
		MainExecution.main(arguments);
	}
}
