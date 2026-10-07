package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class od implements xd {
    public final boolean a;

    public od(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof od) && this.a == ((od) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("DisableAllMicOnce(isSuccess=", ")", this.a);
    }
}
