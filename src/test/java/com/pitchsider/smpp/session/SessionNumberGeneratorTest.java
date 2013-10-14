package com.pitchsider.smpp.session;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Paul Whelan
 */
public class SessionNumberGeneratorTest {

	private SessionNumberGenerator sessionNumberGenerator;

	@Before
	public void setUp() {
		sessionNumberGenerator = new SessionNumberGenerator();
	}

	@Test
	public void testGetNextSessionNumber() {
		long sessionNumber = sessionNumberGenerator.getNextSessionNumber();
		Assert.assertEquals(1l, sessionNumber);
		sessionNumber = sessionNumberGenerator.getNextSessionNumber();
		Assert.assertEquals(2l, sessionNumber);
		sessionNumber = sessionNumberGenerator.getNextSessionNumber();
		Assert.assertEquals(3l, sessionNumber);
	}

	@Test
	public void testReset() {
		testGetNextSessionNumber();
		Assert.assertTrue(sessionNumberGenerator.getNextSessionNumber() > SessionNumberGenerator.SEQUENCE_START);
		sessionNumberGenerator.reset();
		long sessionNumber = sessionNumberGenerator.getNextSessionNumber();
		Assert.assertEquals(SessionNumberGenerator.SEQUENCE_START,
				sessionNumber);
	}
}
