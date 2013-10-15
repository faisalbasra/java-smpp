package com.pitchsider.smpp.parameter;

import org.junit.Assert;
import org.junit.Test;


/**
 * <strong>Examples From Spec</strong>
 * 
 * <pre>
 *  Tag=0x130C
 *  Length=0x0001
 *  Value=0x01
 *  Encoded Format: 0x130C000101
 *  
 *  Tag=0x130C
 *  Length=0x0000
 *  Value=NULL
 *  Encoded Format: 0x130C0000
 * </pre>
 *   
 * @author Paul Whelan
 *
 */
public class TaggedLengthValueTest {

	@Test
	public void testExampleOne() {
		final byte[] expectedBytes = new byte[] {0x13 ,0x0C ,0x00, 0x01 ,0x01};
		TaggedLengthValue taggedLengthValue = new TaggedLengthValue();
		
		taggedLengthValue.read(expectedBytes);
		Assert.assertArrayEquals(new byte[]{0x13,0x0C}, taggedLengthValue.getTag());
		Assert.assertArrayEquals(new byte[]{0x00,0x01}, taggedLengthValue.getLength());
		Assert.assertArrayEquals(new byte[]{0x01}, taggedLengthValue.getValue());
		
		byte[] actualBytes = taggedLengthValue.write();
		Assert.assertArrayEquals(expectedBytes, actualBytes);
	}
	
	@Test
	public void testExampleTwo() {
		final byte[] expectedBytes = new byte[] {0x13,0x0C,0x00,0x00};
		TaggedLengthValue taggedLengthValue = new TaggedLengthValue();
		taggedLengthValue.read(expectedBytes);
		Assert.assertArrayEquals(new byte[]{0x13,0x0C}, taggedLengthValue.getTag());
		Assert.assertArrayEquals(new byte[]{0x00,0x00}, taggedLengthValue.getLength());
		Assert.assertArrayEquals(new byte[]{}, taggedLengthValue.getValue());
		byte[] actualBytes = taggedLengthValue.write();
		Assert.assertArrayEquals(expectedBytes, actualBytes);
	}


	
}
