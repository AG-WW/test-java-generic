package df.repository.entry.id;

public interface Identifiable {
    String value();

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();

    @Override
    String toString();


}
