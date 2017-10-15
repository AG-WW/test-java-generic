package df.repository;

import df.repository.api.IStore;
import df.repository.entry.id.EntityId;

public class RepositoryMgr implements IStore {


    @Override
    public void put(String area, String audience, String type, String identifier, Object value) {

    }

    @Override
    public EntityId syncPut(String area, String audience, String type, String identifier, Object value) {
        return null;
    }

    @Override
    public Object get(EntityId entityId) {
        return null;
    }

    @Override
    public Object[] getAll(EntityId[] entityIds) {
        return new Object[0];
    }
}
