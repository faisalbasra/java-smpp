package com.pitchsider.smpp.pdu.session.states;

/**
 * A connected ESME has requested to bind as a Receiver (by issuing a bind_receiver PDU)
 * and has received a bind_receiver_resp PDU from the MC authorising its Bind request.
 * An ESME bound as a receiver may receive short messages from a MC, which may be
 * originated, by a mobile station, by another ESME or by the MC itself (for example a MC
 * delivery receipt).
 * 
 * @See Refer to section 2.4 of SMPP Spec V5 for a full list of applicable operations in Bound_RX state.
 * 
 * @author Paul Whelan
 *
 */
public class BoundRx extends AbstractState {

}
