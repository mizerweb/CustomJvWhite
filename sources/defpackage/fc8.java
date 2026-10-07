package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fc8 implements hc8 {
    public final boolean a;

    public fc8(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fc8) && this.a == ((fc8) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("Accepted(isVideo=", ")", this.a);
    }
}
