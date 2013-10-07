package com.pitchsider.smpp.pdu.session.states;

/**
 * A connected ESME has requested to bind as a Transmitter (by issuing a bind_transmitter
 * PDU) and has received a bind_transmitter_resp PDU from the MC authorising its bind
 * request. An ESME bound as a transmitter may send short messages to a MC for onward
 * delivery to a Mobile Station or to another ESME. The ESME may also replace, query or
 * cancel a previously submitted short message. 
 * 
 * @See Refer to section 2.4 of SMPP Spec V5 for a full list of applicable operations in Bound_TX state.
 * 
 * @author Paul Whelan
 *
 */
public class BoundTx extends AbstractState {

}
