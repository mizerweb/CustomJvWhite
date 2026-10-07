package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class of4 {
    public int b;
    public boolean c;
    public final hg4 d;
    public final int e;
    public of4 f;
    public adg i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public of4(hg4 hg4Var, int i) {
        this.d = hg4Var;
        this.e = i;
    }

    public final void a(of4 of4Var, int i, int i2) {
        if (of4Var == null) {
            g();
            return;
        }
        this.f = of4Var;
        if (of4Var.a == null) {
            of4Var.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
    }

    public final void b(int i, wvj wvjVar, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                f0m.e(((of4) it.next()).d, i, arrayList, wvjVar);
            }
        }
    }

    public final int c() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int d() {
        of4 of4Var;
        if (this.d.f0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (of4Var = this.f) == null || of4Var.d.f0 != 8) ? this.g : i;
    }

    public final boolean e() {
        of4 of4Var;
        HashSet<of4> hashSet = this.a;
        if (hashSet != null) {
            for (of4 of4Var2 : hashSet) {
                hg4 hg4Var = of4Var2.d;
                int i = of4Var2.e;
                switch (qt4.D(i)) {
                    case 0:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        of4Var = null;
                        break;
                    case 1:
                        of4Var = hg4Var.J;
                        break;
                    case 2:
                        of4Var = hg4Var.K;
                        break;
                    case 3:
                        of4Var = hg4Var.H;
                        break;
                    case 4:
                        of4Var = hg4Var.I;
                        break;
                    default:
                        c.e(qv1.w(i));
                        return false;
                }
                if (of4Var.f()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f != null;
    }

    public final void g() {
        HashSet hashSet;
        of4 of4Var = this.f;
        if (of4Var != null && (hashSet = of4Var.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void h() {
        adg adgVar = this.i;
        if (adgVar == null) {
            this.i = new adg(1);
        } else {
            adgVar.h();
        }
    }

    public final void i(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.g0 + ":" + qv1.w(this.e);
    }
}
