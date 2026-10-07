package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pd implements xd {
    public final boolean a;

    public pd(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pd) && this.a == ((pd) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("DisableAllRaiseHandsOnce(isSuccess=", ")", this.a);
    }
}
