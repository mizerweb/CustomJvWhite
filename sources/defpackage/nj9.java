package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class nj9 implements ru4, taa {
    public final hle a;
    public final hle b;
    public final iri c;
    public final saa d;
    public final oah e;
    public uaa f;
    public long g;

    public nj9(iri iriVar, saa saaVar, oah oahVar) {
        new WeakHashMap();
        this.c = iriVar;
        this.a = new hle(new w4(this, iriVar));
        this.b = new hle(new w4(this, iriVar));
        this.d = saaVar;
        this.e = oahVar;
        uaa uaaVar = (uaa) oahVar.get();
        oc9.q(uaaVar, "mMemoryCacheParamsSupplier returned null");
        this.f = uaaVar;
        this.g = SystemClock.uptimeMillis();
    }

    public static void k(qu4 qu4Var) {
        c7k c7kVar;
        if (qu4Var == null || (c7kVar = qu4Var.e) == null) {
            return;
        }
        c7kVar.w(qu4Var.a, false);
    }

    public static void l(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                k((qu4) it.next());
            }
        }
    }

    @Override // defpackage.taa
    public final synchronized boolean a(ck0 ck0Var) {
        return !this.b.f(ck0Var).isEmpty();
    }

    @Override // defpackage.taa
    public final au3 b(v71 v71Var, au3 au3Var) {
        return f(v71Var, au3Var, null);
    }

    @Override // defpackage.taa
    public final int c(gdd gddVar) {
        ArrayList arrayListO;
        ArrayList arrayListO2;
        synchronized (this) {
            arrayListO = this.a.o(gddVar);
            arrayListO2 = this.b.o(gddVar);
            h(arrayListO2);
        }
        i(arrayListO2);
        l(arrayListO);
        m();
        j();
        return arrayListO2.size();
    }

    @Override // defpackage.sba
    public final void e(qba qbaVar) {
        ArrayList arrayListP;
        double dJ = this.d.j(qbaVar);
        synchronized (this) {
            arrayListP = p(Integer.MAX_VALUE, Math.max(0, ((int) ((1.0d - dJ) * ((double) this.b.h()))) - g()));
            h(arrayListP);
        }
        i(arrayListP);
        l(arrayListP);
        m();
        j();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    public final g95 f(v71 v71Var, au3 au3Var, c7k c7kVar) {
        qu4 qu4Var;
        g95 g95VarN;
        au3 au3VarO;
        boolean z;
        au3Var.getClass();
        m();
        synchronized (this) {
            qu4Var = (qu4) this.a.m(v71Var);
            qu4 qu4Var2 = (qu4) this.b.m(v71Var);
            g95VarN = null;
            if (qu4Var2 != null) {
                synchronized (this) {
                    oc9.r(!qu4Var2.d);
                    qu4Var2.d = true;
                    au3VarO = o(qu4Var2);
                }
                au3.E(au3VarO);
                k(qu4Var);
                j();
                return g95VarN;
            }
            au3VarO = null;
            int iD = this.c.d(au3Var.K());
            synchronized (this) {
                if (iD <= this.f.d) {
                    synchronized (this) {
                        z = this.b.e() - this.a.e() <= this.f.b - 1 && g() <= this.f.a - iD;
                    }
                }
            }
        }
        if (z) {
            qu4 qu4Var3 = new qu4(v71Var, au3Var, c7kVar, -1);
            this.b.k(v71Var, qu4Var3);
            g95VarN = n(qu4Var3);
        }
        au3.E(au3VarO);
        k(qu4Var);
        j();
        return g95VarN;
    }

    public final synchronized int g() {
        return this.b.h() - this.a.h();
    }

    @Override // defpackage.taa
    public final au3 get(Object obj) {
        qu4 qu4Var;
        Object obj2;
        g95 g95VarN;
        obj.getClass();
        synchronized (this) {
            try {
                qu4Var = (qu4) this.a.m(obj);
                hle hleVar = this.b;
                synchronized (hleVar) {
                    obj2 = ((LinkedHashMap) hleVar.d).get(obj);
                }
                qu4 qu4Var2 = (qu4) obj2;
                g95VarN = qu4Var2 != null ? n(qu4Var2) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        k(qu4Var);
        m();
        j();
        return g95VarN;
    }

    @Override // defpackage.taa
    public final synchronized int getCount() {
        return this.b.e();
    }

    @Override // defpackage.taa
    public final synchronized int getSizeInBytes() {
        return this.b.h();
    }

    public final synchronized void h(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                qu4 qu4Var = (qu4) it.next();
                synchronized (this) {
                    qu4Var.getClass();
                    oc9.r(!qu4Var.d);
                    qu4Var.d = true;
                }
            }
        }
    }

    public final void i(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                au3.E(o((qu4) it.next()));
            }
        }
    }

    public final void j() {
        int i;
        int iE;
        synchronized (this) {
            this.f.getClass();
            i = this.f.b;
            synchronized (this) {
                iE = this.b.e() - this.a.e();
            }
            i(arrayListP);
            l(arrayListP);
        }
        int iMin = Math.min(Integer.MAX_VALUE, i - iE);
        uaa uaaVar = this.f;
        ArrayList arrayListP = p(iMin, Math.min(uaaVar.c, uaaVar.a - g()));
        h(arrayListP);
        i(arrayListP);
        l(arrayListP);
    }

    public final synchronized void m() {
        long j = this.g;
        this.f.getClass();
        if (j + 300000 > SystemClock.uptimeMillis()) {
            return;
        }
        this.g = SystemClock.uptimeMillis();
        uaa uaaVar = (uaa) this.e.get();
        oc9.q(uaaVar, "mMemoryCacheParamsSupplier returned null");
        this.f = uaaVar;
    }

    public final synchronized g95 n(qu4 qu4Var) {
        synchronized (this) {
            oc9.r(!qu4Var.d);
            qu4Var.c++;
        }
        return au3.k0(qu4Var.b.K(), new qg7(this, qu4Var, false, 8), au3.f);
        return au3.k0(qu4Var.b.K(), new qg7(this, qu4Var, false, 8), au3.f);
    }

    public final synchronized au3 o(qu4 qu4Var) {
        qu4Var.getClass();
        return (qu4Var.d && qu4Var.c == 0) ? qu4Var.b : null;
    }

    public final synchronized ArrayList p(int i, int i2) {
        Object next;
        int iMax = Math.max(i, 0);
        int iMax2 = Math.max(i2, 0);
        if (this.a.e() <= iMax && this.a.h() <= iMax2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (this.a.e() <= iMax && this.a.h() <= iMax2) {
                return arrayList;
            }
            hle hleVar = this.a;
            synchronized (hleVar) {
                next = ((LinkedHashMap) hleVar.d).isEmpty() ? null : ((LinkedHashMap) hleVar.d).keySet().iterator().next();
            }
            if (next == null) {
                throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.a.e()), Integer.valueOf(this.a.h())));
            }
            this.a.m(next);
            arrayList.add((qu4) this.b.m(next));
        }
    }
}
