package com.pitchsider.smpp.timer;


/**
 * <p>
 *    <strong>Required SMPP Session State:</strong> Open/Unbound/Outbound/Bound_TX/Bound_RX/Bound_TRX.
 *    <br/>
 *    <strong>Action:</strong> Given operation assumed to have failed.
 * </p>
 * <p>
 * This timer specifies the time lapse allowed between a SMPP request and the
 * corresponding SMPP response. This timer may be active on either communicating
 * SMPP entity (i.e. MC or ESME).
 * </p>
 * @author Paul Whelan
 */
public interface ResponseTimer 
	extends Timer {

}
