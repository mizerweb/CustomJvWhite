package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pxc {
    public final boolean a;

    public pxc(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pxc) && this.a == ((pxc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("OnlineStatus(isOnline=", ")", this.a);
    }
}
