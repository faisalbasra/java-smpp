package com.pitchsider.smpp.pdu.ancillary.submission;

/**
 * This PDU is used to cancel a previously submitted message.
 * The PDU contains the source address of the original
 * message and the message_id returned in the original
 * submit_sm_resp, submit_multi_resp or data_sm_resp PDU.
 * This PDU may also omit the message_id and instead contain
 * a source address, destination address and optional
 * service_type field as a means of cancelling a range of
 * messages sent from one address to another.
 * 
 * @author Paul Whelan
 */
public class CancelSm {

}
