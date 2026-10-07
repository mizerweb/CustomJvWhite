package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l0 extends ush {
    public static final /* synthetic */ int g = 0;
    public final int e;
    public final e4g f;

    public l0(e4g e4gVar) {
        this.f = e4gVar;
        this.e = e4gVar.b.length;
    }

    @Override // defpackage.ush
    public final int a(boolean z) {
        if (this.e != 0) {
            int iW = 0;
            if (z) {
                int[] iArr = this.f.b;
                iW = iArr.length > 0 ? iArr[0] : -1;
            }
            while (y(iW).p()) {
                iW = w(iW, z);
                if (iW == -1) {
                }
            }
            return y(iW).a(z) + v(iW);
        }
        return -1;
    }

    @Override // defpackage.ush
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        if (iQ == -1 || (iB = y(iQ).b(obj3)) == -1) {
            return -1;
        }
        return u(iQ) + iB;
    }

    @Override // defpackage.ush
    public final int c(boolean z) {
        int iX;
        int i = this.e;
        if (i != 0) {
            if (z) {
                int[] iArr = this.f.b;
                iX = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iX = i - 1;
            }
            while (y(iX).p()) {
                iX = x(iX, z);
                if (iX == -1) {
                }
            }
            return y(iX).c(z) + v(iX);
        }
        return -1;
    }

    @Override // defpackage.ush
    public final int e(int i, int i2, boolean z) {
        int iS = s(i);
        int iV = v(iS);
        int iE = y(iS).e(i - iV, i2 == 2 ? 0 : i2, z);
        if (iE != -1) {
            return iV + iE;
        }
        int iW = w(iS, z);
        while (iW != -1 && y(iW).p()) {
            iW = w(iW, z);
        }
        if (iW != -1) {
            return y(iW).a(z) + v(iW);
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // defpackage.ush
    public final rsh f(int i, rsh rshVar, boolean z) {
        int iR = r(i);
        int iV = v(iR);
        y(iR).f(i - u(iR), rshVar, z);
        rshVar.c += iV;
        if (z) {
            Object objT = t(iR);
            Object obj = rshVar.b;
            obj.getClass();
            rshVar.b = Pair.create(objT, obj);
        }
        return rshVar;
    }

    @Override // defpackage.ush
    public final rsh g(Object obj, rsh rshVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        int iV = v(iQ);
        y(iQ).g(obj3, rshVar);
        rshVar.c += iV;
        rshVar.b = obj;
        return rshVar;
    }

    @Override // defpackage.ush
    public final int k(int i, int i2, boolean z) {
        int iS = s(i);
        int iV = v(iS);
        int iK = y(iS).k(i - iV, i2 == 2 ? 0 : i2, z);
        if (iK != -1) {
            return iV + iK;
        }
        int iX = x(iS, z);
        while (iX != -1 && y(iX).p()) {
            iX = x(iX, z);
        }
        if (iX != -1) {
            return y(iX).c(z) + v(iX);
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // defpackage.ush
    public final Object l(int i) {
        int iR = r(i);
        return Pair.create(t(iR), y(iR).l(i - u(iR)));
    }

    @Override // defpackage.ush
    public final tsh m(int i, tsh tshVar, long j) {
        int iS = s(i);
        int iV = v(iS);
        int iU = u(iS);
        y(iS).m(i - iV, tshVar, j);
        Object objT = t(iS);
        Object obj = tsh.p;
        Object obj2 = tshVar.a;
        if (obj != obj2) {
            objT = Pair.create(objT, obj2);
        }
        tshVar.a = objT;
        tshVar.m += iU;
        tshVar.n += iU;
        return tshVar;
    }

    public abstract int q(Object obj);

    public abstract int r(int i);

    public abstract int s(int i);

    public abstract Object t(int i);

    public abstract int u(int i);

    public abstract int v(int i);

    public final int w(int i, boolean z) {
        if (!z) {
            if (i < this.e - 1) {
                return i + 1;
            }
            return -1;
        }
        e4g e4gVar = this.f;
        int i2 = e4gVar.c[i] + 1;
        int[] iArr = e4gVar.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int x(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        e4g e4gVar = this.f;
        int i2 = e4gVar.c[i] - 1;
        if (i2 >= 0) {
            return e4gVar.b[i2];
        }
        return -1;
    }

    public abstract ush y(int i);
}
