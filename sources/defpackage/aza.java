package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aza {
    public final long a;
    public final boolean b;

    public aza(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aza) {
            return this.a == ((aza) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
