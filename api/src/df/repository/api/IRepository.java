package df.repository.api;

import df.repository.entry.id.Identifiable;
import df.repository.entry.value.IEntryValue;

public interface IRepository<K extends Identifiable, V extends IEntryValue> {
    V get(K key);

    Iterable<V> getAll(Iterable<V> keys);
}
