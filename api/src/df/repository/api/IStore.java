package df.repository.api;

import df.repository.entry.id.EntityId;
import df.repository.entry.moniker.Moniker;
import df.repository.entry.value.EntryValue;

import java.util.Map;

public interface IStore extends ICache {
    void putAll(Map<Moniker, EntryValue> entries);

    EntityId syncPut(Moniker moniker, EntryValue entryValue);
}
