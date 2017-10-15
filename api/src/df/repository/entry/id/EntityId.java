package df.repository.entry.id;

import df.repository.entry.value.IEntryValue;

import java.util.Objects;

/**
 * Better than a simple long to represent an EntityId as it may help easy debugging.
 * Especially when one tries to get the object from an incorrect client.
 */
public final class EntityId implements Identifiable, IEntryValue {
    String type;
    long id;
    String idValue;

    public EntityId(String type, long id) {
        this.type = type;
        this.id = id;
        this.idValue = this.type + "." + this.id;
    }

    private EntityId(String type, long id, String idValue) {

    }

    @Override
    public String value() {
        return idValue;
    }

    static EntityId parse(String idValue) {
        int lastDotIndex = idValue.lastIndexOf(".");
        long id = Long.parseLong(idValue.substring(lastDotIndex + 1));
        String type = idValue.substring(0, lastDotIndex);
        return new EntityId(type, id, idValue);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EntityId)) return false;
        EntityId entityId = (EntityId) o;
        return Objects.equals(idValue, entityId.idValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idValue);
    }

    @Override
    public String toString() {
        return "EntityId{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", idValue='" + idValue + '\'' +
                '}';
    }
}
