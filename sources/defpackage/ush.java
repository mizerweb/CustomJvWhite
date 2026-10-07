package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class ush {
    public static final qsh a = new qsh();
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        String str = vqi.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
        d = Integer.toString(2, 36);
    }

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, rsh rshVar, tsh tshVar, int i2, boolean z) {
        int i3 = f(i, rshVar, false).c;
        if (m(i3, tshVar, 0L).n != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return m(iE, tshVar, 0L).m;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        c.t();
        return 0;
    }

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof ush) {
                ush ushVar = (ush) obj;
                if (ushVar.o() == o() && ushVar.h() == h()) {
                    tsh tshVar = new tsh();
                    rsh rshVar = new rsh();
                    tsh tshVar2 = new tsh();
                    rsh rshVar2 = new rsh();
                    for (int i = 0; i < o(); i++) {
                        if (m(i, tshVar, 0L).equals(ushVar.m(i, tshVar2, 0L))) {
                        }
                    }
                    for (int i2 = 0; i2 < h(); i2++) {
                        if (f(i2, rshVar, true).equals(ushVar.f(i2, rshVar2, true))) {
                        }
                    }
                    int iA = a(true);
                    if (iA == ushVar.a(true) && (iC = c(true)) == ushVar.c(true)) {
                        while (iA != iC) {
                            int iE = e(iA, 0, true);
                            if (iE == ushVar.e(iA, 0, true)) {
                                iA = iE;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract rsh f(int i, rsh rshVar, boolean z);

    public rsh g(Object obj, rsh rshVar) {
        return f(b(obj), rshVar, true);
    }

    public abstract int h();

    public int hashCode() {
        tsh tshVar = new tsh();
        rsh rshVar = new rsh();
        int iO = o() + 217;
        for (int i = 0; i < o(); i++) {
            iO = (iO * 31) + m(i, tshVar, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            iH = (iH * 31) + f(i2, rshVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(tsh tshVar, rsh rshVar, int i, long j) {
        Pair pairJ = j(tshVar, rshVar, i, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(tsh tshVar, rsh rshVar, int i, long j, long j2) {
        lvb.U(i, o());
        m(i, tshVar, j2);
        if (j == -9223372036854775807L) {
            j = tshVar.k;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = tshVar.m;
        f(i2, rshVar, false);
        while (i2 < tshVar.n && rshVar.e != j) {
            int i3 = i2 + 1;
            if (f(i3, rshVar, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, rshVar, true);
        long jMin = j - rshVar.e;
        long j3 = rshVar.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = rshVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        c.t();
        return 0;
    }

    public abstract Object l(int i);

    public abstract tsh m(int i, tsh tshVar, long j);

    public final void n(int i, tsh tshVar) {
        m(i, tshVar, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
