package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zi4 implements ej4 {
    public final long a;

    public zi4(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zi4) && this.a == ((zi4) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "HideStoriesFailed(contactId=", ")");
    }
}
