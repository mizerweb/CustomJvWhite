package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q9e extends jnl {
    public final boolean a;

    public q9e(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q9e) && this.a == ((q9e) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("Online(online=", ")", this.a);
    }
}
