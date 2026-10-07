package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xtf {
    public final tnh a;
    public final int b;

    public xtf(int i, tnh tnhVar) {
        this.a = tnhVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtf)) {
            return false;
        }
        xtf xtfVar = (xtf) obj;
        return this.a.equals(xtfVar.a) && this.b == xtfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + zo5.c(this.b, Integer.hashCode(this.a.c) * 31, 31);
    }

    public final String toString() {
        return "Button(title=" + this.a + ", id=" + this.b + ", isNegative=false)";
    }
}
