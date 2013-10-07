package com.pitchsider.smpp.pdu.session.states;

/**
 * A connected ESME has requested to bind as a Transceiver (by issuing a bind_transceiver
 * PDU) and has received a bind_transceiver_resp PDU from the MC authorising its Bind
 * request. An ESME bound as a Transceiver is authorised to use all operations supported by a
 * Transmitter ESME and a Receiver ESME. A transceiver session is effectively the
 * combination of a Transmitter and a Receiver session.
 * Thus an ESME bound as a transceiver may send short messages to a MC for onward
 * delivery to a Mobile Station or to another ESME and may also receive short messages from a
 * MC, which may be originated by a mobile station, by another ESME or by the MC itself (for 
 * example a MC delivery receipt).  
 * @See Refer to section 2.4 of SMPP Spec V5 for a full list of applicable operations in Bound_TRX state.
 * 
 * @author Paul Whelan
 *
 */
public class BoundTrx extends AbstractState {

}
