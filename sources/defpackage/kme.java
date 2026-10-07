package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kme {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof kme) {
            return this.a == ((kme) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "RequestNumber(value=" + this.a + ')';
    }
}
