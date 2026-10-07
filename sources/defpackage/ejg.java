package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ejg implements fli, jmi {
    public final kg2 a;
    public final df0 b;
    public final omi c;
    public kli e;
    public long g;
    public boolean j;
    public Integer k;
    public Integer l;
    public final Object d = new Object();
    public final ArrayList f = new ArrayList();
    public int h = 2;
    public int i = 1;

    public ejg(kg2 kg2Var, df0 df0Var, omi omiVar) {
        this.a = kg2Var;
        this.b = df0Var;
        this.c = omiVar;
    }

    @Override // defpackage.jmi
    public final void a(LinkedHashSet linkedHashSet) {
        yab.i0(this.c.f, null, 0, new j8g((lq4) null, ww3.X1(linkedHashSet), this, 5), 3);
    }

    @Override // defpackage.fli
    public final void b(kli kliVar) {
        this.e = kliVar;
        f();
    }

    public final void c(Exception exc) {
        List listT1;
        synchronized (this.d) {
            listT1 = ww3.T1(this.f);
            this.f.clear();
        }
        Iterator it = listT1.iterator();
        while (it.hasNext()) {
            ((i64) it.next()).j0(exc);
        }
    }

    public final int d(int i, Integer num, boolean z) {
        int iE;
        if (num != null) {
            iE = num.intValue();
        } else if (i != 0) {
            iE = i != 1 ? 1 : 3;
        } else {
            iE = this.b.e();
        }
        if (z && kjl.c(this.a.b)) {
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "State3AControl.invalidate: trying external flash AE mode.");
            }
            iE = 5;
        }
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "State3AControl.getFinalPreferredAeMode: preferAeMode = " + iE);
        }
        return iE;
    }

    public final int e() {
        int iB;
        synchronized (this.d) {
            iB = kjl.b(this.a.b, d(this.h, this.k, this.j));
        }
        return iB;
    }

    public final i64 f() {
        i64 i64Var = new i64();
        vfe vfeVar = new vfe();
        synchronized (this.d) {
            this.f.add(i64Var);
            long j = this.g + 1;
            this.g = j;
            vfeVar.a = j;
        }
        yab.i0(this.c.f, null, 0, new j8g((lq4) null, this, vfeVar, 6), 3);
        return i64Var;
    }

    @Override // defpackage.fli
    public final void reset() {
        synchronized (this.d) {
            this.j = false;
            this.k = null;
            this.l = null;
            this.h = 2;
            this.i = 1;
        }
        f();
    }
}
