package com.codestream.thunder.core;

import java.nio.ByteBuffer;

import com.codestream.thunder.exceptions.SerializationException;

public interface Serializer<T> {
	
	T readFromBuffer(ByteBuffer buffer) throws SerializationException;
	
	T writeToBuffer(ByteBuffer buffer, T value) throws SerializationException;
	
	void cleanBuffer(ByteBuffer buffer) throws SerializationException;
}
