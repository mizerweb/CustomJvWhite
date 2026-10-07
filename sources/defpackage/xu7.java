package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class xu7 extends zvj {
    public xu7(hg4 hg4Var) {
        super(hg4Var);
    }

    @Override // defpackage.qh5
    public final void a(qh5 qh5Var) {
        tp0 tp0Var = (tp0) this.b;
        int i = tp0Var.r0;
        uh5 uh5Var = this.h;
        Iterator it = uh5Var.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((uh5) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            uh5Var.d(i3 + tp0Var.t0);
        } else {
            uh5Var.d(i2 + tp0Var.t0);
        }
    }

    @Override // defpackage.zvj
    public final void d() {
        hg4 hg4Var = this.b;
        if (hg4Var instanceof tp0) {
            uh5 uh5Var = this.h;
            uh5Var.b = true;
            ArrayList arrayList = uh5Var.l;
            tp0 tp0Var = (tp0) hg4Var;
            int i = tp0Var.r0;
            boolean z = tp0Var.s0;
            int i2 = 0;
            if (i == 0) {
                uh5Var.e = 4;
                while (i2 < tp0Var.q0) {
                    hg4 hg4Var2 = tp0Var.p0[i2];
                    if (z || hg4Var2.f0 != 8) {
                        uh5 uh5Var2 = hg4Var2.d.h;
                        uh5Var2.k.add(uh5Var);
                        arrayList.add(uh5Var2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                uh5Var.e = 5;
                while (i2 < tp0Var.q0) {
                    hg4 hg4Var3 = tp0Var.p0[i2];
                    if (z || hg4Var3.f0 != 8) {
                        uh5 uh5Var3 = hg4Var3.d.i;
                        uh5Var3.k.add(uh5Var);
                        arrayList.add(uh5Var3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                uh5Var.e = 6;
                while (i2 < tp0Var.q0) {
                    hg4 hg4Var4 = tp0Var.p0[i2];
                    if (z || hg4Var4.f0 != 8) {
                        uh5 uh5Var4 = hg4Var4.e.h;
                        uh5Var4.k.add(uh5Var);
                        arrayList.add(uh5Var4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            uh5Var.e = 7;
            while (i2 < tp0Var.q0) {
                hg4 hg4Var5 = tp0Var.p0[i2];
                if (z || hg4Var5.f0 != 8) {
                    uh5 uh5Var5 = hg4Var5.e.i;
                    uh5Var5.k.add(uh5Var);
                    arrayList.add(uh5Var5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.zvj
    public final void e() {
        hg4 hg4Var = this.b;
        if (hg4Var instanceof tp0) {
            int i = ((tp0) hg4Var).r0;
            uh5 uh5Var = this.h;
            if (i == 0 || i == 1) {
                hg4Var.X = uh5Var.g;
            } else {
                hg4Var.Y = uh5Var.g;
            }
        }
    }

    @Override // defpackage.zvj
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.zvj
    public final boolean k() {
        return false;
    }

    public final void m(uh5 uh5Var) {
        uh5 uh5Var2 = this.h;
        uh5Var2.k.add(uh5Var);
        uh5Var.l.add(uh5Var2);
    }
}
