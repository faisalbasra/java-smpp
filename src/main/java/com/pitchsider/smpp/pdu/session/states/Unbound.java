package com.pitchsider.smpp.pdu.session.states;

/**
 * An ESME bound as a TX, RX or TRX ESME has issued an unbind request to the MC
 * requesting termination of the SMPP session. The MC may also issue an unbind request to
 * the ESME. The receiving peer will then respond with an unbind_resp PDU acknowledging the
 * request to end the session.
 * 
 * @author Paul Whelan
 */
public class Unbound extends AbstractState {

}
