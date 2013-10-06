package com.pitchsider.smpp.timer;

/**
 * This interface defines the common methods for timers. There are multiple timers
 * defined for SMPP.
 * 
 * @author Paul Whelan
 */
public interface Timer {

	/**
	 * Sets the timer interval in milliseconds.
	 * 
	 * @param milliSeconds The timer interval in milliseconds.
	 */
	public void setTimerInterval(long milliSeconds);

	/**
	 * Gets the timer interval in milliseconds.
	 * 
	 * @return The timer interval in milliseconds.
	 */
	public long getTimerInterval();
}
