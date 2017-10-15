package df.repository.entry.moniker;

public interface Locatable {
    String value();

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();

    @Override
    String toString();

}
