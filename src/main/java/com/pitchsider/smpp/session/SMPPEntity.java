package com.pitchsider.smpp.session;


/**
 * Outline the different types of Entities involved in SMPP.
 * 
 * @author Paul Whelan
 */
public enum SMPPEntity {

	/**
	 * External Short Message Entities, A ESME typically represents a fixed network SMS client, such as a WAP Proxy Server, E-
	 * Mail Gateway, or Voice Mail Server. It may also represent a Cell Broadcast Entity (CBE).
	 */
	ESMSE,
	
	/**
	 * A Message Centre (MC) is a generic term used to describe systems such as a Short
	 * Message Service Centre (SMSC), GSM Unstructured Supplementary Services Data (USSD)
	 * Server, or Cell Broadcast Centre (CBC).
	 */
	MC,

	/**
	 * A Routing Entity (RE) is a generic term for a network element that is utilized for MC to MC,
	 * and ESME to MC message routing. A RE has the ability to emulate the functionality
	 * associated with both a MC and an ESME. To an ESME, a RE appears as a MC and to a MC,
	 * a RE appears as an ESME. A carrier may utilise REs to hide a network of Message Centres,
	 * presenting only the REs as the external interface point for ESMEs.
	 */
	RE
}
