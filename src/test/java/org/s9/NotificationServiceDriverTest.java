package org.s9;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class NotificationServiceDriverTest {

	
	
	@Test	
	public void alertTest()
	{
		NotificationServiceDriver nsd = new NotificationServiceDriver();
		assertEquals(nsd.alert(), "Alert!");
	}
}
