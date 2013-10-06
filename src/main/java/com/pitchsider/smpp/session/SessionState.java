package com.pitchsider.smpp.session;

import com.pitchsider.smpp.pdu.session.OutBind;

/**
 * An ESME begins a session by connecting to the MC across TCP/IP or X.25. 
 * This connection is referred to as a SMPP session and can have several 
 * states. This enum outlines what those states are.
 * 
 * @author Paul Whelan
 */
public enum SessionState {

	/**
	 * An ESME has established a network connection to the MC but has not yet issued a Bind
	 * request. The MC is only aware of the TCP/IP or X.25 connection. No identification details
	 * have yet been exchanged.
	 */
	OPEN,
	
	/**
	 * A connected ESME has requested to bind as a Transmitter (by issuing a bind_transmitter
	 * PDU) and has received a bind_transmitter_resp PDU from the MC authorising its bind
	 * request. An ESME bound as a transmitter may send short messages to a MC for onward
	 * delivery to a Mobile Station or to another ESME. The ESME may also replace, query or
	 * cancel a previously submitted short message.
	 */
	BOUND_TX,
	
	/**
	 * A connected ESME has requested to bind as a Receiver (by issuing a bind_receiver PDU)
	 * and has received a bind_receiver_resp PDU from the MC authorising its Bind request.
	 * An ESME bound as a receiver may receive short messages from a MC, which may be
	 * originated, by a mobile station, by another ESME or by the MC itself (for example a MC
	 * delivery receipt).
	 */
	BOUND_RX,
	
	/**
	 * <p>A connected ESME has requested to bind as a Transceiver (by issuing a bind_transceiver
	 * PDU) and has received a bind_transceiver_resp PDU from the MC authorising its Bind
	 * request. An ESME bound as a Transceiver is authorised to use all operations supported by a
	 * Transmitter ESME and a Receiver ESME. A transceiver session is effectively the
	 * combination of a Transmitter and a Receiver session.</p>
	 * <p>Thus an ESME bound as a transceiver may send short messages to a MC for onward
	 * delivery to a Mobile Station or to another ESME and may also receive short messages from a
	 * MC, which may be originated by a mobile station, by another ESME or by the MC itself (for
	 * example a MC delivery receipt).</p>
	 */
	BOUND_TRX,
	
	/**
	 * An ESME bound as a TX, RX or TRX. ESME has issued an unbind request to the MC
	 * requesting termination of the SMPP session. The MC may also issue an unbind request to
	 * the ESME. The receiving peer will then respond with an unbind_resp PDU acknowledging the
	 * request to end the session.
	 */
	UNBOUND,
	
	/**
	 * The ESME or MC has closed the network connection. This typically results as follow-on to an
	 * Unbound state where one peer has requested termination of the session. Closed state can
	 * also result from either peer terminating the connection unexpectedly or due to a
	 * communications error within the underlying network that results in termination of the network
	 * connection.
	 */
	CLOSED,

	/**
	 * The purpose of the outbind operation is to allow the MC initiate a SMPP session. A typical
	 * example of where such a facility might be applicable would be where the MC had outstanding
	 * messages for delivery to the ESME. When an ESME receives a {@link OutBind} its in this state.
	 */
	OUTBOUND,
}
