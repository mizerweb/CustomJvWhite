package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jc5 implements w4a {
    public final qz4 a;
    public s25 b;
    public lhb c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public jc5(s25 s25Var, nj6 nj6Var) {
        this.b = s25Var;
        lhb lhbVar = new lhb(16);
        this.c = lhbVar;
        qz4 qz4Var = new qz4(nj6Var, lhbVar);
        this.a = qz4Var;
        if (s25Var != ((s25) qz4Var.e)) {
            qz4Var.e = s25Var;
            ((HashMap) qz4Var.c).clear();
            ((HashMap) qz4Var.d).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static w4a f(Class cls, s25 s25Var) {
        try {
            return (w4a) cls.getConstructor(s25.class).newInstance(s25Var);
        } catch (Exception e) {
            qr7.w(e);
            return null;
        }
    }

    @Override // defpackage.w4a
    public final ur0 a(ry9 ry9Var) {
        ry9 ry9VarA = ry9Var;
        ry9VarA.b.getClass();
        String scheme = ry9VarA.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean zEquals = Objects.equals(ry9VarA.b.b, "application/x-image-uri");
        jy9 jy9Var = ry9VarA.b;
        if (zEquals) {
            long j = jy9Var.h;
            String str = vqi.a;
            throw null;
        }
        int iN = vqi.N(jy9Var.a, jy9Var.b);
        if (ry9VarA.b.h != -9223372036854775807L) {
            nj6 nj6Var = (nj6) this.a.b;
            if (nj6Var instanceof ra5) {
                ra5 ra5Var = (ra5) nj6Var;
                synchronized (ra5Var) {
                    ra5Var.j = 1;
                }
            }
            nj6 nj6Var2 = (nj6) this.a.b;
            if (nj6Var2 instanceof ra5) {
                ra5 ra5Var2 = (ra5) nj6Var2;
                synchronized (ra5Var2) {
                    ra5Var2.k = 1;
                }
            }
        }
        try {
            w4a w4aVarD = this.a.d(iN);
            hy9 hy9VarA = ry9VarA.c.a();
            iy9 iy9Var = ry9VarA.c;
            if (iy9Var.a == -9223372036854775807L) {
                hy9VarA.a = this.d;
            }
            if (iy9Var.d == -3.4028235E38f) {
                hy9VarA.d = this.g;
            }
            if (iy9Var.e == -3.4028235E38f) {
                hy9VarA.e = this.h;
            }
            if (iy9Var.b == -9223372036854775807L) {
                hy9VarA.b = this.e;
            }
            if (iy9Var.c == -9223372036854775807L) {
                hy9VarA.c = this.f;
            }
            iy9 iy9Var2 = new iy9(hy9VarA);
            if (!iy9Var2.equals(ry9VarA.c)) {
                ay9 ay9VarA = ry9VarA.a();
                ay9VarA.l = iy9Var2.a();
                ry9VarA = ay9VarA.a();
            }
            ur0 ur0VarA = w4aVarD.a(ry9VarA);
            c98 c98Var = ry9VarA.b.g;
            if (!c98Var.isEmpty()) {
                ur0[] ur0VarArr = new ur0[c98Var.size() + 1];
                ur0VarArr[0] = ur0VarA;
                for (int i = 0; i < c98Var.size(); i++) {
                    if (this.i) {
                        a87 a87Var = new a87();
                        a87Var.r(((oy9) c98Var.get(i)).b);
                        a87Var.m(((oy9) c98Var.get(i)).c);
                        a87Var.t(((oy9) c98Var.get(i)).d);
                        a87Var.q(((oy9) c98Var.get(i)).e);
                        a87Var.k(((oy9) c98Var.get(i)).f);
                        a87Var.i(((oy9) c98Var.get(i)).g);
                        final b87 b87VarA = a87Var.a();
                        xvd xvdVar = new xvd(this.b, new nj6() { // from class: fc5
                            @Override // defpackage.nj6
                            public final jj6[] e() {
                                jc5 jc5Var = this.b;
                                lhb lhbVar = jc5Var.c;
                                b87 b87Var = b87VarA;
                                return new jj6[]{lhbVar.a(b87Var) ? new z7h(jc5Var.c.m(b87Var), null) : new ic5(b87Var)};
                            }
                        });
                        if (this.c.a(b87VarA)) {
                            a87 a87VarA = b87VarA.a();
                            a87VarA.r("application/x-media3-cues");
                            a87VarA.c(b87VarA.n);
                            a87VarA.e(this.c.n(b87VarA));
                            b87VarA = a87VarA.a();
                        }
                        xvdVar.g(b87VarA);
                        int i2 = i + 1;
                        String string = ((oy9) c98Var.get(i)).a.toString();
                        by9 by9Var = new by9();
                        fy9 fy9Var = new fy9();
                        List list = Collections.EMPTY_LIST;
                        ghe gheVar = ghe.e;
                        hy9 hy9Var = new hy9();
                        ly9 ly9Var = ly9.d;
                        Uri uri = string == null ? null : Uri.parse(string);
                        lvb.b0(fy9Var.b == null || fy9Var.a != null);
                        ur0VarArr[i2] = xvdVar.a(new ry9("", new dy9(by9Var), uri != null ? new jy9(uri, null, fy9Var.a != null ? new gy9(fy9Var) : null, null, list, null, gheVar, -9223372036854775807L) : null, new iy9(hy9Var), b0a.K, ly9Var));
                    } else {
                        ur0VarArr[i + 1] = new wze(this.b).d((oy9) c98Var.get(i));
                    }
                }
                ur0VarA = new cda(ur0VarArr);
            }
            dy9 dy9Var = ry9VarA.e;
            if (dy9Var.b != 0 || dy9Var.d != Long.MIN_VALUE || dy9Var.f) {
                lt3 lt3Var = new lt3(ur0VarA);
                lt3Var.g(dy9Var.b);
                lt3Var.e(dy9Var.d);
                lt3Var.d(!dy9Var.g);
                lt3Var.b(dy9Var.e);
                lt3Var.f(dy9Var.f);
                lt3Var.c(dy9Var.h);
                ur0VarA = lt3Var.a();
            }
            ry9VarA.b.getClass();
            if (ry9VarA.b.d == null) {
                return ur0VarA;
            }
            lvb.G0("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return ur0VarA;
        } catch (ClassNotFoundException e) {
            qr7.w(e);
            return null;
        }
    }

    @Override // defpackage.w4a
    public final void b(lhb lhbVar) {
        this.c = lhbVar;
        qz4 qz4Var = this.a;
        qz4Var.f = lhbVar;
        ((nj6) qz4Var.b).b(lhbVar);
        Iterator it = ((HashMap) qz4Var.d).values().iterator();
        while (it.hasNext()) {
            ((w4a) it.next()).b(lhbVar);
        }
    }

    @Override // defpackage.w4a
    public final void c() {
        qz4 qz4Var = this.a;
        qz4Var.getClass();
        ((nj6) qz4Var.b).c();
    }

    @Override // defpackage.w4a
    public final void d(boolean z) {
        this.i = z;
        qz4 qz4Var = this.a;
        qz4Var.a = z;
        ((nj6) qz4Var.b).a(z);
        Iterator it = ((HashMap) qz4Var.d).values().iterator();
        while (it.hasNext()) {
            ((w4a) it.next()).d(z);
        }
    }

    @Override // defpackage.w4a
    public final w4a e(kr6 kr6Var) {
        lvb.W(kr6Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        qz4 qz4Var = this.a;
        qz4Var.g = kr6Var;
        Iterator it = ((HashMap) qz4Var.d).values().iterator();
        while (it.hasNext()) {
            ((w4a) it.next()).e(kr6Var);
        }
        return this;
    }

    public jc5(Context context, ra5 ra5Var) {
        this(new p95(context), ra5Var);
    }
}
