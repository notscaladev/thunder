package com.codestream.thunder.core;

import java.nio.ByteBuffer;

public interface Serializer<T> {
	
	T readFromBuffer(ByteBuffer buffer);
	
	T writeToBuffer(ByteBuffer buffer, T value);
	
	void cleanBuffer(ByteBuffer buffer);
}
