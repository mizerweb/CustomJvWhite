package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import one.me.sdk.statistics.perf.utils.FailMetricException;
import one.me.sdk.statistics.perf.utils.ImplicitTimeInLazyRegistrarException;
import one.me.sdk.statistics.perf.utils.PerfListenerException;

/* JADX INFO: loaded from: classes.dex */
public abstract class qrc implements zqc {
    public erc a;
    public final String b = getClass().getName();
    public final b9b c;
    public final b9b d;
    public final b9b e;
    public final pzf f;

    public qrc(erc ercVar) {
        this.a = ercVar;
        long[] jArr = q1f.a;
        this.c = new b9b();
        this.d = new b9b();
        this.e = new b9b();
        pzf pzfVarA = e9i.a(10, Integer.MAX_VALUE, 2);
        this.f = pzfVarA;
        if (!this.a.a) {
            y();
        }
        if (this.a.b) {
            pzfVarA.a(qqc.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object e(qrc qrcVar, nq4 nq4Var) {
        orc orcVar;
        long j;
        long j2;
        Iterator it;
        long j3;
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.d;
        if (nq4Var instanceof orc) {
            orcVar = (orc) nq4Var;
            int i = orcVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                orcVar.h = i - Integer.MIN_VALUE;
            } else {
                orcVar = new orc(qrcVar, nq4Var);
            }
        } else {
            orcVar = new orc(qrcVar, nq4Var);
        }
        Object objB = orcVar.f;
        Object obj = hu4.a;
        int i2 = orcVar.h;
        if (i2 == 0) {
            ch3.d0(objB);
            erc ercVar = qrcVar.a;
            if (!ercVar.b) {
                String str = qrcVar.b;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var2 = je9.f;
                    if (a4cVar.b(je9Var2)) {
                        a4cVar.c(je9Var2, str, "Trying to use persistent API with incorrect config", null);
                    }
                }
                return sbiVar;
            }
            b5d b5dVar = ((e5d) ercVar.c().e.getValue()).s2;
            zv8[] zv8VarArr = e5d.S6;
            long j4 = ((hrc) b5dVar.a(zv8VarArr[174]).i()).a;
            long j5 = ((hrc) ((e5d) qrcVar.a.c().e.getValue()).s2.a(zv8VarArr[174]).i()).e;
            ftc ftcVarB = qrcVar.a.b();
            List list = (List) qrcVar.a.c.b;
            orcVar.d = j4;
            orcVar.e = j5;
            orcVar.h = 1;
            objB = ftcVarB.b(list, orcVar);
            if (objB == obj) {
                return obj;
            }
            j = j4;
            j2 = j5;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = orcVar.e;
            j = orcVar.d;
            ch3.d0(objB);
        }
        List list2 = (List) objB;
        String str2 = qrcVar.b;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, zo5.h(list2.size(), "Restoring from db metrics size->"), null);
        }
        u8b u8bVar = new u8b();
        u8b u8bVar2 = new u8b();
        u8b u8bVar3 = new u8b();
        u8b u8bVar4 = new u8b();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            pxa pxaVar = (pxa) it2.next();
            ghb ghbVar = ew5.b;
            long j6 = j;
            if (ew5.d(ew5.o(wtl.a(), pxaVar.d), j2) > 0) {
                String str3 = qrcVar.b;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, str3, "RestoreMetrics: metric is expired -> " + pxaVar, null);
                }
                u8bVar4.b(pxaVar);
            } else {
                if (pxaVar.e) {
                    String str4 = qrcVar.b;
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                        a4cVar4.c(je9Var, str4, "RestoreMetrics: metric is already failed due to max attempts -> " + pxaVar, null);
                    }
                    u8bVar.b(pxaVar);
                } else if (pxaVar.c >= j6) {
                    String str5 = qrcVar.b;
                    a4c a4cVar5 = gm0.f;
                    if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                        a4cVar5.c(je9Var, str5, "RestoreMetrics: metric exceeded max attempts, marking as failed -> " + pxaVar, null);
                    }
                    j3 = j2;
                    it = it2;
                    u8bVar.b(new pxa(pxaVar.a, pxaVar.b, pxaVar.c, pxaVar.d, true, pxaVar.f, pxaVar.g));
                    u8bVar3.b(pxaVar);
                } else {
                    it = it2;
                    j3 = j2;
                    u8bVar.b(pxaVar);
                    u8bVar2.b(pxaVar);
                    String str6 = qrcVar.b;
                    a4c a4cVar6 = gm0.f;
                    if (a4cVar6 != null && a4cVar6.b(je9Var)) {
                        a4cVar6.c(je9Var, str6, "RestoreMetrics: successfully restored -> " + pxaVar, null);
                    }
                }
                j = j6;
                j2 = j3;
                it2 = it;
            }
            it = it2;
            j3 = j2;
            j = j6;
            j2 = j3;
            it2 = it;
        }
        b9b b9bVar = qrcVar.c;
        Object[] objArr = u8bVar.a;
        int i3 = u8bVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            pxa pxaVar2 = (pxa) objArr[i4];
            b9bVar.o(new owh(pxaVar2.b), pxaVar2);
        }
        Object[] objArr2 = u8bVar3.a;
        int i5 = u8bVar3.b;
        for (int i6 = 0; i6 < i5; i6++) {
            qrcVar.w((pxa) objArr2[i6], mrc.MAX_PERSISTENT_ATTEMPTS, null);
        }
        yab.i0(new krc(qrcVar.a.d()), null, 0, new xra(7, (lq4) null, qrcVar, u8bVar2, u8bVar4, u8bVar3), 3);
        return sbiVar;
    }

    public static final String f(qrc qrcVar, pxa pxaVar) {
        return nbh.w("Metric(", pxaVar.a, "-", pxaVar.b, ")");
    }

    public static final String g(qrc qrcVar, String str) {
        String strR = qrcVar.r();
        String strConcat = str != null ? "-".concat(str) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        return c0a.o("Metric(", strR.concat(strConcat), ")");
    }

    public static void j(qrc qrcVar, String str, u8b u8bVar, b9b b9bVar) {
        qrcVar.f.a(new pqc(str, b9bVar, u8bVar));
    }

    public static void k(qrc qrcVar, String str, int i, String str2, boolean z, Long l, p1f p1fVar, int i2) {
        wdg wdgVar = wdg.TAKE_FIRST;
        boolean z2 = (i2 & 8) != 0 ? false : z;
        Long l2 = (i2 & 16) != 0 ? null : l;
        p1f p1fVar2 = (i2 & 32) != 0 ? q1f.b : p1fVar;
        if ((i2 & 64) != 0) {
            wdgVar = wdg.TAKE_LAST;
        }
        wdg wdgVar2 = wdgVar;
        if (qrcVar.a.a && l2 == null) {
            ImplicitTimeInLazyRegistrarException implicitTimeInLazyRegistrarException = new ImplicitTimeInLazyRegistrarException(qv1.l("Adding span to metric=", qrcVar.r(), ", span=", str));
            String str3 = qrcVar.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str3, g(qrcVar, str2).concat(": Trying to add span to metric in lazy mode with implicit sliceTime!"), implicitTimeInLazyRegistrarException);
                }
            }
        }
        qrcVar.f.a(new mqc(str2, p1fVar2, str, i, l2 != null ? l2.longValue() : qrcVar.a.a(), z2, wdgVar2));
    }

    public static void m(qrc qrcVar, lrc lrcVar, String str, String str2, int i) {
        b9b b9bVar = q1f.b;
        if ((i & 8) != 0) {
            str2 = null;
        }
        qrcVar.n(lrcVar, str, b9bVar, str2);
    }

    public static void o(qrc qrcVar, lrc lrcVar, String str, b9b b9bVar, String str2, int i) {
        if ((i & 4) != 0) {
            b9bVar = q1f.b;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        qrcVar.n(lrcVar, str, b9bVar, str2);
    }

    public static void p(qrc qrcVar, lrc lrcVar, b9b b9bVar) {
        qrcVar.getClass();
        o(qrcVar, lrcVar, x(qrcVar, null, b9bVar, null, null, 13), null, null, 20);
    }

    public static String x(qrc qrcVar, String str, p1f p1fVar, Long l, String str2, int i) {
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
        }
        String str3 = str;
        if ((i & 2) != 0) {
            p1fVar = q1f.b;
        }
        p1f p1fVar2 = p1fVar;
        if ((i & 4) != 0) {
            l = null;
        }
        String str4 = (i & 8) != 0 ? null : str2;
        if (qrcVar.a.a && l == null) {
            ImplicitTimeInLazyRegistrarException implicitTimeInLazyRegistrarException = new ImplicitTimeInLazyRegistrarException("Starting metric=".concat(qrcVar.r()));
            String str5 = qrcVar.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str5, g(qrcVar, str3).concat(": Trying to start metric in lazy mode with implicit sliceTime!"), implicitTimeInLazyRegistrarException);
                }
            }
        }
        qrcVar.f.a(new sqc(str3, p1fVar2, l != null ? l.longValue() : qrcVar.a.a(), str4));
        return str3;
    }

    public final void h(b9b b9bVar, String str) {
        this.f.a(new kqc(b9bVar, str));
    }

    public final void i(String str, ylc ylcVar) {
        this.f.a(new kqc(q1f.c(ylcVar), str));
    }

    public final void l(String str) {
        if (this.a.b) {
            vo8 vo8Var = (vo8) this.e.m(new owh(str));
            if (vo8Var != null) {
                vo8Var.b(null);
            }
        }
    }

    public final void n(lrc lrcVar, String str, p1f p1fVar, String str2) {
        if (this.a.a) {
            ImplicitTimeInLazyRegistrarException implicitTimeInLazyRegistrarException = new ImplicitTimeInLazyRegistrarException("Starting metric=".concat(r()));
            String str3 = this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str3, g(this, str).concat(": Trying to fail metric in lazy mode with implicit sliceTime!"), implicitTimeInLazyRegistrarException);
                }
            }
        }
        this.f.a(new oqc(str, p1fVar, this.a.a(), lrcVar, str2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object q(String str, lrc lrcVar, String str2, nq4 nq4Var) {
        nrc nrcVar;
        pxa pxaVar;
        pxa pxaVar2;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof nrc) {
            nrcVar = (nrc) nq4Var;
            int i = nrcVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrcVar.i = i - Integer.MIN_VALUE;
            } else {
                nrcVar = new nrc(this, nq4Var);
            }
        } else {
            nrcVar = new nrc(this, nq4Var);
        }
        Object obj = nrcVar.g;
        hu4 hu4Var = hu4.a;
        int i2 = nrcVar.i;
        if (i2 == 0) {
            ch3.d0(obj);
            pxaVar = (pxa) this.c.m(new owh(str));
            if (pxaVar == null) {
                String str3 = this.b;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str3, g(this, str).concat(": No metric for that traceId!"), null);
                    }
                }
                return sbiVar;
            }
            erc ercVar = this.a;
            if (ercVar.b) {
                ftc ftcVarB = ercVar.b();
                String str4 = pxaVar.b;
                nrcVar.d = lrcVar;
                nrcVar.e = str2;
                nrcVar.f = pxaVar;
                nrcVar.i = 1;
                if (ftcVarB.a(str4, nrcVar) == hu4Var) {
                    return hu4Var;
                }
                pxaVar2 = pxaVar;
            }
            w(pxaVar, lrcVar, str2);
            return sbiVar;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pxaVar2 = nrcVar.f;
        str2 = nrcVar.e;
        lrcVar = nrcVar.d;
        ch3.d0(obj);
        pxaVar = pxaVar2;
        w(pxaVar, lrcVar, str2);
        return sbiVar;
    }

    public final String r() {
        return this.a.c.toString();
    }

    public final void s(pxa pxaVar, int i) {
        Object poeVar;
        je9 je9Var = je9.f;
        Object poeVar2 = sbi.a;
        u8b u8bVar = this.a.e;
        Object[] objArr = u8bVar.a;
        int i2 = u8bVar.b;
        for (int i3 = 0; i3 < i2; i3++) {
            zqc zqcVar = (zqc) objArr[i3];
            try {
                t(zqcVar, pxaVar, i);
                poeVar = poeVar2;
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                String name = zqcVar.getClass().getName();
                String str = this.b;
                PerfListenerException perfListenerException = new PerfListenerException(name, thA);
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "PerfListener callback failed, listener=".concat(name), perfListenerException);
                }
            }
        }
        try {
            c(pxaVar, i);
        } catch (Throwable th2) {
            poeVar2 = new poe(th2);
        }
        Throwable thA2 = roe.a(poeVar2);
        if (thA2 != null) {
            String name2 = getClass().getName();
            String str2 = this.b;
            PerfListenerException perfListenerException2 = new PerfListenerException(name2, thA2);
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "PerfListener callback failed, listener=".concat(name2), perfListenerException2);
            }
        }
    }

    public final void t(zqc zqcVar, pxa pxaVar, int i) {
        jz0 jz0Var;
        rwh rwhVar;
        rwh rwhVar2;
        long[] jArr;
        pu8 pu8VarC;
        if (!(zqcVar instanceof asc)) {
            zqcVar.c(pxaVar, i);
            return;
        }
        asc ascVar = (asc) zqcVar;
        bsc bscVar = this.a.d;
        List listA = pxaVar.a();
        if (listA.isEmpty()) {
            String str = ascVar.d;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "recordMetric: empty spans", null);
                return;
            }
            return;
        }
        ul9 ul9Var = new ul9(pxaVar.g.e);
        b9b b9bVar = pxaVar.g;
        Object[] objArr = b9bVar.b;
        Object[] objArr2 = b9bVar.c;
        long[] jArr2 = b9bVar.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            String str2 = (String) obj;
                            if (obj2 instanceof Boolean) {
                                pu8VarC = kt8.a((Boolean) obj2);
                            } else if (obj2 instanceof Float) {
                                Number number = (Number) obj2;
                                pu8VarC = Math.abs(number.floatValue()) <= Float.MAX_VALUE ? kt8.b(number) : kt8.c(String.valueOf(number.floatValue()));
                            } else if (obj2 instanceof Double) {
                                Number number2 = (Number) obj2;
                                pu8VarC = Math.abs(number2.doubleValue()) <= Double.MAX_VALUE ? kt8.b(number2) : kt8.c(String.valueOf(number2.doubleValue()));
                            } else if (obj2 instanceof Number) {
                                pu8VarC = kt8.b((Number) obj2);
                            } else if (obj2 instanceof byte[]) {
                                pu8VarC = kt8.c(Arrays.toString((byte[]) obj2));
                            } else {
                                pu8VarC = obj2 instanceof String ? kt8.c((String) obj2) : kt8.c(obj2.toString());
                            }
                            ul9Var.put(str2, pu8VarC);
                        }
                        j >>= i3;
                        i5++;
                        i3 = i3;
                        jArr2 = jArr2;
                    }
                    jArr = jArr2;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr2 = jArr;
            }
        }
        ul9 ul9VarB = ul9Var.b();
        String str3 = pxaVar.a;
        gm0 gm0Var = bscVar.a;
        if (!cqk.d(gm0Var, yyh.k)) {
            if (gm0Var instanceof xyh) {
                rwhVar2 = new rwh("UI", "shared:UI");
            } else if (!cqk.d(gm0Var, wyh.k)) {
                ore.o();
                return;
            } else {
                jz0Var = null;
                rwhVar = new rwh(str3, null);
            }
            yab.i0(ascVar.b, jz0Var, 0, new ai8(ascVar, new wrc(str3, rwhVar, pxaVar.b, i, listA, ul9VarB, ((Number) ascVar.a.invoke()).longValue()), jz0Var, 17), 3);
        }
        rwhVar2 = new rwh(str3, "single:".concat(str3));
        rwhVar = rwhVar2;
        jz0Var = null;
        yab.i0(ascVar.b, jz0Var, 0, new ai8(ascVar, new wrc(str3, rwhVar, pxaVar.b, i, listA, ul9VarB, ((Number) ascVar.a.invoke()).longValue()), jz0Var, 17), 3);
    }

    public final void u() {
        Object poeVar;
        je9 je9Var = je9.f;
        sbi sbiVar = sbi.a;
        u8b u8bVar = this.a.e;
        Object[] objArr = u8bVar.a;
        int i = u8bVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            zqc zqcVar = (zqc) objArr[i2];
            try {
                zqcVar.getClass();
                poeVar = sbiVar;
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                String name = zqcVar.getClass().getName();
                String str = this.b;
                PerfListenerException perfListenerException = new PerfListenerException(name, thA);
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "PerfListener callback failed, listener=".concat(name), perfListenerException);
                }
            }
        }
        Throwable thA2 = roe.a(sbiVar);
        if (thA2 != null) {
            String name2 = getClass().getName();
            String str2 = this.b;
            PerfListenerException perfListenerException2 = new PerfListenerException(name2, thA2);
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "PerfListener callback failed, listener=".concat(name2), perfListenerException2);
            }
        }
    }

    public final void v(cf7 cf7Var) {
        erc ercVar = this.a;
        if (!ercVar.a) {
            String str = this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Post construct is available only for lazy mode!", null);
                return;
            }
            return;
        }
        drc drcVar = new drc();
        drcVar.c = ercVar.a;
        drcVar.g = ercVar.b;
        drcVar.e = ercVar.j;
        drcVar.d = ercVar.f;
        drcVar.f = ercVar.i;
        drcVar.h = ercVar.k;
        u8b u8bVar = ercVar.g;
        u8b u8bVar2 = drcVar.j;
        u8bVar2.f();
        u8bVar2.c(u8bVar);
        drcVar.i = ercVar.h;
        drcVar.a = ercVar.c;
        drcVar.b = ercVar.d;
        drcVar.k.c(ercVar.e);
        drc drcVar2 = (drc) cf7Var.invoke(drcVar);
        drcVar2.c = false;
        this.a = drcVar2.a();
        y();
    }

    public final void w(pxa pxaVar, lrc lrcVar, String str) {
        Object poeVar;
        lrc lrcVar2;
        String str2;
        Object next;
        Object poeVar2;
        Object poeVar3;
        je9 je9Var = je9.d;
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        je9 je9Var2 = je9.f;
        b9b b9bVar2 = new b9b();
        u8b u8bVar = this.a.e;
        Object[] objArr = u8bVar.a;
        int i = u8bVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            zqc zqcVar = (zqc) objArr[i2];
            Object obj = q1f.b;
            try {
                poeVar3 = zqcVar.d(pxaVar);
            } catch (Throwable th) {
                poeVar3 = new poe(th);
            }
            Throwable thA = roe.a(poeVar3);
            if (thA != null) {
                String name = zqcVar.getClass().getName();
                String str3 = this.b;
                PerfListenerException perfListenerException = new PerfListenerException(name, thA);
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var2)) {
                    a4cVar.c(je9Var2, str3, "PerfListener callback failed, listener=".concat(name), perfListenerException);
                }
            }
            if (!(poeVar3 instanceof poe)) {
                obj = poeVar3;
            }
            b9bVar2.l((p1f) obj);
        }
        Object obj2 = q1f.b;
        try {
            poeVar = d(pxaVar);
        } catch (Throwable th2) {
            poeVar = new poe(th2);
        }
        Throwable thA2 = roe.a(poeVar);
        if (thA2 != null) {
            String name2 = getClass().getName();
            String str4 = this.b;
            PerfListenerException perfListenerException2 = new PerfListenerException(name2, thA2);
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str4, "PerfListener callback failed, listener=".concat(name2), perfListenerException2);
            }
        }
        if (!(poeVar instanceof poe)) {
            obj2 = poeVar;
        }
        b9bVar2.l((p1f) obj2);
        b9bVar.l(b9bVar2);
        b9bVar.l(pxaVar.g);
        String str5 = this.b;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, str5, f(this, pxaVar) + ": " + ((Object) ("Local props before collect -> " + b9bVar)), null);
        }
        Object poeVar4 = sbi.a;
        u8b u8bVar2 = this.a.e;
        Object[] objArr2 = u8bVar2.a;
        int i3 = u8bVar2.b;
        for (int i4 = 0; i4 < i3; i4++) {
            zqc zqcVar2 = (zqc) objArr2[i4];
            try {
                zqcVar2.b(pxaVar, b9bVar);
                poeVar2 = poeVar4;
            } catch (Throwable th3) {
                poeVar2 = new poe(th3);
            }
            Throwable thA3 = roe.a(poeVar2);
            if (thA3 != null) {
                String name3 = zqcVar2.getClass().getName();
                String str6 = this.b;
                PerfListenerException perfListenerException3 = new PerfListenerException(name3, thA3);
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                    a4cVar4.c(je9Var2, str6, "PerfListener callback failed, listener=".concat(name3), perfListenerException3);
                }
            }
        }
        try {
            b(pxaVar, b9bVar);
        } catch (Throwable th4) {
            poeVar4 = new poe(th4);
        }
        Throwable thA4 = roe.a(poeVar4);
        if (thA4 != null) {
            String name4 = getClass().getName();
            String str7 = this.b;
            PerfListenerException perfListenerException4 = new PerfListenerException(name4, thA4);
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null && a4cVar5.b(je9Var2)) {
                a4cVar5.c(je9Var2, str7, "PerfListener callback failed, listener=".concat(name4), perfListenerException4);
            }
        }
        String str8 = this.b;
        a4c a4cVar6 = gm0.f;
        if (a4cVar6 != null && a4cVar6.b(je9Var)) {
            a4cVar6.c(je9Var, str8, f(this, pxaVar) + ": " + ((Object) ("Local props after collect -> " + b9bVar)), null);
        }
        List listA = pxaVar.a();
        if (lrcVar != null) {
            lrcVar2 = lrcVar;
            break;
        }
        Iterator it = ((List) this.a.m.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                lrcVar2 = lrcVar;
                break;
            }
            lrc lrcVarA = ((yc6) it.next()).a(this, pxaVar.a, b9bVar, listA, lrcVar);
            if (!cqk.d(lrcVarA, lrcVar)) {
                lrcVar2 = lrcVarA;
                break;
            }
        }
        String str9 = this.b;
        a4c a4cVar7 = gm0.f;
        if (a4cVar7 != null && a4cVar7.b(je9Var)) {
            String strF = f(this, pxaVar);
            StringBuilder sb = new StringBuilder("Collected:\n            |code=");
            sb.append(lrcVar2);
            sb.append("\n            |spans=");
            sb.append(listA);
            sb.append("\n            |props=");
            sb.append(b9bVar);
            sb.append("\n            |errorDesc=");
            str2 = str;
            sb.append(str2);
            sb.append("\n            ");
            a4cVar7.c(je9Var, str9, strF + ": " + ((Object) s5h.y0(sb.toString())), null);
        } else {
            str2 = str;
        }
        boolean z = lrcVar2 != null;
        if (z) {
            if (wk8.w(((f5d) ((wo6) this.a.c().d.getValue())).j().a(pxaVar.a), 0)) {
                FailMetricException failMetricException = new FailMetricException(pxaVar.a, lrcVar2);
                String str10 = pxaVar.b;
                String str11 = this.b;
                a4c a4cVar8 = gm0.f;
                if (a4cVar8 != null && a4cVar8.b(je9Var2)) {
                    a4cVar8.c(je9Var2, str11, g(this, str10) + ": " + ((Object) ("Sending fail of '" + pxaVar.a + "' to tracer with errorType=" + lrcVar2)), failMetricException);
                }
            }
        }
        s(pxaVar, z ? 2 : 1);
        for (hc6 hc6Var : (List) this.a.l.getValue()) {
            if (hc6Var instanceof zj5) {
                zj5 zj5Var = (zj5) hc6Var;
                String str12 = pxaVar.a;
                Iterator it2 = xj5.y.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!((xj5) next).a.equals(str12));
                xj5 xj5Var = (xj5) next;
                if (xj5Var != null) {
                    int iA = ((f5d) ((wo6) zj5Var.a.d.getValue())).j().a(xj5Var.a);
                    if (wk8.w(iA, 1) || (z && wk8.w(iA, 2))) {
                    }
                }
                str2 = str;
            }
            hc6Var.a(pxaVar.a, b9bVar, listA, lrcVar2, str2);
            str2 = str;
        }
    }

    public final void y() {
        yab.i0(new krc(this.a.d()), null, 4, new ky6(new fz6(new dab(new fz6(this.f, new wyj(this, null, 11)), this, 2), new ai8(this, null, 16), 3), null, 0), 1);
    }
}
