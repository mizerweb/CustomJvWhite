package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rd implements xd {
    public final boolean a;
    public final boolean b;

    public rd(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd)) {
            return false;
        }
        rd rdVar = (rd) obj;
        return this.a == rdVar.a && this.b == rdVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qt4.o("DisableAllScreenSharingInCall(isSuccess=", this.a, ", isEnabled=", this.b, ")");
    }
}
