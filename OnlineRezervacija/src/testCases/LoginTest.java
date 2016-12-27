package testCases;

import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.Test;

import junit.framework.TestCase;
import service.LoginService;
import static org.junit.Assert.*;

public class LoginTest extends TestCase{

	@Test
	public void test() throws IOException, ServletException {

		LoginService loginService = new LoginService("maca", "maca");

		assertEquals(false, loginService.ProveriVoBaza());
	}

}
