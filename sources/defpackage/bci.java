package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bci {
    public final long a;

    public bci(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bci) && this.a == ((bci) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "UnknownContactState(contactId=", ")");
    }
}
