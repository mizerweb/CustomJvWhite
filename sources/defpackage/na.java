package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class na {
    public final long a;
    public final long b;

    public na(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na)) {
            return false;
        }
        na naVar = (na) obj;
        return this.a == naVar.a && this.b == naVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
