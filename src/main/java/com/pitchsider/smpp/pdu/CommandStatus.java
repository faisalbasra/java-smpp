package com.pitchsider.smpp.pdu;

import java.util.HashMap;
import java.util.Map;

/**
 * Allows response messages to contain a status for a received {@link Command}.
 * TODO allow fast lookup of {@link CommandStatus} by storing a map to enum value here.
 * @author Paul Whelan
 */
public enum CommandStatus {

	
	/**
	 * If a SMPP entity receives an unrecognized PDU/command, it must return a 
	 * generic_nack PDU with the command_status field set to ESME_RINVCMDID.
	 */
	//ESME_RINVCMDID

	//temp placeholder only
	ESME_RINVCMDID(0);
	
	int status;

	static Map<Integer, CommandStatus> statuses = new HashMap<>();
	
	private CommandStatus(int status) {
		this.status = status;
	}
	
	/**
	 * Gets the status value for a CommandStatus.
	 * 
	 * @return
	 */
	public int getStatusValue() {
		return this.status;
	}
	
}
