package defpackage;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class c84 implements c5a, bv5 {
    public final Object a;
    public ed7 b;
    public av5 c;
    public final /* synthetic */ e84 d;

    public c84(e84 e84Var, Object obj) {
        this.d = e84Var;
        this.b = e84Var.d(null);
        this.c = new av5(e84Var.d.c, 0, null);
        this.a = obj;
    }

    @Override // defpackage.bv5
    public final void a(int i, x4a x4aVar, Exception exc) {
        if (c(i, x4aVar)) {
            this.c.d(exc);
        }
    }

    @Override // defpackage.c5a
    public final void b(int i, x4a x4aVar, uz9 uz9Var) {
        if (c(i, x4aVar)) {
            ed7 ed7Var = this.b;
            uz9 uz9VarF = f(uz9Var, x4aVar);
            x4a x4aVar2 = (x4a) ed7Var.c;
            x4aVar2.getClass();
            ed7Var.D(new oo(ed7Var, x4aVar2, uz9VarF, 15));
        }
    }

    public final boolean c(int i, x4a x4aVar) {
        x4a x4aVarX;
        Object obj = this.a;
        e84 e84Var = this.d;
        if (x4aVar != null) {
            x4aVarX = e84Var.x(obj, x4aVar);
            if (x4aVarX == null) {
                return false;
            }
        } else {
            x4aVarX = null;
        }
        int iZ = e84Var.z(i, obj);
        ed7 ed7Var = this.b;
        if (ed7Var.b != iZ || !Objects.equals((x4a) ed7Var.c, x4aVarX)) {
            this.b = new ed7((CopyOnWriteArrayList) e84Var.c.d, iZ, x4aVarX);
        }
        av5 av5Var = this.c;
        if (av5Var.a == iZ && Objects.equals(av5Var.b, x4aVarX)) {
            return true;
        }
        this.c = new av5(e84Var.d.c, iZ, x4aVarX);
        return true;
    }

    @Override // defpackage.bv5
    public final void d(int i, x4a x4aVar, int i2) {
        if (c(i, x4aVar)) {
            this.c.c(i2);
        }
    }

    @Override // defpackage.c5a
    public final void e(int i, x4a x4aVar, t99 t99Var, uz9 uz9Var, IOException iOException, boolean z) {
        if (c(i, x4aVar)) {
            ed7 ed7Var = this.b;
            uz9 uz9VarF = f(uz9Var, x4aVar);
            ed7Var.getClass();
            ed7Var.D(new zj1(ed7Var, t99Var, uz9VarF, iOException, z, 4));
        }
    }

    public final uz9 f(uz9 uz9Var, x4a x4aVar) {
        long j = uz9Var.f;
        e84 e84Var = this.d;
        Object obj = this.a;
        long jY = e84Var.y(obj, j, x4aVar);
        long j2 = uz9Var.g;
        long jY2 = e84Var.y(obj, j2, x4aVar);
        return (jY == j && jY2 == j2) ? uz9Var : new uz9(uz9Var.a, uz9Var.b, uz9Var.c, uz9Var.d, uz9Var.e, jY, jY2);
    }

    @Override // defpackage.bv5
    public final void i(int i, x4a x4aVar) {
        if (c(i, x4aVar)) {
            this.c.b();
        }
    }

    @Override // defpackage.c5a
    public final void n(int i, x4a x4aVar, t99 t99Var, uz9 uz9Var, int i2) {
        if (c(i, x4aVar)) {
            ed7 ed7Var = this.b;
            uz9 uz9VarF = f(uz9Var, x4aVar);
            ed7Var.getClass();
            ed7Var.D(new e75(ed7Var, t99Var, uz9VarF, i2));
        }
    }

    @Override // defpackage.c5a
    public final void o(int i, x4a x4aVar, uz9 uz9Var) {
        if (c(i, x4aVar)) {
            ed7 ed7Var = this.b;
            uz9 uz9VarF = f(uz9Var, x4aVar);
            ed7Var.getClass();
            ed7Var.D(new fv9(ed7Var, 12, uz9VarF));
        }
    }

    @Override // defpackage.c5a
    public final void p(int i, x4a x4aVar, t99 t99Var, uz9 uz9Var) {
        if (c(i, x4aVar)) {
            ed7 ed7Var = this.b;
            uz9 uz9VarF = f(uz9Var, x4aVar);
            ed7Var.getClass();
            ed7Var.D(new a5a(ed7Var, t99Var, uz9VarF, 1));
        }
    }

    @Override // defpackage.c5a
    public final void q(int i, x4a x4aVar, t99 t99Var, uz9 uz9Var) {
        if (c(i, x4aVar)) {
            ed7 ed7Var = this.b;
            uz9 uz9VarF = f(uz9Var, x4aVar);
            ed7Var.getClass();
            ed7Var.D(new a5a(ed7Var, t99Var, uz9VarF, 0));
        }
    }

    @Override // defpackage.bv5
    public final void r(int i, x4a x4aVar) {
        if (c(i, x4aVar)) {
            this.c.e();
        }
    }

    @Override // defpackage.bv5
    public final void s(int i, x4a x4aVar, iw8 iw8Var) {
        if (c(i, x4aVar)) {
            this.c.a(iw8Var);
        }
    }
}
