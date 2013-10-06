package com.pitchsider.smpp.pdu;

/**
 * Enumerates each of the different PDUs for SMPP and their command code.
 * The following Command codes are defined, please note that the following
 * command codes are reserved for the Message Centre Vendor. 
 * <ul>
 * 	<li>0x00010200 - 0x000102FF</li>
 * 	<li>0x80010200 - 0x800102FF</li>
 * </ul>
 * All other values are reserved.
 * 
 * @author Paul Whelan
 */
public enum Command {
	
	BIND_RECEIVER(0x00000001),
	BIND_TRANSMITTER(0x00000002),
	QUERY_SM(0x00000003),
	SUBMIT_SM(0x00000004),
	DELIVER_SM(0x00000005),
	UNBIND(0x00000006),
	REPLACE_SM(0x00000007),
	CANCEL_SM(0x00000008),
	BIND_TRANSCEIVER(0x00000009),
	OUTBIND(0x0000000B),
	ENQUIRE_LINK(0x000000015),
	SUBMIT_MULTI(0x000000021),
	ALERT_NOTIFICATION(0x00000102),
	DATA_SM(0x00000103),
	BROADCAST_SM(0x00000111),
	QUERY_BROADCAST_SM(0x00000112),
	CANCEL_BROADCAST_SM(0x00000113),
	GENERIC_NACK(0x80000000),
	BIND_RECEIVER_RESP(0x80000001),
	BIND_TRANSMITTER_RESP(0x80000002),
	QUERY_SM_RESP(0x80000003),
	SUBMIT_SM_RESP(0x80000004),
	DELIVER_SM_RESP(0x80000005),
	UNBIND_RESP(0x80000006),
	REPLACE_SM_RESP(0x80000007),
	CANCEL_SM_RESP(0x80000008),
	BIND_TRANSCEIVER_RESP(0x80000009),
	ENQUIRE_LINK_RESP(0x80000015),
	SUBMIT_MULTI_RESP(0x80000021),
	DATA_SM_RESP(0x80000103),
	BROADCAST_SM_RESP(0x80000111),
	QUERY_BROADCAST_SM_RESP(0x80000112),
	CANCEL_BROADCAST_SM_RESP(0x80000113);

	private int commandCode;

	private Command(int commandCode) {
		this.commandCode = commandCode;
	}
	
	/**
	 * Gets the command code associated with this {@link Command}.
	 * @return the command code for the {@link Command}, a command code
	 * uniquely identifies the PDU in SMPP.
	 */
	public int getCommandCode() {
		return this.commandCode;
	}
}