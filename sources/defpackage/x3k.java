package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class x3k {
    public int b = 0;
    public final boolean[] a = new boolean[xn0.values().length];

    public final boolean a(xn0 xn0Var, boolean z) {
        int iOrdinal = xn0Var.ordinal();
        boolean[] zArr = this.a;
        boolean z2 = zArr[iOrdinal];
        zArr[xn0Var.ordinal()] = z;
        if (z2 == z) {
            return false;
        }
        this.b += z ? 1 : -1;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x3k.class == obj.getClass()) {
            x3k x3kVar = (x3k) obj;
            if (this.b == x3kVar.b && Arrays.equals(this.a, x3kVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
