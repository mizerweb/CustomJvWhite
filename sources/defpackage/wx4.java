package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wx4 {
    public final boolean a;
    public final boolean b;

    public wx4(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx4)) {
            return false;
        }
        wx4 wx4Var = (wx4) obj;
        return this.a == wx4Var.a && this.b == wx4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qt4.o("CropToolbarState(isUndoEnabled=", this.a, ", isResetEnabled=", this.b, ")");
    }
}
