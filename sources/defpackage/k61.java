package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k61 {
    public final boolean a;
    public final boolean b;

    public k61(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k61)) {
            return false;
        }
        k61 k61Var = (k61) obj;
        return this.a == k61Var.a && this.b == k61Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qt4.o("ButtonsState(isLeftButtonActive=", this.a, ", isRightButtonActive=", this.b, ")");
    }
}
