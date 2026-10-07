package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bj4 implements ej4 {
    public final long a;

    public bj4(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bj4) && this.a == ((bj4) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "NotFound(contactId=", ")");
    }
}
