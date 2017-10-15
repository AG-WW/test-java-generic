package df.repository.entry.moniker;

import df.repository.entry.moniker.legalentity.LegalEntityCode;

import java.util.Objects;

public final class Moniker implements Locatable {
    String area;
    String audience;
    String type;
    LegalEntityCode legalEntityCode;
    Long effectAt;
    String monikerValue;

    public Moniker(String area, String audience, String type, LegalEntityCode legalEntityCode) {
        this(area, audience, type, legalEntityCode, null);
    }

    public Moniker(String area, String audience, String type, LegalEntityCode legalEntityCode, Long effectAt) {
        this.area = area;
        this.audience = audience;
        this.type = type;
        this.legalEntityCode = legalEntityCode;
        this.effectAt = effectAt;
        if (this.effectAt == null) {
            this.monikerValue = this.area + "." + this.type + "." + this.audience + "." + this.legalEntityCode;
        } else {
            this.monikerValue = this.area + "." + this.type + "." + this.audience + "." + this.legalEntityCode + "@" + this.effectAt;
        }
    }

    @Override
    public String value() {
        return monikerValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Moniker)) return false;
        Moniker moniker = (Moniker) o;
        return Objects.equals(monikerValue, moniker.monikerValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monikerValue);
    }

    @Override
    public String toString() {
        return "Moniker{" +
                "area='" + area + '\'' +
                ", audience='" + audience + '\'' +
                ", type='" + type + '\'' +
                ", legalEntityCode=" + legalEntityCode +
                ", effectAt=" + effectAt +
                ", monikerValue='" + monikerValue + '\'' +
                '}';
    }
}
