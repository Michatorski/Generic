package org.iesfm.generic.serializer;

public interface Deserializer<T> {
    T deserialize(String value);
}
