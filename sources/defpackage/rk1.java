package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rk1 extends uk1 {
    public final long b;

    public rk1(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rk1) && this.b == ((rk1) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return nbh.s(this.b, "OpenChat(chatLocalId=", ")");
    }
}
