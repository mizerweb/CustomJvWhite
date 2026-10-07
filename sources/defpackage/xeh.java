package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xeh {
    public final int a;
    public final int b;

    public xeh(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xeh)) {
            return false;
        }
        xeh xehVar = (xeh) obj;
        return this.a == xehVar.a && this.b == xehVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + zo5.c(this.a, Integer.hashCode(-1) * 31, 31);
    }

    public final String toString() {
        return nbh.u("ThumbColors(checked=-1, unchecked=", this.a, ", disabledUnchecked=", this.b, ")");
    }
}
