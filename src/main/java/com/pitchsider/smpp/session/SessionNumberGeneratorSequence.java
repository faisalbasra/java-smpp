package com.pitchsider.smpp.session;

/**
 * Sequence numbers are used throughout SMPP. Each response PDU must carry 
 * the sequence number used in the matching request. Every request must emanate 
 * from either the ESME or MC and the resulting response must emanate from the 
 * other party. So in effect, each SMPP session involves two sets of sequence numbers;
 * the set used by the ESME for ESME-originated requests and the set used by the MC 
 * for MC-originated requests. They can cross over each other in value, but will or 
 * should not be confused with each other.
 * 
 * Sequence numbers are designed for use within a single session. The recommended
 * approach is to begin each session with a sequence number of 1 and increase monotonically
 * from that point.
 * 
 * @author Paul Whelan
 */
public class SessionNumberGeneratorSequence
	implements SessionNumberGenerator {

	private static long STARTING_LONG=1l;
	
	private long currentSessionValue=STARTING_LONG;
	
	public long getNextSessionNumber() {
		return currentSessionValue++;
	}

	public void reset() {
		currentSessionValue=STARTING_LONG;
	}
}
