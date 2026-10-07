package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ld implements xd {
    public final boolean a;
    public final boolean b;

    public ld(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld)) {
            return false;
        }
        ld ldVar = (ld) obj;
        return this.a == ldVar.a && this.b == ldVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qt4.o("DisableAllCameraInCall(isSuccess=", this.a, ", isEnabled=", this.b, ")");
    }
}
