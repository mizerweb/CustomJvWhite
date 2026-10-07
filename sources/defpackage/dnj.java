package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dnj implements ynj {
    public final boolean a;

    public dnj(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnj) && this.a == ((dnj) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("CloseScreen(isFromBridge=", ")", this.a);
    }
}
