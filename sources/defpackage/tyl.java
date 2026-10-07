package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tyl implements rp0 {
    private final x7m a;

    public tyl(x7m x7mVar) {
        this.a = x7mVar;
    }

    private static np0.d o(sil silVar) {
        if (silVar == null) {
            return null;
        }
        return new np0.d(silVar.a, silVar.b, silVar.c, silVar.d, silVar.e, silVar.f, silVar.g, silVar.h);
    }

    @Override // defpackage.rp0
    public final int a() {
        return this.a.d;
    }

    @Override // defpackage.rp0
    public final np0.e b() {
        zll zllVar = this.a.l;
        if (zllVar == null) {
            return null;
        }
        return new np0.e(zllVar.a, zllVar.b, zllVar.c, zllVar.d, zllVar.e, o(zllVar.f), o(zllVar.g));
    }

    @Override // defpackage.rp0
    public final String c() {
        return this.a.c;
    }

    @Override // defpackage.rp0
    public final np0.k d() {
        f1m f1mVar = this.a.g;
        if (f1mVar != null) {
            return new np0.k(f1mVar.b, f1mVar.a);
        }
        return null;
    }

    @Override // defpackage.rp0
    public final np0.g e() {
        zrl zrlVar = this.a.n;
        if (zrlVar == null) {
            return null;
        }
        return new np0.g(zrlVar.a, zrlVar.b, zrlVar.c, zrlVar.d, zrlVar.e, zrlVar.f, zrlVar.g, zrlVar.h, zrlVar.i, zrlVar.j, zrlVar.k, zrlVar.l, zrlVar.m, zrlVar.n);
    }

    @Override // defpackage.rp0
    public final Rect f() {
        x7m x7mVar = this.a;
        if (x7mVar.e == null) {
            return null;
        }
        int i = 0;
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = x7mVar.e;
            if (i >= pointArr.length) {
                return new Rect(iMin, iMin2, iMax, iMax2);
            }
            Point point = pointArr[i];
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
            i++;
        }
    }

    @Override // defpackage.rp0
    public final String g() {
        return this.a.b;
    }

    @Override // defpackage.rp0
    public final int getFormat() {
        return this.a.a;
    }

    @Override // defpackage.rp0
    public final np0.m getUrl() {
        g5m g5mVar = this.a.j;
        if (g5mVar != null) {
            return new np0.m(g5mVar.a, g5mVar.b);
        }
        return null;
    }

    @Override // defpackage.rp0
    public final np0.l h() {
        h3m h3mVar = this.a.h;
        if (h3mVar != null) {
            return new np0.l(h3mVar.a, h3mVar.b);
        }
        return null;
    }

    @Override // defpackage.rp0
    public final np0.f i() {
        zol zolVar = this.a.m;
        if (zolVar == null) {
            return null;
        }
        wyl wylVar = zolVar.a;
        np0.j jVar = wylVar == null ? null : new np0.j(wylVar.a, wylVar.b, wylVar.c, wylVar.d, wylVar.e, wylVar.f, wylVar.g);
        String str = zolVar.b;
        String str2 = zolVar.c;
        f1m[] f1mVarArr = zolVar.d;
        ArrayList arrayList = new ArrayList();
        if (f1mVarArr != null) {
            for (f1m f1mVar : f1mVarArr) {
                if (f1mVar != null) {
                    arrayList.add(new np0.k(f1mVar.b, f1mVar.a));
                }
            }
        }
        qul[] qulVarArr = zolVar.e;
        ArrayList arrayList2 = new ArrayList();
        if (qulVarArr != null) {
            for (qul qulVar : qulVarArr) {
                if (qulVar != null) {
                    arrayList2.add(new np0.h(qulVar.a, qulVar.b, qulVar.c, qulVar.d));
                }
            }
        }
        String[] strArr = zolVar.f;
        List listAsList = strArr != null ? Arrays.asList(strArr) : new ArrayList();
        mfl[] mflVarArr = zolVar.g;
        ArrayList arrayList3 = new ArrayList();
        if (mflVarArr != null) {
            for (mfl mflVar : mflVarArr) {
                if (mflVar != null) {
                    arrayList3.add(new np0.a(mflVar.a, mflVar.b));
                }
            }
        }
        return new np0.f(jVar, str, str2, arrayList, arrayList2, listAsList, arrayList3);
    }

    @Override // defpackage.rp0
    public final byte[] j() {
        return this.a.o;
    }

    @Override // defpackage.rp0
    public final Point[] k() {
        return this.a.e;
    }

    @Override // defpackage.rp0
    public final np0.h l() {
        qul qulVar = this.a.f;
        if (qulVar != null) {
            return new np0.h(qulVar.a, qulVar.b, qulVar.c, qulVar.d);
        }
        return null;
    }

    @Override // defpackage.rp0
    public final np0.i m() {
        rwl rwlVar = this.a.k;
        if (rwlVar != null) {
            return new np0.i(rwlVar.a, rwlVar.b);
        }
        return null;
    }

    @Override // defpackage.rp0
    public final np0.n n() {
        q6m q6mVar = this.a.i;
        if (q6mVar != null) {
            return new np0.n(q6mVar.a, q6mVar.b, q6mVar.c);
        }
        return null;
    }
}
