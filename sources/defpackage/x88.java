package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class x88 implements Serializable {
    public static final x88 c = new x88(new int[0]);
    public final int[] a;
    public final int b;

    public x88(int[] iArr) {
        int length = iArr.length;
        this.a = iArr;
        this.b = length;
    }

    public static x88 d(int i) {
        return new x88(new int[]{i});
    }

    public static x88 e() {
        return new x88(new int[]{2, 3, 6});
    }

    public static x88 f(int i) {
        return new x88(new int[]{i, 6});
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0016 A[RETURN] */
    public final boolean a() {
        int i = 0;
        while (i < this.b) {
            if (this.a[i] == 6) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public final int b(int i) {
        lvb.U(i, this.b);
        return this.a[i];
    }

    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x88) {
            x88 x88Var = (x88) obj;
            int i = x88Var.b;
            int i2 = this.b;
            if (i2 == i) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (b(i3) == x88Var.b(i3)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int[] g() {
        return Arrays.copyOfRange(this.a, 0, this.b);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.a;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
