package df.repository.api.impl;

import df.repository.api.ICache;
import df.repository.entry.id.EntityId;

public class RemoteCache implements ICache {
    @Override
    public Object get(EntityId entityId) {
        return null;
    }

    @Override
    public Object[] getAll(EntityId[] entityIds) {
        return new Object[0];
    }

}
