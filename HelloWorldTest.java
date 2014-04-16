import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class HelloWorldTest {
	public static void main(String args[]){
		org.junit.runner.JUnitCore.main("HelloWorldTest");
	}
	@Test 
	public void helloTest() {
		HelloWorld hworld = new HelloWorld();
		String output = hworld.getM();
		assertEquals("Hello, World!", output);
	}

}
