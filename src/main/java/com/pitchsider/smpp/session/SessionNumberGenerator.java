package com.pitchsider.smpp.session;

/**
 * <p>
 * Sequence numbers are used throughout SMPP. Each response PDU must carry 
 * the sequence number used in the matching request. Every request must emanate 
 * from either the ESME or MC and the resulting response must emanate from the 
 * other party. So in effect, each SMPP session involves two sets of sequence numbers;
 * the set used by the ESME for ESME-originated requests and the set used by the MC 
 * for MC-originated requests. They can cross over each other in value, but will or 
 * should not be confused with each other.
 * </p>
 * <p>
 * Sequence numbers are designed for use within a single session. The recommended
 * approach is to begin each session with a sequence number of 1 and increase monotonically
 * from that point.
 * </p>
 * <p>
 * Each Connection will have its own {@link SessionNumberGenerator} so these are not Thread safe,
 * as in they are designed only to be accessed by one connection at a time. Do not share 
 * {@link SessionNumberGenerator}s across connections.
 * </p>
 * <p>
 * TODO: A MC that implements SMPP V3.4 or later must not generate message IDs greater 
 * than 8 octets when communicating with an ESME that supports SMPP V3.3 or
 * earlier.
 * </p>
 * 
 * @author Paul Whelan
 */
public class SessionNumberGenerator {

	public static long SEQUENCE_START=1L;
	
	private long currentSessionValue=SEQUENCE_START;
	
	/**
	 * Gets the next session number. This will post increment the value so the next
	 * call will be 1 greater.
	 * 
	 * @return a long containing the next session number.
	 */
	public long getNextSessionNumber() {
		return currentSessionValue++;
	}

	/**
	 * Sets the {@link SessionNumberGenerator} back to its initial state.
	 * This will set the sequence back to a starting point of one.
	 */
	public void reset() {
		currentSessionValue=SEQUENCE_START;
	}
}