import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.revaturecontroller.Revaturecontroller;
import com.revatureentity.Revatureuser;
import com.revatureinterface.Revaturecontrollerinterface;

public class TestingController {
	
	Revaturecontrollerinterface rs=null;

	@Before
	public void setUp() throws Exception {
		rs=new Revaturecontroller();
		
	}

	@After
	public void tearDown() throws Exception {
		rs=null;
	}

	@Test
	public void testCreateprofile() {
		
		int i=rs.createprofile();
		assert i>0: "test failed"; 
		
	}

	@Test
	public void testDeleteprofile() {
		
		int i=rs.deleteprofile();
		assert i>0: "test failed";
	}

	@Test
	public void testViewprofile() {
		Revatureuser i=rs.viewprofile();
		assert i!=null:"test failed";
		
	}

	@Test
	public void testSearchprofile() {
		Revatureuser i=rs.searchprofile();
		assert i!=null:"test failed";
		
	}

	@Test
	public void testEditprofile() {
		int i1=rs.editprofile();
		assert i1>0: "test failed";
		
	}

	@Test
	public void testViewallprofile() {
		
	}

	@Test
	public void testLoginprofile() {
		Revatureuser i=rs.loginprofile();
		assert i!=null:"test failed";
		
			}

	@Test
	public void testTimeline() {
		int i=rs.timeline();
		assert i>0:"test failed";
		
	}

}
