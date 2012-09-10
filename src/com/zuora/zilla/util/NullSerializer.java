package com.zuora.zilla.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

/**
 * This is just the null serializer class to be used by Jackson in
 * order to replace all 'null' values by an empty string.
 */
public class NullSerializer extends JsonSerializer<Object> {
	public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		jgen.writeString("");
	}
}