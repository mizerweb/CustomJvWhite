package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o9f implements q9f {
    public final boolean a;

    public o9f(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o9f) && this.a == ((o9f) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("Show(openWithAnimation=", ")", this.a);
    }
}
