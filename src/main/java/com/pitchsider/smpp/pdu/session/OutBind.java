package com.pitchsider.smpp.pdu.session;

/**
 * Authentication PDU used by a Message Centre to Outbind to
 * an ESME to inform it that messages are present in the MC.
 * The PDU contains identification, and access password for the
 * ESME. If the ESME authenticates the request, it will respond
 * with a bind_receiver or bind_transceiver to begin the process
 * of binding into the MC.
 * 
 * @author Paul Whelan
 */
public class OutBind {

}
