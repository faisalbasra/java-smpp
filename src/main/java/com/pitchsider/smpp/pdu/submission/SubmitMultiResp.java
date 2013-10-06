package com.pitchsider.smpp.pdu.submission;

/**
 * The MC response to a submit_multi PDU. This is similar to the
 * submit_sm_resp PDU. The main difference is that where some
 * of the specified recipients were either invalid or rejected by the
 * Message Centre, the PDU can specify the list of failed
 * recipients, appending a specific error code for each one,
 * indicating the reason the recipient was invalid. Also included is a
 * MC message_id that can be used in subsequent operations to
 * query, cancel or replace the contents of an undelivered
 * message.
 * 
 * @author Paul Whelan
 */
public class SubmitMultiResp {

}
