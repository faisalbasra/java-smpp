package com.pitchsider.smpp.timer;


/**
 * <p>
 *    <strong>Required SMPP Session State:</strong> Open/Unbound/Outbound/Bound_TX/Bound_RX/Bound_TRX.
 *    <br/>
 *    <strong>Action:</strong> An enquire_link request should be initiated.
 * </p>
 * <p>This timer specifies the time lapse allowed between operations after which a
 * SMPP entity should interrogate whether its’ peer still has an active session. This 
 * timer may be active on either peer (i.e. MC or ESME).
 * </p>
 * TODO implement this timer 
 * @author Paul Whelan
 */
public interface EnquireLinkTimer 
	extends Timer {

}
