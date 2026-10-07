package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u1e implements v1e {
    public final long a;

    public u1e(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1e) && ew5.f(this.a, ((u1e) obj).a);
    }

    public final int hashCode() {
        ghb ghbVar = ew5.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return c0a.o("TakePhoto(captureTimeout=", ew5.t(this.a), ")");
    }
}
