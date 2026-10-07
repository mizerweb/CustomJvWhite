package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gzc implements jzc {
    public final long a;

    public gzc(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gzc) && this.a == ((gzc) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "ContactAddDialog(contactId=", ")");
    }
}
