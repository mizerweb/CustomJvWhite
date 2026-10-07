package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class w15 extends ur0 {
    public dc9 A;
    public v1i B;
    public IOException C;
    public Handler D;
    public Uri E;
    public final Uri F;
    public k15 G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public int L;
    public long M;
    public int N;
    public ry9 O;
    public iy9 P;
    public final boolean h;
    public final s25 i;
    public final d15 j;
    public final ou7 k;
    public final ev5 l;
    public final l6m m;
    public final ljf n;
    public final long o;
    public final long p;
    public final ed7 q;
    public final qmc r;
    public final c7k s;
    public final Object t;
    public final SparseArray u;
    public final s15 v;
    public final s15 w;
    public final rj5 x;
    public final aa9 y;
    public u25 z;

    static {
        sz9.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [s15] */
    /* JADX WARN: Type inference failed for: r2v11, types: [s15] */
    public w15(ry9 ry9Var, s25 s25Var, qmc qmcVar, d15 d15Var, ou7 ou7Var, ev5 ev5Var, l6m l6mVar, long j, long j2) {
        this.O = ry9Var;
        this.P = ry9Var.c;
        jy9 jy9Var = ry9Var.b;
        jy9Var.getClass();
        Uri uri = jy9Var.a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.i = s25Var;
        this.r = qmcVar;
        this.j = d15Var;
        this.l = ev5Var;
        this.m = l6mVar;
        this.o = j;
        this.p = j2;
        this.k = ou7Var;
        this.n = new ljf(5);
        final int i = 0;
        this.h = false;
        this.q = d(null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new rj5(12, this);
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
        this.s = new c7k(11, this);
        this.y = new vn7(13, this);
        this.v = new Runnable(this) { // from class: s15
            public final /* synthetic */ w15 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                w15 w15Var = this.b;
                switch (i2) {
                    case 0:
                        w15Var.C();
                        break;
                    default:
                        try {
                            w15Var.A(false);
                        } catch (Exception e) {
                            w15Var.C = new IOException(e);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.w = new Runnable(this) { // from class: s15
            public final /* synthetic */ w15 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                w15 w15Var = this.b;
                switch (i3) {
                    case 0:
                        w15Var.C();
                        break;
                    default:
                        try {
                            w15Var.A(false);
                        } catch (Exception e) {
                            w15Var.C = new IOException(e);
                        }
                        break;
                }
            }
        };
    }

    public static boolean w(fsc fscVar) {
        List list = fscVar.c;
        for (int i = 0; i < list.size(); i++) {
            int i2 = ((ga) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0272  */
    /* JADX WARN: Code duplicated, block: B:148:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:151:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:195:0x039e  */
    /* JADX WARN: Code duplicated, block: B:197:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:220:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:222:0x0401  */
    /* JADX WARN: Code duplicated, block: B:227:0x0441  */
    /* JADX WARN: Code duplicated, block: B:231:0x044a  */
    /* JADX WARN: Code duplicated, block: B:233:0x0458  */
    /* JADX WARN: Code duplicated, block: B:234:0x045c  */
    /* JADX WARN: Code duplicated, block: B:236:0x046b  */
    /* JADX WARN: Code duplicated, block: B:250:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:252:0x04a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:255:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:257:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:259:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:266:0x0389 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x037c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x048f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c2  */
    public final void A(boolean z) {
        fsc fscVar;
        long j;
        long j2;
        long j3;
        boolean z2;
        boolean z3;
        long j4;
        long j5;
        long jP0;
        iy9 iy9Var;
        k15 k15Var;
        long j6;
        List list;
        long jX;
        long jE;
        long jX2;
        long jX3;
        long jX4;
        int i;
        List list2;
        int i2;
        x15 x15VarC;
        long jI;
        long jMin;
        iy9 iy9Var2;
        long j7;
        long jK;
        long j8;
        float f;
        iy9 iy9Var3;
        long jX5;
        long jMin2;
        char c;
        x15 x15VarC2;
        long J;
        int i3;
        s15 s15Var = this.w;
        long j9 = this.p;
        SparseArray sparseArray = this.u;
        boolean z4 = false;
        int i4 = 0;
        while (i4 < sparseArray.size()) {
            int iKeyAt = sparseArray.keyAt(i4);
            if (iKeyAt >= this.N) {
                r15 r15Var = (r15) sparseArray.valueAt(i4);
                k15 k15Var2 = this.G;
                int i5 = iKeyAt - this.N;
                r15Var.v = k15Var2;
                r15Var.w = i5;
                x3d x3dVar = r15Var.m;
                x3dVar.h = z4;
                x3dVar.f = k15Var2;
                Iterator it = x3dVar.e.entrySet().iterator();
                while (it.hasNext()) {
                    int i6 = i4;
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < x3dVar.f.h) {
                        it.remove();
                    }
                    i4 = i6;
                }
                i3 = i4;
                yq3[] yq3VarArr = r15Var.s;
                if (yq3VarArr != null) {
                    for (yq3 yq3Var : yq3VarArr) {
                        yq3Var.e.g(k15Var2, i5);
                    }
                    r15Var.r.q(r15Var);
                }
                r15Var.x = k15Var2.b(i5).d;
                for (vc6 vc6Var : r15Var.t) {
                    for (xc6 xc6Var : r15Var.x) {
                        if (xc6Var.a().equals(vc6Var.e.a())) {
                            vc6Var.a(xc6Var, k15Var2.d && i5 == k15Var2.m.size() + (-1));
                            break;
                        }
                    }
                }
            } else {
                i3 = i4;
            }
            i4 = i3 + 1;
            z4 = false;
        }
        int i7 = 1;
        fsc fscVarB = this.G.b(0);
        int size = this.G.m.size() - 1;
        fsc fscVarB2 = this.G.b(size);
        long jE2 = this.G.e(size);
        long jX6 = vqi.X(vqi.G(this.K));
        long jE3 = this.G.e(0);
        long j10 = fscVarB.b;
        List list3 = fscVarB.c;
        long jX7 = vqi.X(j10);
        boolean zW = w(fscVarB);
        int i8 = 0;
        while (true) {
            fscVar = fscVarB;
            j = j9;
            if (i8 >= list3.size()) {
                j2 = 0;
                break;
            }
            ga gaVar = (ga) list3.get(i8);
            j2 = 0;
            List list4 = gaVar.c;
            int i9 = gaVar.b;
            boolean z5 = (i9 == i7 || i9 == 2) ? false : true;
            if ((!zW || !z5) && !list4.isEmpty()) {
                x15 x15VarC3 = ((ble) list4.get(0)).c();
                if (x15VarC3 == null || x15VarC3.J(jE3, jX6) == 0) {
                    jX7 = jX7;
                    break;
                }
                jX7 = Math.max(jX7, x15VarC3.b(x15VarC3.g(jE3, jX6)) + jX7);
            }
            i8++;
            fscVarB = fscVar;
            j9 = j;
            i7 = 1;
        }
        long j11 = fscVarB2.b;
        List list5 = fscVarB2.c;
        long jX8 = vqi.X(j11);
        boolean zW2 = w(fscVarB2);
        long jMin3 = BuildConfig.MAX_TIME_TO_UPLOAD;
        int i10 = 0;
        while (true) {
            if (i10 >= list5.size()) {
                j3 = jMin3;
                break;
            }
            ga gaVar2 = (ga) list5.get(i10);
            List list6 = gaVar2.c;
            int i11 = gaVar2.b;
            long j12 = jX8;
            if (i11 != 1) {
                c = 2;
                boolean z6 = i11 != 2;
                if ((zW2 || !z6) && !list6.isEmpty()) {
                    x15VarC2 = ((ble) list6.get(0)).c();
                    if (x15VarC2 == null) {
                        j3 = j12 + jE2;
                        break;
                    }
                    J = x15VarC2.J(jE2, jX6);
                    if (J == j2) {
                        j3 = j12;
                        break;
                    } else {
                        long jG = (x15VarC2.g(jE2, jX6) + J) - 1;
                        jMin3 = Math.min(jMin3, x15VarC2.d(jG, jE2) + x15VarC2.b(jG) + j12);
                    }
                }
                i10++;
                zW2 = zW2;
                jX8 = j12;
            } else {
                c = 2;
            }
            if (zW2) {
                x15VarC2 = ((ble) list6.get(0)).c();
                if (x15VarC2 == null) {
                    j3 = j12 + jE2;
                    break;
                }
                J = x15VarC2.J(jE2, jX6);
                if (J == j2) {
                    j3 = j12;
                    break;
                } else {
                    long jG2 = (x15VarC2.g(jE2, jX6) + J) - 1;
                    jMin3 = Math.min(jMin3, x15VarC2.d(jG2, jE2) + x15VarC2.b(jG2) + j12);
                }
            } else {
                x15VarC2 = ((ble) list6.get(0)).c();
                if (x15VarC2 == null) {
                    j3 = j12 + jE2;
                    break;
                }
                J = x15VarC2.J(jE2, jX6);
                if (J == j2) {
                    j3 = j12;
                    break;
                } else {
                    long jG3 = (x15VarC2.g(jE2, jX6) + J) - 1;
                    jMin3 = Math.min(jMin3, x15VarC2.d(jG3, jE2) + x15VarC2.b(jG3) + j12);
                }
            }
            i10++;
            zW2 = zW2;
            jX8 = j12;
        }
        if (!this.G.d) {
            z2 = false;
            break;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= list5.size()) {
                z2 = true;
                break;
            }
            x15 x15VarC4 = ((ble) ((ga) list5.get(i12)).c.get(0)).c();
            if (x15VarC4 == null || x15VarC4.F()) {
                z2 = false;
                break;
            }
            i12++;
        }
        if (z2) {
            long j13 = this.G.f;
            if (j13 != -9223372036854775807L) {
                jX7 = Math.max(jX7, j3 - vqi.X(j13));
            }
        }
        long j14 = j3 - jX7;
        k15 k15Var3 = this.G;
        if (k15Var3.d) {
            lvb.b0(k15Var3.a != -9223372036854775807L);
            long jX9 = (jX6 - vqi.X(this.G.a)) - jX7;
            iy9 iy9Var4 = k().c;
            long jP1 = vqi.p0(jX9);
            long j15 = iy9Var4.c;
            if (j15 != -9223372036854775807L) {
                jMin = Math.min(jP1, j15);
            } else {
                ijf ijfVar = this.G.j;
                if (ijfVar != null) {
                    long j16 = ijfVar.c;
                    if (j16 != -9223372036854775807L) {
                        jMin = Math.min(jP1, j16);
                    } else {
                        jMin = jP1;
                    }
                } else {
                    jMin = jP1;
                }
            }
            long jP2 = vqi.p0(jX9 - j14);
            if (jP2 < j2 && jMin > j2) {
                jP2 = j2;
            }
            j4 = -9223372036854775807L;
            long j17 = this.G.c;
            if (j17 != -9223372036854775807L) {
                jP2 = Math.min(jP2 + j17, jP1);
            }
            long jK2 = jP2;
            long j18 = iy9Var4.b;
            if (j18 != -9223372036854775807L) {
                jK2 = vqi.k(j18, jK2, jP1);
            } else {
                ijf ijfVar2 = this.G.j;
                if (ijfVar2 != null) {
                    long j19 = ijfVar2.b;
                    if (j19 != -9223372036854775807L) {
                        jK2 = vqi.k(j19, jK2, jP1);
                    }
                }
            }
            long j20 = jK2;
            long j21 = j20 > jMin ? j20 : jMin;
            synchronized (this) {
                iy9Var2 = this.P;
            }
            long j22 = iy9Var2.a;
            if (j22 == -9223372036854775807L) {
                k15 k15Var4 = this.G;
                ijf ijfVar3 = k15Var4.j;
                if (ijfVar3 != null) {
                    long j23 = ijfVar3.a;
                    if (j23 != -9223372036854775807L) {
                        j22 = j23;
                    } else {
                        j22 = k15Var4.g;
                        if (j22 == -9223372036854775807L) {
                            j22 = this.o;
                        }
                    }
                } else {
                    j22 = k15Var4.g;
                    if (j22 == -9223372036854775807L) {
                        j22 = this.o;
                    }
                }
            }
            if (j22 < j20) {
                j22 = j20;
            }
            if (j22 > j21) {
                j7 = j;
                jK = vqi.k(vqi.p0(jX9 - Math.min(j7, j14 / 2)), j20, j21);
            } else {
                j7 = j;
                jK = j22;
            }
            long j24 = j21;
            float f2 = iy9Var4.d;
            if (f2 == -3.4028235E38f) {
                ijf ijfVar4 = this.G.j;
                f2 = ijfVar4 != null ? ijfVar4.d : -3.4028235E38f;
            }
            float f3 = iy9Var4.e;
            if (f3 == -3.4028235E38f) {
                ijf ijfVar5 = this.G.j;
                f3 = ijfVar5 != null ? ijfVar5.e : -3.4028235E38f;
            }
            if (f2 == -3.4028235E38f && f3 == -3.4028235E38f) {
                ijf ijfVar6 = this.G.j;
                j8 = jX9;
                z3 = z2;
                if (ijfVar6 == null || ijfVar6.a == -9223372036854775807L) {
                    f2 = 1.0f;
                    f = 1.0f;
                }
                hy9 hy9Var = new hy9();
                hy9Var.a = jK;
                hy9Var.b = j20;
                hy9Var.c = j24;
                hy9Var.d = f2;
                hy9Var.e = f;
                iy9Var3 = new iy9(hy9Var);
                synchronized (this) {
                    this.P = iy9Var3;
                }
                jP0 = vqi.p0(jX7) + this.G.a;
                synchronized (this) {
                    iy9 iy9Var5 = this.P;
                }
                jX5 = j8 - vqi.X(iy9Var5.a);
                jMin2 = Math.min(j7, j14 / 2);
                if (jX5 < jMin2) {
                    j5 = jMin2;
                } else {
                    j5 = jX5;
                }
            } else {
                j8 = jX9;
                z3 = z2;
            }
            f = f3;
            hy9 hy9Var2 = new hy9();
            hy9Var2.a = jK;
            hy9Var2.b = j20;
            hy9Var2.c = j24;
            hy9Var2.d = f2;
            hy9Var2.e = f;
            iy9Var3 = new iy9(hy9Var2);
            synchronized (this) {
                this.P = iy9Var3;
                jP0 = vqi.p0(jX7) + this.G.a;
                synchronized (this) {
                    iy9 iy9Var6 = this.P;
                    jX5 = j8 - vqi.X(iy9Var6.a);
                    jMin2 = Math.min(j7, j14 / 2);
                    if (jX5 < jMin2) {
                        j5 = jMin2;
                    } else {
                        j5 = jX5;
                    }
                }
            }
            p(new t15(j, jP0, j, i, jX, j14, j5, k15Var, ry9VarK, iy9Var));
            if (this.h) {
            }
            this.D.removeCallbacks(s15Var);
            if (z3) {
                Handler handler = this.D;
                k15 k15Var5 = this.G;
                long jG4 = vqi.G(this.K);
                int size2 = k15Var5.m.size() - 1;
                fsc fscVarB3 = k15Var5.b(size2);
                long j25 = fscVarB3.b;
                list = fscVarB3.c;
                jX = vqi.X(j25);
                jE = k15Var5.e(size2);
                jX2 = vqi.X(jG4);
                jX3 = vqi.X(k15Var5.a);
                jX4 = vqi.X(k15Var5.e);
                if (jX4 != j4 || jX4 >= 5000000) {
                    jX4 = 5000000;
                }
                i = 0;
                while (i < list.size()) {
                    list2 = ((ga) list.get(i)).c;
                    if (list2.isEmpty()) {
                        i2 = i;
                    } else {
                        i2 = i;
                        x15VarC = ((ble) list2.get(0)).c();
                        if (x15VarC != null) {
                            jI = (x15VarC.i(jE, jX2) + (jX3 + jX)) - jX2;
                            if (jI > j2 && (jI < jX4 - 100000 || (jI > jX4 && jI < jX4 + 100000))) {
                                jX4 = jI;
                            }
                        }
                    }
                    i = i2 + 1;
                }
                handler.postDelayed(s15Var, yok.b(jX4, 1000L, RoundingMode.CEILING));
            }
            if (this.H) {
                C();
                return;
            }
            if (z) {
                k15Var = this.G;
                if (k15Var.d) {
                    j6 = k15Var.e;
                    if (j6 != j4) {
                        if (j6 == j2) {
                            j6 = 5000;
                        }
                        this.D.postDelayed(this.v, Math.max(j2, (this.I + j6) - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
        z3 = z2;
        j4 = -9223372036854775807L;
        j5 = j2;
        jP0 = -9223372036854775807L;
        long jX10 = jX7 - vqi.X(fscVar.b);
        k15 k15Var6 = this.G;
        long j26 = k15Var6.a;
        long j27 = this.K;
        int i13 = this.N;
        ry9 ry9VarK = k();
        if (this.G.d) {
            synchronized (this) {
                iy9Var = this.P;
            }
        } else {
            iy9Var = null;
        }
        p(new t15(j26, jP0, j27, i13, jX10, j14, j5, k15Var6, ry9VarK, iy9Var));
        if (this.h) {
            this.D.removeCallbacks(s15Var);
            if (z3) {
                Handler handler2 = this.D;
                k15 k15Var7 = this.G;
                long jG5 = vqi.G(this.K);
                int size3 = k15Var7.m.size() - 1;
                fsc fscVarB4 = k15Var7.b(size3);
                long j28 = fscVarB4.b;
                list = fscVarB4.c;
                jX = vqi.X(j28);
                jE = k15Var7.e(size3);
                jX2 = vqi.X(jG5);
                jX3 = vqi.X(k15Var7.a);
                jX4 = vqi.X(k15Var7.e);
                if (jX4 != j4) {
                    jX4 = 5000000;
                } else {
                    jX4 = 5000000;
                }
                i = 0;
                while (i < list.size()) {
                    list2 = ((ga) list.get(i)).c;
                    if (list2.isEmpty()) {
                        i2 = i;
                    } else {
                        i2 = i;
                        x15VarC = ((ble) list2.get(0)).c();
                        if (x15VarC != null) {
                            jI = (x15VarC.i(jE, jX2) + (jX3 + jX)) - jX2;
                            if (jI > j2) {
                                jX4 = jI;
                            }
                        }
                    }
                    i = i2 + 1;
                }
                handler2.postDelayed(s15Var, yok.b(jX4, 1000L, RoundingMode.CEILING));
            }
            if (this.H) {
                C();
                return;
            }
            if (z) {
                k15Var = this.G;
                if (k15Var.d) {
                    j6 = k15Var.e;
                    if (j6 != j4) {
                        if (j6 == j2) {
                            j6 = 5000;
                        }
                        this.D.postDelayed(this.v, Math.max(j2, (this.I + j6) - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
    }

    public final void B(ewe eweVar, qmc qmcVar) {
        u25 u25Var = this.z;
        Uri uri = Uri.parse((String) eweVar.c);
        Map map = Collections.EMPTY_MAP;
        lvb.W(uri, "The uri must be set.");
        this.A.N(new rmc(u25Var, new a35(uri, 0L, 1, null, map, 0L, -1L, null, 1, null), 5, qmcVar), new v15(0, this), 1);
    }

    public final void C() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.I()) {
            return;
        }
        if (this.A.J()) {
            this.H = true;
            return;
        }
        synchronized (this.t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        lvb.W(uri, "The uri must be set.");
        this.A.N(new rmc(this.z, new a35(uri, 0L, 1, null, map, 0L, -1L, null, 1, null), 4, this.r), this.s, this.m.o(4));
    }

    @Override // defpackage.ur0
    public final boolean c(ry9 ry9Var) {
        jy9 jy9Var = k().b;
        jy9Var.getClass();
        jy9 jy9Var2 = ry9Var.b;
        return jy9Var2 != null && jy9Var2.a.equals(jy9Var.a) && jy9Var2.e.equals(jy9Var.e) && Objects.equals(jy9Var2.c, jy9Var.c);
    }

    @Override // defpackage.ur0
    public final u0a e(x4a x4aVar, qf qfVar, long j) {
        int iIntValue = ((Integer) x4aVar.a).intValue() - this.N;
        ed7 ed7VarD = d(x4aVar);
        av5 av5Var = new av5(this.d.c, 0, x4aVar);
        int i = this.N + iIntValue;
        k15 k15Var = this.G;
        v1i v1iVar = this.B;
        long j2 = this.K;
        z3d z3dVar = this.g;
        z3dVar.getClass();
        r15 r15Var = new r15(i, k15Var, this.n, iIntValue, this.j, v1iVar, this.l, av5Var, this.m, ed7VarD, j2, this.y, qfVar, this.k, this.x, z3dVar);
        this.u.put(i, r15Var);
        return r15Var;
    }

    @Override // defpackage.ur0
    public final synchronized ry9 k() {
        return this.O;
    }

    @Override // defpackage.ur0
    public final void m() {
        this.y.b();
    }

    @Override // defpackage.ur0
    public final void o(v1i v1iVar) {
        this.B = v1iVar;
        Looper looperMyLooper = Looper.myLooper();
        z3d z3dVar = this.g;
        z3dVar.getClass();
        ev5 ev5Var = this.l;
        ev5Var.b(looperMyLooper, z3dVar);
        ev5Var.prepare();
        if (this.h) {
            A(false);
            return;
        }
        this.z = this.i.a();
        this.A = new dc9("DashMediaSource", 1);
        this.D = vqi.p(null);
        C();
    }

    @Override // defpackage.ur0
    public final void q(u0a u0aVar) {
        r15 r15Var = (r15) u0aVar;
        x3d x3dVar = r15Var.m;
        x3dVar.i = true;
        x3dVar.d.removeCallbacksAndMessages(null);
        for (yq3 yq3Var : r15Var.s) {
            yq3Var.D(r15Var);
        }
        r15Var.r = null;
        this.u.remove(r15Var.a);
    }

    @Override // defpackage.ur0
    public final void s() {
        this.H = false;
        this.z = null;
        dc9 dc9Var = this.A;
        if (dc9Var != null) {
            dc9Var.L(null);
            this.A = null;
        }
        iy9 iy9Var = k().c;
        synchronized (this) {
            this.P = iy9Var;
        }
        this.I = 0L;
        this.J = 0L;
        this.E = this.F;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.K = -9223372036854775807L;
        this.L = 0;
        this.M = -9223372036854775807L;
        this.u.clear();
        ljf ljfVar = this.n;
        ((HashMap) ljfVar.b).clear();
        ((HashMap) ljfVar.c).clear();
        ((HashMap) ljfVar.d).clear();
        this.l.release();
    }

    @Override // defpackage.ur0
    public final synchronized void v(ry9 ry9Var) {
        this.O = ry9Var;
        this.P = ry9Var.c;
    }

    public final void x() {
        boolean z;
        dc9 dc9Var = this.A;
        ft0 ft0Var = new ft0(this);
        synchronized (gpk.b) {
            z = gpk.c;
        }
        if (z) {
            ft0Var.z();
            return;
        }
        if (dc9Var == null) {
            dc9Var = new dc9("SntpClient", 1);
        }
        dc9Var.N(new ku8(), new v15(1, ft0Var), 1);
    }

    public final void y(rmc rmcVar, long j, long j2) {
        long j3 = rmcVar.a;
        a35 a35Var = rmcVar.b;
        lkg lkgVar = rmcVar.d;
        t99 t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        this.m.getClass();
        this.q.N(t99Var, rmcVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void z(IOException iOException) {
        lvb.l0("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.K = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        A(true);
    }
}
