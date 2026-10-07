package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lf8 {
    public final tw5 a;
    public final pni b;

    public lf8(tw5 tw5Var, pni pniVar) {
        this.a = tw5Var;
        this.b = pniVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf8)) {
            return false;
        }
        lf8 lf8Var = (lf8) obj;
        return this.a == lf8Var.a && this.b == lf8Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InitCompletedArgs(diskCache=" + this.a + ", onResult=" + this.b + ")";
    }
}
