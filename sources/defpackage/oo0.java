package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0 implements po0 {
    public final boolean a;

    public oo0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oo0) && this.a == ((oo0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("NotificationsPermissionChange(isGranted=", ")", this.a);
    }
}
