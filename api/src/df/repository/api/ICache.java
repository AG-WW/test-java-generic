package df.repository.api;

import df.repository.entry.id.EntityId;
import df.repository.entry.value.EntryValue;

import java.util.Map;

public interface ICache extends IRepository<EntityId, EntryValue> {
    <V> V get(K theKey);

    <V> Iterable<V> getAll(Iterable<K> theKey);

    <K> K put(K theKey, V theValue);

    void putAll(Map<K, V> theMap);


}
