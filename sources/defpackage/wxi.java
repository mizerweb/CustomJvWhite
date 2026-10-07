package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wxi {
    public final boolean a;
    public final boolean b;

    public wxi(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxi)) {
            return false;
        }
        wxi wxiVar = (wxi) obj;
        return this.a == wxiVar.a && this.b == wxiVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qt4.o("TorchState(isAvailable=", this.a, ", isEnabled=", this.b, ")");
    }
}
