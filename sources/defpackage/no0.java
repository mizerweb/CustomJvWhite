package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class no0 implements po0 {
    public final boolean a;

    public no0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof no0) && this.a == ((no0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("ContactsPermissionChange(isGranted=", ")", this.a);
    }
}
