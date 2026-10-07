package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kud extends qud {
    public final long a;

    public kud(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kud) && this.a == ((kud) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "ShowContactAddDialog(contactId=", ")");
    }
}
