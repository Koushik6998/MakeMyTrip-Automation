package Write;

import org.junit.Test;

public class WiteTheExcelTest {
WriteTheExcel obj=new WriteTheExcel();

	@Test
	public void WiteTheExcelTest() throws Exception {
		obj.WriteTheExcel("Test", "Male");
		
	}
}

