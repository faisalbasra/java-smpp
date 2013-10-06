package com.pitchsider.smpp.timer;


/**
 * <p>
 *    <strong>Required SMPP Session State:</strong> Open/Outbound.
 *    <br/>
 *    <strong>Action:</strong> Terminate network connection.
 * </p>
 * <p>
 * This timer specifies the time lapse allowed between a
 * network connection being established by an ESME 
 * and a bind_transmitter, bind_receiver or
 * bind_transceiver request being sent to the MC.
 * </p>
 * <p>
 * The timer can also be used by a MC supporting Outbind
 * and applied to the time interval between an Outbind
 * request being sent to an ESME and its response 
 * with a bind request. This timer can also be used by an 
 * ESME supporting Outbind where an ESME will close the MC-initiated 
 * connection within the defined period if the MC fails to send an Outbind 
 * request.
 * </p>
 * <p>
 * This timer should always be active on the MC and on ESMEs supporting Outbind.
 * </p>
 * </table>
 * 
 * TODO implement this
 * 
 * @author Paul whelan
 *
 */
public interface SessionInitTimer 
	extends Timer {

}
