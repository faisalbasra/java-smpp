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
 * Each Connection will have its own {@link SessionNumberGenerator} so these are not Thread safe,
 * as in they are designed only to be accessed by one connection at a time. Do not share 
 * {@link SessionNumberGenerator}s across connections.
 * 
 * @author Paul Whelan
 */
public interface SessionNumberGenerator {

	/**
	 * Gets the next session number, each connection will have its own session number
	 * generator. This call is not Thread safe.  
	 * 
	 * @return
	 */
	public long getNextSessionNumber();
	
	/**
	 * Sets the {@link SessionNumberGenerator} back to its initial state
	 * for example setting a sequence back to a starting point of one for
	 * example. This call is not Thread safe.
	 */
	public void reset();
}