package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qd implements xd {
    public final boolean a;

    public qd(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qd) && this.a == ((qd) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return qv1.m("DisableAllScreenRecordInCall(isSuccess=true, isEnabled=", ")", this.a);
    }
}
