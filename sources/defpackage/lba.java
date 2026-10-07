package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class lba {
    public final Context a;
    public final trc b;
    public final qv0 c;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final dq4 m;
    public final Debug.MemoryInfo n;
    public final ActivityManager.MemoryInfo o;
    public final ActivityManager.RunningAppProcessInfo p;
    public final Debug.MemoryInfo q;
    public final ActivityManager.MemoryInfo r;
    public final ActivityManager.RunningAppProcessInfo s;
    public final pzf t;
    public final pzf u;
    public final String d = lba.class.getName();
    public final zaa i = new zaa();
    public final ny8 j = rx8.P(3, new ap9(1, this));
    public final ny8 k = rx8.P(3, new j68(11));
    public final AtomicBoolean l = new AtomicBoolean(false);

    public lba(qv0 qv0Var, yt4 yt4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, trc trcVar, xhh xhhVar, Context context) {
        this.a = context;
        this.b = trcVar;
        this.c = qv0Var;
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = ny8Var3;
        this.h = ny8Var4;
        xt4 xt4VarA = ((n0c) xhhVar).a();
        nah nahVarA = wk8.a();
        xt4VarA.getClass();
        this.m = cqk.a(lvb.x0(xt4VarA, nahVarA).u0(new zt4(yt4Var, jba.a)));
        this.n = new Debug.MemoryInfo();
        this.o = new ActivityManager.MemoryInfo();
        this.p = new ActivityManager.RunningAppProcessInfo();
        this.q = new Debug.MemoryInfo();
        this.r = new ActivityManager.MemoryInfo();
        this.s = new ActivityManager.RunningAppProcessInfo();
        this.t = e9i.b(1, 0, 6);
        this.u = e9i.a(1, 32, 2);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final Object a(lba lbaVar, nq4 nq4Var) {
        iba ibaVar;
        long jG;
        je9 je9Var = je9.d;
        je9 je9Var2 = je9.f;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof iba) {
            ibaVar = (iba) nq4Var;
            int i = ibaVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ibaVar.f = i - Integer.MIN_VALUE;
            } else {
                ibaVar = new iba(lbaVar, nq4Var);
            }
        } else {
            ibaVar = new iba(lbaVar, nq4Var);
        }
        Object objH = ibaVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = ibaVar.f;
        if (i2 == 0) {
            ch3.d0(objH);
            qv0 qv0Var = lbaVar.c;
            ibaVar.f = 1;
            objH = qv0Var.h(ibaVar);
            if (objH == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objH);
        }
        List list = (List) objH;
        boolean zIsEmpty = list.isEmpty();
        String str = lbaVar.d;
        if (zIsEmpty) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var2)) {
                a4cVar.c(je9Var2, str, "No snapshots for previous session found", null);
                return sbiVar;
            }
        } else {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str, c0a.k(list.size(), "Restored ", " snapshots"), null);
            }
            uq uqVar = lbaVar.b.b.i;
            if (!uqVar.a()) {
                zaa zaaVar = lbaVar.i;
                ru ruVarB = kuk.b(uqVar);
                List listM1 = ww3.M1(list, new xa8(5));
                bba bbaVar = new bba();
                bbaVar.c(listM1);
                long jB = bbaVar.b();
                long jA = bbaVar.a();
                if (!uqVar.a()) {
                    ghb ghbVar = ew5.b;
                    jG = ew5.g(qe7.P(uqVar.c - uqVar.a, lw5.MILLISECONDS));
                } else if (jA == Long.MIN_VALUE) {
                    jG = 0;
                } else {
                    jG = jA - jB;
                    if (jG < 0) {
                        jG = 0;
                    }
                }
                aba abaVarE = bbaVar.e(uqVar, ruVarB, jG, new i41(zaaVar), new fz7(5, zaaVar), new fz7(6, zaaVar));
                String str2 = lbaVar.d;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, str2, "Calculated report -> " + abaVarE, null);
                }
                ((xaa) lbaVar.g.getValue()).a(abaVarE);
                return sbiVar;
            }
            String str3 = lbaVar.d;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                a4cVar4.c(je9Var2, str3, "Clock dump is empty", null);
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0094 -> B:22:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(defpackage.lba r8, defpackage.nq4 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.kba
            if (r0 == 0) goto L13
            r0 = r9
            kba r0 = (defpackage.kba) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            kba r0 = new kba
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.d
            hu4 r1 = defpackage.hu4.a
            int r2 = r0.f
            r3 = 0
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r5) goto L2b
            defpackage.ch3.d0(r9)
            goto L4c
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            return r3
        L31:
            defpackage.ch3.d0(r9)
            goto L84
        L35:
            defpackage.ch3.d0(r9)
            java.lang.String r9 = r8.d
            a4c r2 = defpackage.gm0.f
            if (r2 != 0) goto L3f
            goto L4c
        L3f:
            je9 r6 = defpackage.je9.d
            boolean r7 = r2.b(r6)
            if (r7 == 0) goto L4c
            java.lang.String r7 = "Starting interval slicer of memory"
            r2.c(r6, r9, r7, r3)
        L4c:
            vt4 r9 = r0.getContext()
            boolean r9 = defpackage.vd7.E(r9)
            if (r9 == 0) goto L97
            ny8 r9 = r8.e
            java.lang.Object r9 = r9.getValue()
            e5d r9 = (defpackage.e5d) r9
            b5d r9 = r9.k3
            zv8[] r2 = defpackage.e5d.S6
            r3 = 220(0xdc, float:3.08E-43)
            r2 = r2[r3]
            i5d r9 = r9.a(r2)
            java.lang.Object r9 = r9.i()
            java.lang.Number r9 = (java.lang.Number) r9
            long r2 = r9.longValue()
            r6 = 10000(0x2710, double:4.9407E-320)
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 >= 0) goto L7b
            r2 = r6
        L7b:
            r0.f = r4
            java.lang.Object r9 = defpackage.rx8.t(r2, r0)
            if (r9 != r1) goto L84
            goto L96
        L84:
            pzf r9 = r8.u
            int r2 = defpackage.px8.h()
            fba r2 = defpackage.fba.a(r2)
            r0.f = r5
            java.lang.Object r9 = r9.emit(r2, r0)
            if (r9 != r1) goto L4c
        L96:
            return r1
        L97:
            sbi r8 = defpackage.sbi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lba.b(lba, nq4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [poe] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    public final pba c(oba obaVar, int i) {
        Object poeVar;
        ?? poeVar2;
        Object poeVar3;
        ny8 ny8Var = this.k;
        Debug.MemoryInfo memoryInfo = this.n;
        oba obaVar2 = oba.CRASH;
        Debug.getMemoryInfo(obaVar == obaVar2 ? this.q : memoryInfo);
        ActivityManager activityManager = (ActivityManager) this.j.getValue();
        ActivityManager.MemoryInfo memoryInfo2 = this.o;
        activityManager.getMemoryInfo(obaVar == obaVar2 ? this.r : memoryInfo2);
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = this.p;
        ActivityManager.getMyMemoryState(obaVar == obaVar2 ? this.s : runningAppProcessInfo);
        try {
            List listM1 = r5h.m1((CharSequence) ww3.r1(lu6.o0(new File("/proc/self/statm"))), new String[]{" "}, 6);
            poeVar = new bj8(bj8.a((int) ((Long.parseLong((String) listM1.get(1)) * ((Number) ny8Var.getValue()).longValue()) / 1048576.0d), (int) ((Long.parseLong((String) listM1.get(2)) * ((Number) ny8Var.getValue()).longValue()) / 1048576.0d)));
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (roe.a(poeVar) != null) {
            poeVar = new bj8(bj8.a(0, 0));
        }
        long j = ((bj8) poeVar).a;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        try {
            ArrayList arrayListB = ((c1c) this.f.getValue()).b();
            poeVar2 = new ArrayList(yw3.W0(arrayListB, 10));
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                poeVar2.add(r5h.s1(((b1c) ((c65) it.next())).c(), "?"));
            }
        } catch (Throwable th2) {
            poeVar2 = new poe(th2);
        }
        boolean z = poeVar2 instanceof poe;
        ?? r10 = poeVar2;
        if (z) {
            r10 = r66.a;
        }
        List list = (List) r10;
        long jB = ((zid) this.h.getValue()).b();
        int nativeHeapAllocatedSize = (int) (Debug.getNativeHeapAllocatedSize() / 1048576.0d);
        try {
            Long lC0 = y5h.C0(Debug.getRuntimeStat("art.gc.gc-count"));
            poeVar3 = Long.valueOf(lC0 != null ? lC0.longValue() : 0L);
        } catch (Throwable th3) {
            poeVar3 = new poe(th3);
        }
        if (poeVar3 instanceof poe) {
            poeVar3 = 0L;
        }
        long jLongValue = ((Number) poeVar3).longValue();
        Integer numValueOf = Integer.valueOf(i);
        if (i == Integer.MIN_VALUE) {
            numValueOf = null;
        }
        return new pba(SystemClock.elapsedRealtime(), obaVar, esk.a(memoryInfo), numValueOf != null ? numValueOf.intValue() : runningAppProcessInfo.lastTrimLevel, memoryInfo2.lowMemory, gm0.J(memoryInfo2.availMem / 1048576.0d), i2, i3, list, jB, runningAppProcessInfo.importance, nativeHeapAllocatedSize, jLongValue);
    }

    public final void d(oba obaVar, int i) {
        bk5 bk5Var = (bk5) ((e5d) this.e.getValue()).j().i();
        bk5Var.getClass();
        zv8 zv8Var = bk5.c[6];
        if (!bk5Var.b("memory")) {
            String str = this.d;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "sliceSnapshot: Memory stat collecting is disabled -> reason=" + obaVar + ", trim=" + i + "!", null);
                return;
            }
            return;
        }
        if (obaVar != oba.CRASH) {
            this.u.a(fba.a(px8.g(obaVar, i)));
            return;
        }
        pba pbaVarC = c(obaVar, i);
        qv0 qv0Var = this.c;
        icg icgVar = (icg) qv0Var.a.getValue();
        ch3.G(icgVar.b, false, true, new hcg(icgVar, qv0Var.i(pbaVarC), 1));
        String str2 = this.d;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 == null) {
            return;
        }
        je9 je9Var2 = je9.d;
        if (a4cVar2.b(je9Var2)) {
            a4cVar2.c(je9Var2, str2, "sliceSnapshot: successfully wrote in db state during OOM -> " + pbaVarC, null);
        }
    }
}
