package com.pitchsider.smpp.timer;


/**
 * <p>
 *    <strong>Required SMPP Session State:</strong> Bound_TX/Bound_RX/Bound_TRX.
 *    <br/>
 *    <strong>Action:</strong> The SMPP session should be dropped.
 * </p>
 * <p>
 * This timer specifies the maximum time lapse allowed between transactions, 
 * after which period of inactivity, a SMPP entity may assume that the
 * session is no longer active. The resulting behaviour is to either close the 
 * session or issue an unbind request.
 * </p>
 * <p>
 * This timer may be active on either peer (i.e. MC or ESME)
 * </p>
 * 
 * @author Paul Whelan
 */
public interface InactivityTimer 
	extends Timer {

}
