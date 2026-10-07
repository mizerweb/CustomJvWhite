package defpackage;

import android.os.SystemClock;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n95 implements e15 {
    public final aa9 a;
    public final ljf b;
    public final int[] c;
    public final int d;
    public final u25 e;
    public final long f;
    public final int g;
    public final w3d h;
    public final l95[] i;
    public rg6 j;
    public k15 k;
    public int l;
    public BehindLiveWindowException m;
    public boolean n;

    public n95(ab5 ab5Var, aa9 aa9Var, k15 k15Var, ljf ljfVar, int i, int[] iArr, rg6 rg6Var, int i2, u25 u25Var, long j, int i3, boolean z, ArrayList arrayList, w3d w3dVar) {
        this.a = aa9Var;
        this.k = k15Var;
        this.b = ljfVar;
        this.c = iArr;
        this.j = rg6Var;
        int i4 = i2;
        this.d = i4;
        this.e = u25Var;
        this.l = i;
        this.f = j;
        this.g = i3;
        w3d w3dVar2 = w3dVar;
        this.h = w3dVar2;
        long jE = k15Var.e(i);
        ArrayList arrayListA = a();
        this.i = new l95[rg6Var.length()];
        int i5 = 0;
        while (i5 < this.i.length) {
            ble bleVar = (ble) arrayListA.get(rg6Var.e(i5));
            ws0 ws0VarW = ljfVar.W(bleVar.b);
            l95[] l95VarArr = this.i;
            ws0 ws0Var = ws0VarW == null ? (ws0) bleVar.b.get(0) : ws0VarW;
            q51 q51VarB = ab5Var.b(i4, bleVar.a, z, arrayList, w3dVar2);
            long j2 = jE;
            l95VarArr[i5] = new l95(j2, bleVar, ws0Var, q51VarB, 0L, bleVar.c());
            i5++;
            w3dVar2 = w3dVar;
            jE = j2;
            i4 = i2;
        }
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

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    @Override // defpackage.e15
    public final long c(long j, ybf ybfVar) {
        long jE;
        for (l95 l95Var : this.i) {
            x15 x15Var = (x15) l95Var.f;
            long j2 = l95Var.b;
            x15 x15Var2 = (x15) l95Var.f;
            if (x15Var != null) {
                long jC = l95Var.c();
                if (jC != 0) {
                    x15Var2.getClass();
                    long jN = x15Var2.n(j, l95Var.a) + j2;
                    long jE2 = l95Var.e(jN);
                    if (jE2 >= j) {
                        jE = jE2;
                    } else {
                        if (jC != -1) {
                            x15Var2.getClass();
                            if (jN >= ((x15Var2.H() + j2) + jC) - 1) {
                                jE = jE2;
                            }
                        }
                        jE = l95Var.e(jN + 1);
                    }
                    return ybfVar.a(j, jE2, jE);
                }
            }
        }
        return j;
    }

    /* JADX WARN: Failed to calculate best type for var: r15v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v14 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v16 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v5 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v6 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v2 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // defpackage.e15
    public final void d(defpackage.fa9 r63, long r64, java.util.List r66, defpackage.n11 r67) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n95.d(fa9, long, java.util.List, n11):void");
    }

    @Override // defpackage.e15
    public final void e(uq3 uq3Var) {
        if (uq3Var instanceof dg8) {
            int iN = this.j.n(((dg8) uq3Var).d);
            l95[] l95VarArr = this.i;
            l95 l95Var = l95VarArr[iN];
            if (((x15) l95Var.f) == null) {
                q51 q51Var = (q51) l95Var.c;
                q51Var.getClass();
                vq3 vq3VarA = q51Var.a();
                if (vq3VarA != null) {
                    ble bleVar = (ble) l95Var.d;
                    l95VarArr[iN] = new l95(l95Var.a, bleVar, (ws0) l95Var.e, (q51) l95Var.c, l95Var.b, new gj2(vq3VarA, bleVar.c, 3));
                }
            }
        }
        w3d w3dVar = this.h;
        if (w3dVar != null) {
            long j = w3dVar.d;
            if (j == -9223372036854775807L || uq3Var.h > j) {
                w3dVar.d = uq3Var.h;
            }
            w3dVar.e.g = true;
        }
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
        l95[] l95VarArr = this.i;
        try {
            this.k = k15Var;
            this.l = i;
            long jE = k15Var.e(i);
            ArrayList arrayListA = a();
            for (int i2 = 0; i2 < l95VarArr.length; i2++) {
                l95VarArr[i2] = l95VarArr[i2].a(jE, (ble) arrayListA.get(this.j.e(i2)));
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
    public final boolean j(uq3 uq3Var, boolean z, mf mfVar, l6m l6mVar) {
        dc1 dc1VarN;
        long jMax;
        if (z) {
            w3d w3dVar = this.h;
            if (w3dVar == null || !w3dVar.i(uq3Var)) {
                boolean z2 = this.k.d;
                l95[] l95VarArr = this.i;
                if (!z2 && (uq3Var instanceof ft9)) {
                    IOException iOException = (IOException) mfVar.c;
                    if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).c == 404) {
                        l95 l95Var = l95VarArr[this.j.n(uq3Var.d)];
                        long jC = l95Var.c();
                        if (jC != -1 && jC != 0) {
                            x15 x15Var = (x15) l95Var.f;
                            x15Var.getClass();
                            if (((ft9) uq3Var).a() > ((x15Var.H() + l95Var.b) + jC) - 1) {
                                this.n = true;
                                return true;
                            }
                        }
                    }
                }
                l95 l95Var2 = l95VarArr[this.j.n(uq3Var.d)];
                ble bleVar = (ble) l95Var2.d;
                ws0 ws0Var = (ws0) l95Var2.e;
                c98 c98Var = bleVar.b;
                ljf ljfVar = this.b;
                ws0 ws0VarW = ljfVar.W(c98Var);
                if (ws0VarW == null || ws0Var.equals(ws0VarW)) {
                    rg6 rg6Var = this.j;
                    c98 c98Var2 = ((ble) l95Var2.d).b;
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

    public final l95 k(int i) {
        l95[] l95VarArr = this.i;
        l95 l95Var = l95VarArr[i];
        ws0 ws0VarW = this.b.W(((ble) l95Var.d).b);
        if (ws0VarW == null || ws0VarW.equals((ws0) l95Var.e)) {
            return l95Var;
        }
        l95 l95Var2 = new l95(l95Var.a, (ble) l95Var.d, ws0VarW, (q51) l95Var.c, l95Var.b, (x15) l95Var.f);
        l95VarArr[i] = l95Var2;
        return l95Var2;
    }

    @Override // defpackage.e15
    public final void release() {
        for (l95 l95Var : this.i) {
            q51 q51Var = (q51) l95Var.c;
            if (q51Var != null) {
                q51Var.a.release();
            }
        }
    }
}
