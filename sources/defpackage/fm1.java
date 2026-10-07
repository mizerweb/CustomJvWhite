package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fm1 implements gm1 {
    public final boolean a;
    public final boolean b;

    public fm1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm1)) {
            return false;
        }
        fm1 fm1Var = (fm1) obj;
        return this.a == fm1Var.a && this.b == fm1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qt4.o("End(isCallAccepted=", this.a, ", goToActiveBeforeEnd=", this.b, ")");
    }
}
