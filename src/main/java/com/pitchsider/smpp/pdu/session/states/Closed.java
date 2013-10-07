package com.pitchsider.smpp.pdu.session.states;

/**
 * The ESME or MC has closed the network connection. This typically results as follow-on to an
 * Unbound state where one peer has requested termination of the session. Closed state can
 * also result from either peer terminating the connection unexpectedly or due to a
 * communications error within the underlying network that results in termination of the network
 * connection.
 *  
 * @author Paul Whelan
 */
public class Closed extends AbstractState {

}
