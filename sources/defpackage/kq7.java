package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kq7 implements a3f, qtb, md6 {
    public static final String o = n1g.Z("GreedyScheduler");
    public final Context a;
    public final qg5 c;
    public boolean d;
    public final ijd g;
    public final fbc h;
    public final ja4 i;
    public Boolean k;
    public final jw8 l;
    public final azj m;
    public final gvb n;
    public final HashMap b = new HashMap();
    public final Object e = new Object();
    public final fbc f = new fbc(new oj9(1));
    public final HashMap j = new HashMap();

    public kq7(Context context, ja4 ja4Var, azh azhVar, ijd ijdVar, fbc fbcVar, azj azjVar) {
        this.a = context;
        t3a t3aVar = ja4Var.g;
        this.c = new qg5(this, t3aVar, ja4Var.d);
        gvb gvbVar = new gvb();
        gvbVar.b = t3aVar;
        gvbVar.c = fbcVar;
        gvbVar.d = new Object();
        gvbVar.a = new LinkedHashMap();
        this.n = gvbVar;
        this.m = azjVar;
        this.l = new jw8(azhVar);
        this.i = ja4Var;
        this.g = ijdVar;
        this.h = fbcVar;
    }

    @Override // defpackage.md6
    public final void a(iyj iyjVar, boolean z) {
        vo8 vo8Var;
        kig kigVarV = this.f.v(iyjVar);
        if (kigVarV != null) {
            this.n.h(kigVarV);
        }
        synchronized (this.e) {
            vo8Var = (vo8) this.b.remove(iyjVar);
        }
        if (vo8Var != null) {
            n1g.x().p(o, "Stopping tracking for " + iyjVar);
            vo8Var.b(null);
        }
        if (z) {
            return;
        }
        synchronized (this.e) {
            this.j.remove(iyjVar);
        }
    }

    @Override // defpackage.a3f
    public final void b(String str) {
        List<kig> listB;
        Runnable runnable;
        String str2 = o;
        if (this.k == null) {
            this.k = Boolean.valueOf(cjd.a(this.a));
        }
        if (!this.k.booleanValue()) {
            n1g.x().J(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.d) {
            this.g.a(this);
            this.d = true;
        }
        n1g.x().p(str2, "Cancelling work ID " + str);
        qg5 qg5Var = this.c;
        if (qg5Var != null && (runnable = (Runnable) qg5Var.d.remove(str)) != null) {
            ((Handler) qg5Var.b.a).removeCallbacks(runnable);
        }
        fbc fbcVar = this.f;
        synchronized (fbcVar.c) {
            listB = ((oj9) fbcVar.b).b(str);
        }
        for (kig kigVar : listB) {
            this.n.h(kigVar);
            this.h.A(kigVar, -512);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [lq4, vt4] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // defpackage.a3f
    public final void c(mzj... mzjVarArr) {
        ?? r8;
        ?? r4;
        long jMax;
        if (this.k == null) {
            this.k = Boolean.valueOf(cjd.a(this.a));
        }
        if (!this.k.booleanValue()) {
            n1g.x().J(o, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.d) {
            this.g.a(this);
            this.d = true;
        }
        HashSet<mzj> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int length = mzjVarArr.length;
        int i = 0;
        while (true) {
            int i2 = 3;
            r8 = 0;
            ?? r9 = 0;
            if (i >= length) {
                break;
            }
            mzj mzjVar = mzjVarArr[i];
            if (!this.f.g(wk8.n(mzjVar))) {
                synchronized (this.e) {
                    try {
                        iyj iyjVarN = wk8.n(mzjVar);
                        jq7 jq7Var = (jq7) this.j.get(iyjVarN);
                        if (jq7Var == null) {
                            int i3 = mzjVar.k;
                            this.i.d.getClass();
                            jq7Var = new jq7(i3, System.currentTimeMillis());
                            this.j.put(iyjVarN, jq7Var);
                        }
                        jMax = (((long) Math.max((mzjVar.k - jq7Var.a) - 5, 0)) * WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) + jq7Var.b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long jMax2 = Math.max(mzjVar.a(), jMax);
                this.i.d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (mzjVar.b == kyj.a) {
                    if (jCurrentTimeMillis < jMax2) {
                        qg5 qg5Var = this.c;
                        if (qg5Var != null) {
                            t3a t3aVar = qg5Var.b;
                            HashMap map = qg5Var.d;
                            Runnable runnable = (Runnable) map.remove(mzjVar.a);
                            if (runnable != null) {
                                ((Handler) t3aVar.a).removeCallbacks(runnable);
                            }
                            p0 p0Var = new p0(qg5Var, i2, mzjVar);
                            map.put(mzjVar.a, p0Var);
                            qg5Var.c.getClass();
                            ((Handler) t3aVar.a).postDelayed(p0Var, jMax2 - System.currentTimeMillis());
                        }
                    } else if (!cqk.d(kg4.j, mzjVar.j)) {
                        kg4 kg4Var = mzjVar.j;
                        if (kg4Var.d) {
                            n1g.x().p(o, "Ignoring " + mzjVar + ". Requires device idle.");
                        } else if (kg4Var.i.isEmpty()) {
                            hashSet.add(mzjVar);
                            hashSet2.add(mzjVar.a);
                        } else {
                            n1g.x().p(o, "Ignoring " + mzjVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f.g(wk8.n(mzjVar))) {
                        n1g.x().p(o, "Starting work for " + mzjVar.a);
                        kig kigVarD = this.f.D(wk8.n(mzjVar));
                        this.n.T(kigVarD);
                        fbc fbcVar = this.h;
                        ((azj) fbcVar.c).a(new s41(fbcVar, kigVarD, r9 == true ? 1 : 0, i2));
                    }
                }
            }
            i++;
        }
        synchronized (this.e) {
            try {
                if (!hashSet.isEmpty()) {
                    String strJoin = TextUtils.join(",", hashSet2);
                    n1g.x().p(o, "Starting tracking for " + strJoin);
                    for (mzj mzjVar2 : hashSet) {
                        iyj iyjVarN2 = wk8.n(mzjVar2);
                        if (this.b.containsKey(iyjVarN2)) {
                            r4 = r8;
                        } else {
                            jw8 jw8Var = this.l;
                            xt4 xt4Var = this.m.b;
                            String str = byj.a;
                            r4 = r8;
                            this.b.put(iyjVarN2, yab.i0(cqk.a(xt4Var), r4, 0, new rjj(jw8Var, mzjVar2, this, r4, 11), 3));
                        }
                        r8 = r4;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.qtb
    public final void d(mzj mzjVar, og4 og4Var) {
        iyj iyjVarN = wk8.n(mzjVar);
        boolean z = og4Var instanceof mg4;
        fbc fbcVar = this.h;
        gvb gvbVar = this.n;
        String str = o;
        fbc fbcVar2 = this.f;
        if (!z) {
            n1g.x().p(str, "Constraints not met: Cancelling work ID " + iyjVarN);
            kig kigVarV = fbcVar2.v(iyjVarN);
            if (kigVarV != null) {
                gvbVar.h(kigVarV);
                fbcVar.A(kigVarV, ((ng4) og4Var).a());
                return;
            }
            return;
        }
        if (fbcVar2.g(iyjVarN)) {
            return;
        }
        n1g.x().p(str, "Constraints met: Scheduling work ID " + iyjVarN);
        kig kigVarD = fbcVar2.D(iyjVarN);
        gvbVar.T(kigVarD);
        ((azj) fbcVar.c).a(new s41(fbcVar, kigVarD, null, 3));
    }

    @Override // defpackage.a3f
    public final boolean e() {
        return false;
    }
}
