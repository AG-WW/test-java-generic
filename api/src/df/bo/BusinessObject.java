package df.bo;

import df.repository.entry.value.EntryValue;

import java.util.Map;

/**
 * Todo - Question - Should the formatting / transformation be done at server end?  That might be very hard for file store local test client??
 */
public abstract class BusinessObject {
    byte[] payload;
    Map indexAttribute;

    public EntryValue getEntryValue() {
        return new EntryValue(payload, indexAttribute);
    }
}
