package df.client;

import df.bo.BusinessObject;
import df.repository.entry.moniker.Moniker;

public class BdfModifyClient<V extends BusinessObject> {
    private BdfModifyClient() {

    }

    public void publishCorrection(Moniker moniker, V value) {
        return;
    }

    public BdfModifyClient<V> instance() {
        return new BdfModifyClient();
    }
}

