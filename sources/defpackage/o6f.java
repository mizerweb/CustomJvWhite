package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o6f extends ji3 {
    public final boolean a;

    public o6f(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6f) && this.a == ((o6f) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("ScrollToTop(afterPin=", ")", this.a);
    }
}
