package df.repository.entry.value;

import java.util.Map;

public class EntryValue implements IEntryValue {
    Map indexAttributes;
    byte[] payload;

    public EntryValue(byte[] payload, Map indexAttributes) {
        this.indexAttributes = indexAttributes;
        this.payload = payload;
    }
}
