package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mw4 implements sw4 {
    public final int a;
    public final int b;

    public mw4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw4)) {
            return false;
        }
        mw4 mw4Var = (mw4) obj;
        return this.a == mw4Var.a && this.b == mw4Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nbh.u("SetRatio(width=", this.a, ", height=", this.b, ")");
    }
}
