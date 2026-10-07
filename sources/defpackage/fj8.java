package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class fj8 implements Iterable, uv8 {
    public final int a;
    public final int b;
    public final int c;

    public fj8(int i, int i2, int i3) {
        if (i3 == 0) {
            ore.p("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            ore.p("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.a = i;
        this.b = wk8.s(i, i2, i3);
        this.c = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof fj8)) {
            return false;
        }
        if (isEmpty() && ((fj8) obj).isEmpty()) {
            return true;
        }
        fj8 fj8Var = (fj8) obj;
        return this.a == fj8Var.a && this.b == fj8Var.b && this.c == fj8Var.c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public boolean isEmpty() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.a;
        if (i2 > 0) {
            return i3 > i;
        }
        return i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new gj8(this.a, this.b, this.c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.a;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
