package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wtg implements ytg {
    public final long a;

    public wtg(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wtg) && this.a == ((wtg) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "ChatList(ownerId=", ")");
    }
}
