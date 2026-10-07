package defpackage;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class k5a implements c5a, bv5 {
    public final m5a a;
    public final /* synthetic */ n5a b;

    public k5a(n5a n5aVar, m5a m5aVar) {
        this.b = n5aVar;
        this.a = m5aVar;
    }

    @Override // defpackage.bv5
    public final void a(int i, x4a x4aVar, Exception exc) {
        Pair pairC = c(i, x4aVar);
        if (pairC != null) {
            ((sfh) this.b.j).f(new d86(this, pairC, exc, 16));
        }
    }

    @Override // defpackage.c5a
    public final void b(int i, x4a x4aVar, uz9 uz9Var) {
        Pair pairC = c(i, x4aVar);
        if (pairC != null) {
            ((sfh) this.b.j).f(new g5a(this, pairC, uz9Var, 0));
        }
    }

    public final Pair c(int i, x4a x4aVar) {
        x4a x4aVarA;
        m5a m5aVar = this.a;
        x4a x4aVar2 = null;
        if (x4aVar != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= m5aVar.c.size()) {
                    x4aVarA = null;
                    break;
                }
                if (((x4a) m5aVar.c.get(i2)).d == x4aVar.d) {
                    Object obj = x4aVar.a;
                    Object obj2 = m5aVar.b;
                    int i3 = l0.g;
                    x4aVarA = x4aVar.a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (x4aVarA == null) {
                return null;
            }
            x4aVar2 = x4aVarA;
        }
        return Pair.create(Integer.valueOf(i + m5aVar.d), x4aVar2);
    }

    @Override // defpackage.bv5
    public final void d(int i, x4a x4aVar, int i2) {
        Pair pairC = c(i, x4aVar);
        if (pairC != null) {
            ((sfh) this.b.j).f(new uc2(this, pairC, i2, 9));
        }
    }

    @Override // defpackage.c5a
    public final void e(int i, x4a x4aVar, t99 t99Var, uz9 uz9Var, IOException iOException, boolean z) {
        Pair pairC = c(i, x4aVar);
        if (pairC != null) {
            ((sfh) this.b.j).f(new i5a(this, pairC, t99Var, uz9Var, iOException, z, 0));
        }
    }

    @Override // defpackage.bv5
    public final void i(int i, x4a x4aVar) {
        Pair pairC = c(i, x4aVar);
        if (pairC != null) {
            ((sfh) this.b.j).f(new j5a(this, pairC, 1));
        }
    }

    @Override // defpackage.c5a
    public final void n(int i, x4a x4aVar, t99 t99Var, uz9 uz9Var, int i2) {
        Pair pairC = c(i, x4aVar);
        if (pairC != null) {
            ((sfh) this.b.j).f(new vk1(this, pairC, t99Var, uz9Var, i2, 3));
        }
    }

    @Override // defpackage.c5a
    public final void o(int i, x4a x4aVar, uz9 uz9Var) {
        Pair pairC = c(i, x4aVar);
        if (pairC != null) {
            ((sfh) this.b.j).f(new g5a(this, pairC, uz9Var, 1));
        }
    }

    @Override // defpackage.c5a
    public final void p(int i, x4a x4aVar, t99 t99Var, uz9 uz9Var) {
        Pair pairC = c(i, x4aVar);
        if (pairC != null) {
            ((sfh) this.b.j).f(new h5a(this, pairC, t99Var, uz9Var, 0));
        }
    }

    @Override // defpackage.c5a
    public final void q(int i, x4a x4aVar, t99 t99Var, uz9 uz9Var) {
        Pair pairC = c(i, x4aVar);
        if (pairC != null) {
            ((sfh) this.b.j).f(new h5a(this, pairC, t99Var, uz9Var, 1));
        }
    }

    @Override // defpackage.bv5
    public final void r(int i, x4a x4aVar) {
        Pair pairC = c(i, x4aVar);
        if (pairC != null) {
            ((sfh) this.b.j).f(new j5a(this, pairC, 0));
        }
    }

    @Override // defpackage.bv5
    public final void s(int i, x4a x4aVar, iw8 iw8Var) {
        Pair pairC = c(i, x4aVar);
        if (pairC != null) {
            ((sfh) this.b.j).f(new d86(this, pairC, iw8Var, 15));
        }
    }
}
