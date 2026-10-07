package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class yke implements e15 {
    public final aa9 a;
    public final ljf b;
    public final int[] c;
    public final int d;
    public final u25 e;
    public final long f;
    public final pgg g;
    public final w3d h;
    public final o95[] i;
    public rg6 j;
    public k15 k;
    public int l;
    public BehindLiveWindowException m;
    public boolean n;

    public yke(aa9 aa9Var, k15 k15Var, ljf ljfVar, int i, int[] iArr, rg6 rg6Var, int i2, u25 u25Var, long j, pgg pggVar, boolean z, ArrayList arrayList, w3d w3dVar, z3d z3dVar) {
        ab5 ab5Var = new ab5();
        this.a = aa9Var;
        this.k = k15Var;
        this.b = ljfVar;
        this.c = iArr;
        this.j = rg6Var;
        int i3 = i2;
        this.d = i3;
        this.e = u25Var;
        this.l = i;
        this.f = j;
        this.g = pggVar;
        w3d w3dVar2 = w3dVar;
        this.h = w3dVar2;
        long jE = k15Var.e(i);
        ArrayList arrayListA = a();
        this.i = new o95[rg6Var.length()];
        int i4 = 0;
        while (i4 < this.i.length) {
            ble bleVar = (ble) arrayListA.get(rg6Var.e(i4));
            ws0 ws0VarW = ljfVar.W(bleVar.b);
            long j2 = jE;
            this.i[i4] = new o95(j2, bleVar, ws0VarW == null ? (ws0) bleVar.b.get(0) : ws0VarW, ab5Var.b(i3, bleVar.a, z, arrayList, w3dVar2), 0L, bleVar.c());
            i4++;
            i3 = i2;
            w3dVar2 = w3dVar;
            jE = j2;
        }
    }

    public static dg8 k(o95 o95Var, u25 u25Var, b87 b87Var, int i, Object obj, l4e l4eVar, l4e l4eVar2) {
        ble bleVar = o95Var.b;
        ws0 ws0Var = o95Var.c;
        if (l4eVar != null) {
            l4eVar2 = l4eVar.a(l4eVar2, ws0Var.a);
            if (l4eVar2 != null) {
            }
            return new dg8(u25Var, bql.a(bleVar, ws0Var.a, l4eVar, 0), b87Var, i, obj, o95Var.a);
        }
        l4eVar2.getClass();
        l4eVar = l4eVar2;
        return new dg8(u25Var, bql.a(bleVar, ws0Var.a, l4eVar, 0), b87Var, i, obj, o95Var.a);
    }

    public static qr0 l(o95 o95Var, u25 u25Var, int i, b87 b87Var, int i2, Object obj, long j, int i3, long j2, long j3) {
        long j4;
        ble bleVar = o95Var.b;
        ws0 ws0Var = o95Var.c;
        long jH = o95Var.h(j);
        x15 x15Var = o95Var.d;
        x15Var.getClass();
        long j5 = o95Var.f;
        l4e l4eVarJ = x15Var.j(j - j5);
        q51 q51Var = o95Var.a;
        lhe lheVar = lhe.g;
        if (q51Var == null) {
            long jF = o95Var.f(j);
            int i4 = o95Var.i(j, j3) ? 0 : 8;
            Map map = Collections.EMPTY_MAP;
            Uri uriE = w1m.e(ws0Var.a, l4eVarJ.c);
            long j6 = l4eVarJ.a;
            long j7 = l4eVarJ.b;
            String strC = bql.c(bleVar, l4eVarJ);
            Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime());
            lvb.W(uriE, "The uri must be set.");
            return new o9g(u25Var, new a35(uriE, 0L, 1, null, lheVar, j6, j7, strC, i4, lValueOf), b87Var, i2, obj, jH, jF, j, i, b87Var);
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            j4 = jH;
            if (i5 >= i3) {
                break;
            }
            x15Var.getClass();
            l4e l4eVarA = l4eVarJ.a(x15Var.j((j + ((long) i5)) - j5), ws0Var.a);
            if (l4eVarA == null) {
                break;
            }
            i6++;
            i5++;
            l4eVarJ = l4eVarA;
            jH = j4;
        }
        long j8 = (j + ((long) i6)) - 1;
        long jF2 = o95Var.f(j8);
        long j9 = o95Var.e;
        if (j9 == -9223372036854775807L || j9 > jF2) {
            j9 = -9223372036854775807L;
        }
        int i7 = o95Var.i(j8, j3) ? 0 : 8;
        Map map2 = Collections.EMPTY_MAP;
        Uri uriE2 = w1m.e(ws0Var.a, l4eVarJ.c);
        long j10 = l4eVarJ.a;
        long j11 = l4eVarJ.b;
        String strC2 = bql.c(bleVar, l4eVarJ);
        Long lValueOf2 = Long.valueOf(SystemClock.elapsedRealtime());
        lvb.W(uriE2, "The uri must be set.");
        a35 a35Var = new a35(uriE2, 0L, 1, null, lheVar, j10, j11, strC2, i7, lValueOf2);
        long j12 = -bleVar.c;
        if (uya.k(b87Var.n)) {
            j12 += j4;
        }
        return new to4(u25Var, a35Var, b87Var, i2, obj, j4, jF2, j2, j9, j, i6, j12, o95Var.a);
    }

    public final ArrayList a() {
        List list = this.k.b(this.l).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((ga) list.get(i)).c);
        }
        return arrayList;
    }

    @Override // defpackage.e15
    public final void b() throws BehindLiveWindowException {
        BehindLiveWindowException behindLiveWindowException = this.m;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        this.a.b();
    }

    @Override // defpackage.e15
    public final long c(long j, ybf ybfVar) {
        o95[] o95VarArr = this.i;
        int length = o95VarArr.length;
        int i = 0;
        while (i < length) {
            o95 o95Var = o95VarArr[i];
            if (o95Var.d != null) {
                long jE = o95Var.e();
                if (jE != 0) {
                    long jG = o95Var.g(j);
                    long jH = o95Var.h(jG);
                    return ybfVar.a(j, jH, (jH >= j || (jE != -1 && jG >= (o95Var.c() + jE) - 1)) ? jH : o95Var.h(jG + 1));
                }
            }
            i++;
            ybfVar = ybfVar;
            j = j;
        }
        return j;
    }

    @Override // defpackage.e15
    public void d(fa9 fa9Var, long j, List list, n11 n11Var) {
        List list2;
        ft9 ft9Var;
        o95[] o95VarArr;
        long jMax;
        long j2;
        long j3;
        long jK;
        if (this.m != null) {
            return;
        }
        long j4 = fa9Var.a;
        long j5 = j - j4;
        long jX = vqi.X(this.k.b(this.l).b) + vqi.X(this.k.a) + j;
        w3d w3dVar = this.h;
        if (w3dVar == null || !w3dVar.h(jX)) {
            long jX2 = vqi.X(vqi.G(this.f));
            k15 k15Var = this.k;
            long j6 = k15Var.a;
            long j7 = -9223372036854775807L;
            long jX3 = j6 == -9223372036854775807L ? -9223372036854775807L : jX2 - vqi.X(j6 + k15Var.b(this.l).b);
            if (list.isEmpty()) {
                list2 = list;
                ft9Var = null;
            } else {
                list2 = list;
                ft9Var = (ft9) list2.get(list.size() - 1);
            }
            int length = this.j.length();
            gt9[] gt9VarArr = new gt9[length];
            int i = 0;
            while (true) {
                o95VarArr = this.i;
                if (i >= length) {
                    break;
                }
                o95 o95Var = o95VarArr[i];
                long j8 = j7;
                x15 x15Var = o95Var.d;
                nv8 nv8Var = gt9.H0;
                if (x15Var == null) {
                    gt9VarArr[i] = nv8Var;
                } else {
                    long jB = o95Var.b(jX2);
                    long jD = o95Var.d(jX2);
                    long jA = ft9Var != null ? ft9Var.a() : vqi.k(o95Var.g(j), jB, jD);
                    if (jA < jB) {
                        gt9VarArr[i] = nv8Var;
                    } else {
                        gt9VarArr[i] = new m95(1, jA, jD, m(i));
                    }
                }
                i++;
                j7 = j8;
            }
            long j9 = j7;
            if (!this.k.d || o95VarArr[0].e() == 0) {
                j4 = j4;
                jMax = j9;
            } else {
                long jF = o95VarArr[0].f(o95VarArr[0].d(jX2));
                k15 k15Var2 = this.k;
                long j10 = k15Var2.a;
                jMax = Math.max(0L, Math.min(j10 == j9 ? j9 : jX2 - vqi.X(j10 + k15Var2.b(this.l).b), jF) - j4);
            }
            this.j.l(j4, j5, jMax, list2, gt9VarArr);
            int iB = this.j.b();
            SystemClock.elapsedRealtime();
            o95 o95VarM = m(iB);
            ble bleVar = o95VarM.b;
            q51 q51Var = o95VarM.a;
            u25 u25Var = this.e;
            if (q51Var != null) {
                l4e l4eVar = q51Var.j == null ? bleVar.e : null;
                l4e l4eVarE = o95VarM.d == null ? bleVar.e() : null;
                if (l4eVar != null || l4eVarE != null) {
                    n11Var.c = k(o95VarM, u25Var, this.j.s(), this.j.t(), this.j.i(), l4eVar, l4eVarE);
                    return;
                }
            }
            long j11 = o95VarM.e;
            k15 k15Var3 = this.k;
            boolean z = k15Var3.d && this.l == k15Var3.m.size() - 1;
            boolean z2 = (z && j11 == j9) ? false : true;
            if (o95VarM.e() == 0) {
                n11Var.b = z2;
                return;
            }
            long jB2 = o95VarM.b(jX2);
            long jD2 = o95VarM.d(jX2);
            if (z) {
                long jF2 = o95VarM.f(jD2);
                z2 &= (jF2 - o95VarM.h(jD2)) + jF2 >= j11;
            }
            if (ft9Var != null) {
                j3 = jD2;
                jK = ft9Var.a();
                j2 = j;
            } else {
                j2 = j;
                j3 = jD2;
                jK = vqi.k(o95VarM.g(j2), jB2, j3);
            }
            if (jK < jB2) {
                this.m = new BehindLiveWindowException();
                return;
            }
            if (jK > j3 || (this.n && jK >= j3)) {
                n11Var.b = z2;
                return;
            }
            if (z2 && o95VarM.h(jK) >= j11) {
                n11Var.b = true;
                return;
            }
            o95VarM.f(jK);
            o95VarM.h(jK);
            String str = vqi.a;
            srk.c(this.j.m().c, bleVar.a);
            this.g.getClass();
            int iMin = (int) Math.min(1L, (j3 - jK) + 1);
            if (j11 != j9) {
                while (iMin > 1 && o95VarM.h((((long) iMin) + jK) - 1) >= j11) {
                    iMin--;
                }
            }
            n11Var.c = l(o95VarM, u25Var, this.d, this.j.s(), this.j.t(), this.j.i(), jK, iMin, list.isEmpty() ? j2 : j9, jX3);
        }
    }

    @Override // defpackage.e15
    public final void e(uq3 uq3Var) {
        String str;
        long j = uq3Var.h;
        if (uq3Var instanceof dg8) {
            int iN = this.j.n(((dg8) uq3Var).d);
            o95[] o95VarArr = this.i;
            o95 o95Var = o95VarArr[iN];
            if (o95Var.d == null) {
                q51 q51Var = o95Var.a;
                q51Var.getClass();
                vq3 vq3VarA = q51Var.a();
                if (vq3VarA != null) {
                    ble bleVar = o95Var.b;
                    o95VarArr[iN] = new o95(o95Var.e, bleVar, o95Var.c, o95Var.a, o95Var.f, new gj2(vq3VarA, bleVar.c, 3));
                }
            }
        }
        w3d w3dVar = this.h;
        if (w3dVar != null) {
            long j2 = w3dVar.d;
            if (j2 == -9223372036854775807L || j > j2) {
                w3dVar.d = j;
            }
            w3dVar.e.g = true;
        }
        if (!(uq3Var instanceof ft9) || (str = uq3Var.d.n) == null || z5h.K0(str, "video/", false) || z5h.K0(str, "audio/", false)) {
            return;
        }
        z5h.K0(str, "text/", false);
    }

    @Override // defpackage.e15
    public final boolean f(long j, uq3 uq3Var, List list) {
        if (this.m != null) {
            return false;
        }
        return this.j.c(j, uq3Var, list);
    }

    @Override // defpackage.e15
    public final void g(k15 k15Var, int i) {
        o95[] o95VarArr = this.i;
        try {
            this.k = k15Var;
            this.l = i;
            long jE = k15Var.e(i);
            ArrayList arrayListA = a();
            for (int i2 = 0; i2 < o95VarArr.length; i2++) {
                o95VarArr[i2] = o95VarArr[i2].a(jE, (ble) arrayListA.get(this.j.e(i2)));
            }
        } catch (BehindLiveWindowException e) {
            this.m = e;
        }
    }

    @Override // defpackage.e15
    public final void h(rg6 rg6Var) {
        this.j = rg6Var;
    }

    @Override // defpackage.e15
    public final int i(long j, List list) {
        return (this.m != null || this.j.length() < 2) ? list.size() : this.j.q(j, list);
    }

    @Override // defpackage.e15
    public boolean j(uq3 uq3Var, boolean z, mf mfVar, l6m l6mVar) {
        dc1 dc1VarN;
        long jMax;
        if (z) {
            w3d w3dVar = this.h;
            if (w3dVar == null || !w3dVar.i(uq3Var)) {
                boolean z2 = this.k.d;
                o95[] o95VarArr = this.i;
                if (!z2 && (uq3Var instanceof ft9)) {
                    IOException iOException = (IOException) mfVar.c;
                    if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).c == 404) {
                        o95 o95Var = o95VarArr[this.j.n(uq3Var.d)];
                        long jE = o95Var.e();
                        if (jE != -1 && jE != 0) {
                            if (((ft9) uq3Var).a() > (o95Var.c() + jE) - 1) {
                                this.n = true;
                                return true;
                            }
                        }
                    }
                }
                o95 o95Var2 = o95VarArr[this.j.n(uq3Var.d)];
                ble bleVar = o95Var2.b;
                ws0 ws0Var = o95Var2.c;
                c98 c98Var = bleVar.b;
                ljf ljfVar = this.b;
                ws0 ws0VarW = ljfVar.W(c98Var);
                if (ws0VarW == null || ws0Var.equals(ws0VarW)) {
                    rg6 rg6Var = this.j;
                    c98 c98Var2 = o95Var2.b.b;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    int length = rg6Var.length();
                    int i = 0;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (rg6Var.a(i2, jElapsedRealtime)) {
                            i++;
                        }
                    }
                    int iG = ljf.G(c98Var2);
                    xu6 xu6Var = new xu6(iG, iG - ljfVar.H(c98Var2), length, i);
                    if ((xu6Var.a(2) || xu6Var.a(1)) && (dc1VarN = l6mVar.n(xu6Var, mfVar)) != null) {
                        long j = dc1VarN.b;
                        int i3 = dc1VarN.a;
                        if (xu6Var.a(i3)) {
                            if (i3 == 2) {
                                rg6 rg6Var2 = this.j;
                                return rg6Var2.g(rg6Var2.n(uq3Var.d), j);
                            }
                            if (i3 == 1) {
                                long jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                String str = ws0Var.b;
                                HashMap map = (HashMap) ljfVar.b;
                                if (map.containsKey(str)) {
                                    Long l = (Long) map.get(str);
                                    String str2 = vqi.a;
                                    jMax = Math.max(jElapsedRealtime2, l.longValue());
                                } else {
                                    jMax = jElapsedRealtime2;
                                }
                                map.put(str, Long.valueOf(jMax));
                                int i4 = ws0Var.c;
                                if (i4 != Integer.MIN_VALUE) {
                                    Integer numValueOf = Integer.valueOf(i4);
                                    HashMap map2 = (HashMap) ljfVar.c;
                                    if (map2.containsKey(numValueOf)) {
                                        Long l2 = (Long) map2.get(numValueOf);
                                        String str3 = vqi.a;
                                        jElapsedRealtime2 = Math.max(jElapsedRealtime2, l2.longValue());
                                    }
                                    map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final o95 m(int i) {
        o95[] o95VarArr = this.i;
        o95 o95Var = o95VarArr[i];
        ws0 ws0VarW = this.b.W(o95Var.b.b);
        if (ws0VarW == null || ws0VarW.equals(o95Var.c)) {
            return o95Var;
        }
        o95 o95Var2 = new o95(o95Var.e, o95Var.b, ws0VarW, o95Var.a, o95Var.f, o95Var.d);
        o95VarArr[i] = o95Var2;
        return o95Var2;
    }

    @Override // defpackage.e15
    public final void release() {
        for (o95 o95Var : this.i) {
            q51 q51Var = o95Var.a;
            if (q51Var != null) {
                q51Var.a.release();
            }
        }
    }
}
