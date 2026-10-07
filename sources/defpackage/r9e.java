package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r9e extends jnl {
    public final boolean a;

    public r9e(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r9e) && this.a == ((r9e) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("Verified(verified=", ")", this.a);
    }
}
