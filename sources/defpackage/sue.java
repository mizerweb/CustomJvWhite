package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sue {
    public final int a;
    public final int b;

    public sue(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sue)) {
            return false;
        }
        sue sueVar = (sue) obj;
        return this.a == sueVar.a && this.b == sueVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nbh.u("IconSize(width=", this.a, ", height=", this.b, ")");
    }
}
