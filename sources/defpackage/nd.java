package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nd implements xd {
    public final boolean a;
    public final boolean b;

    public nd(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd)) {
            return false;
        }
        nd ndVar = (nd) obj;
        return this.a == ndVar.a && this.b == ndVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qt4.o("DisableAllMicInCall(isSuccess=", this.a, ", isEnabled=", this.b, ")");
    }
}
