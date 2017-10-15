package df.repository.entry.moniker.legalentity;

public interface LegalEntityCode {
    String value();

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();

    @Override
    String toString();


}
