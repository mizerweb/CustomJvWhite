package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class h0k {
    public final mzj a;
    public final Context b;
    public final String c;
    public final azj d;
    public final ja4 e;
    public final lhb f;
    public final ijd g;
    public final WorkDatabase h;
    public final qzj i;
    public final sh5 j;
    public final ArrayList k;
    public final String l;
    public final wo8 m;

    public h0k(xe4 xe4Var) {
        mzj mzjVar = (mzj) xe4Var.e;
        this.a = mzjVar;
        this.b = (Context) xe4Var.g;
        String str = mzjVar.a;
        this.c = str;
        this.d = (azj) xe4Var.b;
        ja4 ja4Var = (ja4) xe4Var.a;
        this.e = ja4Var;
        this.f = ja4Var.d;
        this.g = (ijd) xe4Var.c;
        WorkDatabase workDatabase = (WorkDatabase) xe4Var.d;
        this.h = workDatabase;
        this.i = workDatabase.x();
        this.j = workDatabase.r();
        ArrayList arrayList = (ArrayList) xe4Var.f;
        this.k = arrayList;
        this.l = zo5.w(qt4.v("Work [ id=", str, ", tags={ "), ww3.z1(arrayList, ",", null, null, null, 62), " } ]");
        this.m = vd7.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final Object a(final h0k h0kVar, nq4 nq4Var) throws Throwable {
        g0k g0kVar;
        String str;
        g0k g0kVar2;
        OverwritingInputMerger overwritingInputMerger;
        OverwritingInputMerger overwritingInputMerger2;
        d25 d25VarE;
        Object b0kVar;
        Throwable th;
        String str2;
        CancellationException e;
        String str3 = h0kVar.l;
        String str4 = h0kVar.c;
        azj azjVar = h0kVar.d;
        WorkDatabase workDatabase = h0kVar.h;
        ja4 ja4Var = h0kVar.e;
        mzj mzjVar = h0kVar.a;
        if (nq4Var instanceof g0k) {
            g0kVar = (g0k) nq4Var;
            int i = g0kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                g0kVar.f = i - Integer.MIN_VALUE;
            } else {
                g0kVar = new g0k(h0kVar, nq4Var);
            }
        } else {
            g0kVar = new g0k(h0kVar, nq4Var);
        }
        Object objK0 = g0kVar.d;
        int i2 = g0kVar.f;
        if (i2 == 0) {
            ch3.d0(objK0);
            ja4Var.m.getClass();
            final boolean zY = cqk.y();
            final String str5 = mzjVar.x;
            String str6 = mzjVar.c;
            String str7 = mzjVar.d;
            if (!zY || str5 == null) {
                str = str3;
                g0kVar2 = g0kVar;
            } else {
                khb khbVar = ja4Var.m;
                int iHashCode = mzjVar.hashCode();
                khbVar.getClass();
                if (Build.VERSION.SDK_INT >= 29) {
                    li8.a(iHashCode, cqk.N(str5));
                    str = str3;
                    g0kVar2 = g0kVar;
                } else {
                    String strN = cqk.N(str5);
                    try {
                        if (cqk.h == null) {
                            str = str3;
                            g0kVar2 = g0kVar;
                            try {
                                cqk.h = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                            } catch (Exception e2) {
                                e = e2;
                                cqk.w(e, "asyncTraceBegin");
                            }
                        } else {
                            str = str3;
                            g0kVar2 = g0kVar;
                        }
                        Method method = cqk.h;
                        if (method == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        method.invoke(null, Long.valueOf(cqk.f), strN, Integer.valueOf(iHashCode));
                    } catch (Exception e3) {
                        e = e3;
                        str = str3;
                        g0kVar2 = g0kVar;
                    }
                }
            }
            final int i3 = 0;
            if (((Boolean) workDatabase.o(new Callable(h0kVar) { // from class: yzj
                public final /* synthetic */ h0k b;

                {
                    this.b = h0kVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i4 = i3;
                    kyj kyjVar = kyj.a;
                    h0k h0kVar2 = this.b;
                    switch (i4) {
                        case 0:
                            mzj mzjVar2 = h0kVar2.a;
                            kyj kyjVar2 = mzjVar2.b;
                            String str8 = mzjVar2.c;
                            if (kyjVar2 != kyjVar) {
                                String str9 = i0k.a;
                                n1g.x().p(str9, str8 + " is not in ENQUEUED state. Nothing more to do");
                                return Boolean.TRUE;
                            }
                            if (mzjVar2.c() || (mzjVar2.b == kyjVar && mzjVar2.k > 0)) {
                                h0kVar2.f.getClass();
                                if (System.currentTimeMillis() < mzjVar2.a()) {
                                    n1g.x().p(i0k.a, "Delaying execution for " + str8 + " because it is being executed before schedule.");
                                    return Boolean.TRUE;
                                }
                            }
                            return Boolean.FALSE;
                        default:
                            qzj qzjVar = h0kVar2.i;
                            String str10 = h0kVar2.c;
                            boolean z = false;
                            if (qzjVar.c(str10) == kyjVar) {
                                qzjVar.g(kyj.b, str10);
                                ((Number) ch3.G(qzjVar.a, false, true, new rh5(str10, 11))).intValue();
                                qzjVar.h(-256, str10);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            })).booleanValue()) {
                return new c0k();
            }
            if (mzjVar.c()) {
                d25VarE = mzjVar.e;
            } else {
                ja4Var.f.getClass();
                String str8 = wg8.a;
                try {
                    overwritingInputMerger = null;
                    try {
                        overwritingInputMerger2 = (OverwritingInputMerger) Class.forName(str7).getDeclaredConstructor(null).newInstance(null);
                    } catch (Exception e4) {
                        e = e4;
                        n1g.x().t(wg8.a, "Trouble instantiating ".concat(str7), e);
                        overwritingInputMerger2 = overwritingInputMerger;
                    }
                } catch (Exception e5) {
                    e = e5;
                    overwritingInputMerger = null;
                }
                if (overwritingInputMerger2 == null) {
                    n1g.x().s(i0k.a, "Could not create Input Merger ".concat(str7));
                    return new a0k();
                }
                ArrayList arrayListG1 = ww3.G1((List) ch3.G(h0kVar.i.a, true, false, new rh5(str4, 10)), Collections.singletonList(mzjVar.e));
                w4 w4Var = new w4(6, false);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = arrayListG1.iterator();
                while (it.hasNext()) {
                    linkedHashMap.putAll(Collections.unmodifiableMap(((d25) it.next()).a));
                }
                w4Var.p(linkedHashMap);
                d25VarE = w4Var.e();
            }
            UUID uuidFromString = UUID.fromString(str4);
            ArrayList arrayList = h0kVar.k;
            int i4 = mzjVar.k;
            Executor executor = ja4Var.a;
            xt4 xt4Var = ja4Var.b;
            gzj gzjVar = new gzj(workDatabase, azjVar);
            hyj hyjVar = new hyj(workDatabase, h0kVar.g, azjVar);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.a = uuidFromString;
            workerParameters.b = d25VarE;
            new HashSet(arrayList);
            workerParameters.c = i4;
            workerParameters.d = executor;
            workerParameters.e = xt4Var;
            workerParameters.f = gzjVar;
            workerParameters.g = hyjVar;
            try {
                final m89 m89VarB = ja4Var.e.B(h0kVar.b, str6, workerParameters);
                final int i5 = 1;
                m89VarB.d = true;
                vo8 vo8Var = (vo8) g0kVar2.getContext().x0(nhb.h);
                vo8Var.Y(new cf7() { // from class: zzj
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) throws Throwable {
                        String str9;
                        Throwable th2 = (Throwable) obj;
                        if (th2 instanceof WorkerStoppedException) {
                            int i6 = ((WorkerStoppedException) th2).a;
                            m89 m89Var = m89VarB;
                            if (m89Var.c.compareAndSet(-256, i6)) {
                                m89Var.b();
                            }
                        }
                        if (zY && (str9 = str5) != null) {
                            h0k h0kVar2 = h0kVar;
                            khb khbVar2 = h0kVar2.e.m;
                            int iHashCode2 = h0kVar2.a.hashCode();
                            khbVar2.getClass();
                            if (Build.VERSION.SDK_INT >= 29) {
                                li8.c(iHashCode2, cqk.N(str9));
                            } else {
                                String strN2 = cqk.N(str9);
                                try {
                                    if (cqk.i == null) {
                                        cqk.i = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                                    }
                                    Method method2 = cqk.i;
                                    if (method2 == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    method2.invoke(null, Long.valueOf(cqk.f), strN2, Integer.valueOf(iHashCode2));
                                } catch (Exception e6) {
                                    cqk.w(e6, "asyncTraceEnd");
                                }
                            }
                        }
                        return sbi.a;
                    }
                });
                if (((Boolean) workDatabase.o(new Callable(h0kVar) { // from class: yzj
                    public final /* synthetic */ h0k b;

                    {
                        this.b = h0kVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i6 = i5;
                        kyj kyjVar = kyj.a;
                        h0k h0kVar2 = this.b;
                        switch (i6) {
                            case 0:
                                mzj mzjVar2 = h0kVar2.a;
                                kyj kyjVar2 = mzjVar2.b;
                                String str9 = mzjVar2.c;
                                if (kyjVar2 != kyjVar) {
                                    String str10 = i0k.a;
                                    n1g.x().p(str10, str9 + " is not in ENQUEUED state. Nothing more to do");
                                    return Boolean.TRUE;
                                }
                                if (mzjVar2.c() || (mzjVar2.b == kyjVar && mzjVar2.k > 0)) {
                                    h0kVar2.f.getClass();
                                    if (System.currentTimeMillis() < mzjVar2.a()) {
                                        n1g.x().p(i0k.a, "Delaying execution for " + str9 + " because it is being executed before schedule.");
                                        return Boolean.TRUE;
                                    }
                                }
                                return Boolean.FALSE;
                            default:
                                qzj qzjVar = h0kVar2.i;
                                String str11 = h0kVar2.c;
                                boolean z = false;
                                if (qzjVar.c(str11) == kyjVar) {
                                    qzjVar.g(kyj.b, str11);
                                    ((Number) ch3.G(qzjVar.a, false, true, new rh5(str11, 11))).intValue();
                                    qzjVar.h(-256, str11);
                                    z = true;
                                }
                                return Boolean.valueOf(z);
                        }
                    }
                })).booleanValue() && !vo8Var.isCancelled()) {
                    xt4 xt4VarM = ch3.m(azjVar.d);
                    try {
                        gz gzVar = new gz(h0kVar, m89VarB, hyjVar, null, 21);
                        g0k g0kVar3 = g0kVar2;
                        g0kVar3.f = 1;
                        objK0 = yab.K0(xt4VarM, gzVar, g0kVar3);
                        b0kVar = hu4.a;
                        if (objK0 != b0kVar) {
                        }
                        return b0kVar;
                    } catch (CancellationException e6) {
                        e = e6;
                        str2 = str;
                        String str9 = i0k.a;
                        n1g.x().K(str9, str2 + " was cancelled", e);
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        String str10 = i0k.a;
                        n1g.x().t(str10, str + " failed because it threw an exception/error", th);
                        ja4Var.getClass();
                        return new a0k();
                    }
                }
                return new c0k();
            } catch (Throwable unused) {
                String str11 = i0k.a;
                n1g.x().s(str11, "Could not create Worker " + str6);
                return new a0k();
            }
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        try {
            ch3.d0(objK0);
            str = str3;
        } catch (CancellationException e7) {
            e = e7;
            str2 = str3;
            String str12 = i0k.a;
            n1g.x().K(str12, str2 + " was cancelled", e);
            throw e;
        } catch (Throwable th3) {
            th = th3;
            str = str3;
            String str13 = i0k.a;
            n1g.x().t(str13, str + " failed because it threw an exception/error", th);
            ja4Var.getClass();
            return new a0k();
        }
        b0kVar = new b0k((l89) objK0);
        return b0kVar;
    }

    public final void b(int i) {
        qzj qzjVar = this.i;
        kyj kyjVar = kyj.a;
        String str = this.c;
        qzjVar.g(kyjVar, str);
        this.f.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        rre rreVar = qzjVar.a;
        ch3.G(rreVar, false, true, new nzj(jCurrentTimeMillis, str, 1));
        ch3.G(rreVar, false, true, new yqe(str, this.a.v, 2));
        qzjVar.f(-1L, str);
        qzjVar.h(i, str);
    }

    public final void c() {
        this.f.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        qzj qzjVar = this.i;
        rre rreVar = qzjVar.a;
        String str = this.c;
        ch3.G(rreVar, false, true, new nzj(jCurrentTimeMillis, str, 1));
        qzjVar.g(kyj.a, str);
        rre rreVar2 = qzjVar.a;
        ((Number) ch3.G(rreVar2, false, true, new rh5(str, 8))).intValue();
        ch3.G(rreVar2, false, true, new yqe(str, this.a.v, 2));
        ch3.G(rreVar2, false, true, new rh5(str, 9));
        qzjVar.f(-1L, str);
    }

    public final void d(l89 l89Var) {
        String str = this.c;
        ArrayList arrayListR0 = xw3.R0(str);
        while (true) {
            boolean zIsEmpty = arrayListR0.isEmpty();
            qzj qzjVar = this.i;
            if (zIsEmpty) {
                d25 d25VarA = ((i89) l89Var).a();
                ch3.G(qzjVar.a, false, true, new yqe(str, this.a.v, 2));
                ch3.G(qzjVar.a, false, true, new ol(27, d25VarA, str));
                return;
            }
            String str2 = (String) cx3.f1(arrayListR0);
            if (qzjVar.c(str2) != kyj.f) {
                qzjVar.g(kyj.d, str2);
            }
            arrayListR0.addAll(this.j.a(str2));
        }
    }
}
