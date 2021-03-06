package cloud.tamacat.taglib;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UtilTest {

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void testEscape() {
		assertEquals("&lt;html&gt;&lt;/html&gt;", Util.escape("<html></html>"));
		assertEquals("&lt;a href=&#034;/index?a=123&amp;b=456&#034;&gt;TEST&lt;/a&gt;", Util.escape("<a href=\"/index?a=123&b=456\">TEST</a>"));
		assertEquals("&lt;input type=&#034;text&#034; /&gt;", Util.escape("<input type=\"text\" />"));
		assertEquals("&lt;input type=&#039;text&#039; /&gt;", Util.escape("<input type='text' />"));
	}

	@Test
	public void testEncode() {
	}

	@Test
	public void testTimestamp() {
	}

	@Test
	public void testDate() {
	}

}
