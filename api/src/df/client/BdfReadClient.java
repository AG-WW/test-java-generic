package df.client;

import df.bo.BusinessObject;
import df.bo.EquitiesVolSurface;
import df.repository.entry.id.EntityId;
import df.repository.entry.moniker.Moniker;
import df.repository.entry.query.IQuery;

public class BdfReadClient<V extends BusinessObject> {
    private BdfReadClient() {

    }

    public EntityId getId(Moniker moniker) {
        return null;
    }

    public Iterable<EntityId> getIds(IQuery query) {
        return null;
    }

    public V getValue(EntityId entityId) {
        return null;
    }

    public Iterable<V> getValues(EntityId[] entityIds) {
        return null;
    }

    public Iterable<V> find(String queries) {
        return null;
    }

    public int subscribeToLatest(IQuery query) {
        return -1;
    }

    public void unSubscribe(int subscriptionId) {
        return;
    }

    private static <V> BdfReadClient instance() {
        return new BdfReadClient();
    }


    public static void main(String[] args) {
        //BdfReadClient<Integer> theClient = BdfReadClient.instance(); //look this does not work which is good
        BdfReadClient<EquitiesVolSurface> theClient = BdfReadClient.instance();
        EquitiesVolSurface s = theClient.getValue(null);
    }

}

