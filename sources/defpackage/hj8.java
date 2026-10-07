package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hj8 extends fj8 implements cu3 {
    public static final hj8 d = new hj8(1, 0, 1);

    @Override // defpackage.cu3
    public final Comparable a() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.cu3
    public final Comparable b() {
        return Integer.valueOf(this.b);
    }

    public final boolean c(int i) {
        return this.a <= i && i <= this.b;
    }

    @Override // defpackage.fj8
    public final boolean equals(Object obj) {
        if (!(obj instanceof hj8)) {
            return false;
        }
        if (isEmpty() && ((hj8) obj).isEmpty()) {
            return true;
        }
        hj8 hj8Var = (hj8) obj;
        return this.a == hj8Var.a && this.b == hj8Var.b;
    }

    @Override // defpackage.fj8
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.fj8, defpackage.cu3
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.fj8
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
