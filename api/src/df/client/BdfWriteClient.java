package df.client;

import df.bo.BusinessObject;
import df.repository.entry.moniker.Moniker;

public class BdfWriteClient<V extends BusinessObject> {
    private BdfWriteClient() {

    }

    public void publish(Moniker moniker, V value) {
        return;
    }

    private static <V> BdfWriteClient instance() {
        return new BdfWriteClient();
    }

}

