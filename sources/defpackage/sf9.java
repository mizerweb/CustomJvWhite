package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sf9 extends yf9 {
    public final tnh d;

    public sf9(tnh tnhVar) {
        super(tnhVar, null);
        this.d = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sf9) && this.d.equals(((sf9) obj).d);
    }

    public final int hashCode() {
        return Integer.hashCode(this.d.c);
    }

    public final String toString() {
        return x05.g("AlreadyInThisProfile(title=", this.d, ")");
    }
}
