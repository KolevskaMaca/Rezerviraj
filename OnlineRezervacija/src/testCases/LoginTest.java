package testCases;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.junit.Test;
import static org.mockito.Mockito.*;

import controler.Login;

public class LoginTest extends Login{

	
		/*@Test
		 public void test() throws IOException, ServletException {
		   HttpServletRequest request = mock(HttpServletRequest.class);       
		       HttpServletResponse response = mock(HttpServletResponse.class);    

		   when(request.getParameter("email")).thenReturn("p.r@gmail.com");
		   PrintWriter writer = new PrintWriter("test.txt");
		         when(response.getWriter()).thenReturn(writer);

		     new LoginTest().doPost(request, response);

		         verify(request, atLeast(1)).getParameter("email"); // only if you want to verify username was called...
		         writer.flush(); // it may not have been flushed yet...
		         assertTrue(FileUtils.readFileToString(new File("C:\\logs\\test.txt"), "UTF-8").contains("My Expected String"));
		   
		  fail("Not yet implemented");
		 
	}*/

}
