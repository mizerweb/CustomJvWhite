package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l53 {
    public final boolean a;
    public final boolean b;

    public l53(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l53)) {
            return false;
        }
        l53 l53Var = (l53) obj;
        return this.a == l53Var.a && this.b == l53Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qt4.o("LoadingState(hasPrev=", this.a, ", hasNext=", this.b, ")");
    }
}
