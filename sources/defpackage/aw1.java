package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aw1 {
    public final int a;
    public final tnh b;

    public aw1(int i, tnh tnhVar) {
        this.a = i;
        this.b = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw1)) {
            return false;
        }
        aw1 aw1Var = (aw1) obj;
        return this.a == aw1Var.a && this.b.equals(aw1Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.c) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ChipData(id=" + this.a + ", title=" + this.b + ")";
    }
}
