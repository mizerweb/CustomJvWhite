package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rrj implements hs8 {
    public final boolean a;

    public rrj(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rrj) && this.a == ((rrj) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("ShowBackButton(isVisible=", ")", this.a);
    }
}
