package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class md implements xd {
    public final boolean a;

    public md(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof md) && this.a == ((md) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("DisableAllCamerasOnce(isSuccess=", ")", this.a);
    }
}
