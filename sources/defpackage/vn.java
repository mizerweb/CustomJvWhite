package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vn {
    public final long a;

    public vn(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vn) && ew5.f(this.a, ((vn) obj).a);
    }

    public final int hashCode() {
        ghb ghbVar = ew5.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return c0a.o("AnrConfig(timeout=", ew5.t(this.a), ")");
    }
}
