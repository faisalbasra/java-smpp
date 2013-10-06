package com.pitchsider.smpp.pdu;

import org.junit.Assert;
import org.junit.Test;

/**
 * @see section 4.7.5 of the spec for these codes.
 * @author Paul Whelan
 */
public class CommandTest {

	@Test
	public void testAllValues() {
		Assert.assertEquals(0x00000001,Command.BIND_RECEIVER.getCommandCode());
		Assert.assertEquals(0x00000002,Command.BIND_TRANSMITTER.getCommandCode());
		Assert.assertEquals(0x00000003,Command.QUERY_SM.getCommandCode());
		Assert.assertEquals(0x00000004,Command.SUBMIT_SM.getCommandCode());
		Assert.assertEquals(0x00000005,Command.DELIVER_SM.getCommandCode());
		Assert.assertEquals(0x00000006,Command.UNBIND.getCommandCode());
		Assert.assertEquals(0x00000007,Command.REPLACE_SM.getCommandCode());
		Assert.assertEquals(0x00000008,Command.CANCEL_SM.getCommandCode());
		Assert.assertEquals(0x00000009,Command.BIND_TRANSCEIVER.getCommandCode());
		Assert.assertEquals(0x0000000B,Command.OUTBIND.getCommandCode());
		Assert.assertEquals(0x00000015,Command.ENQUIRE_LINK.getCommandCode());
		Assert.assertEquals(0x00000021,Command.SUBMIT_MULTI.getCommandCode());
		Assert.assertEquals(0x00000102,Command.ALERT_NOTIFICATION.getCommandCode());
		Assert.assertEquals(0x00000103,Command.DATA_SM.getCommandCode());
		Assert.assertEquals(0x00000111,Command.BROADCAST_SM.getCommandCode());
		Assert.assertEquals(0x00000112,Command.QUERY_BROADCAST_SM.getCommandCode());
		Assert.assertEquals(0x00000113,Command.CANCEL_BROADCAST_SM.getCommandCode());
		Assert.assertEquals(0x80000000,Command.GENERIC_NACK.getCommandCode());
		Assert.assertEquals(0x80000001,Command.BIND_RECEIVER_RESP.getCommandCode());
		Assert.assertEquals(0x80000002,Command.BIND_TRANSMITTER_RESP.getCommandCode());
		Assert.assertEquals(0x80000003,Command.QUERY_SM_RESP.getCommandCode());
		Assert.assertEquals(0x80000004,Command.SUBMIT_SM_RESP.getCommandCode());
		Assert.assertEquals(0x80000005,Command.DELIVER_SM_RESP.getCommandCode());
		Assert.assertEquals(0x80000006,Command.UNBIND_RESP.getCommandCode());
		Assert.assertEquals(0x80000007,Command.REPLACE_SM_RESP.getCommandCode());
		Assert.assertEquals(0x80000008,Command.CANCEL_SM_RESP.getCommandCode());
		Assert.assertEquals(0x80000009,Command.BIND_TRANSCEIVER_RESP.getCommandCode());
		Assert.assertEquals(0x80000015,Command.ENQUIRE_LINK_RESP.getCommandCode());
		Assert.assertEquals(0x80000021,Command.SUBMIT_MULTI_RESP.getCommandCode());
		Assert.assertEquals(0x80000103,Command.DATA_SM_RESP.getCommandCode());
		Assert.assertEquals(0x80000111,Command.BROADCAST_SM_RESP.getCommandCode());
		Assert.assertEquals(0x80000112,Command.QUERY_BROADCAST_SM_RESP.getCommandCode());
		Assert.assertEquals(0x80000113,Command.CANCEL_BROADCAST_SM_RESP.getCommandCode());	
	}
	
}
